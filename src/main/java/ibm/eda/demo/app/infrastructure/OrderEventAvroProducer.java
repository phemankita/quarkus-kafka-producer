package ibm.eda.demo.app.infrastructure;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.inject.Singleton;

import org.apache.avro.Schema;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.jboss.logging.Logger;

import ibm.eda.demo.app.infrastructure.events.EventEmitter;
import ibm.eda.demo.app.infrastructure.events.OrderEvent;
import io.apicurio.registry.client.RegistryRestClient;
import io.apicurio.registry.client.RegistryRestClientFactory;

@Singleton
@AvroEmitter
public class OrderEventAvroProducer implements EventEmitter {
	
    Logger logger = Logger.getLogger(OrderEventProducer.class.getName());

    private KafkaProducer<String,OrderEvent> kafkaProducer = null;
    private KafkaWithSchemaRegistryConfiguration configuration = null;
    private Schema avroSchema;
    
    public Schema getAvroSchema() {
		return avroSchema;
	}

	public void setAvroSchema(Schema avroSchema) {
		this.avroSchema = avroSchema;
	}

    public OrderEventAvroProducer() {
        super();
        configuration = new KafkaWithSchemaRegistryConfiguration();
        Properties props = configuration.getAvroProducerProperties("OrderProducer_1");
        kafkaProducer = new KafkaProducer<String, OrderEvent>(props);
        try {
            Map<String,Object> config = props.entrySet().stream().collect(Collectors.toMap(
		            e -> String.valueOf(e.getKey()),
		            e -> String.valueOf(e.getValue())));
            RegistryRestClient client = RegistryRestClientFactory.create(configuration.REGISTRY_URL, config);
            setAvroSchema(new Schema.Parser().parse(client.getLatestArtifact("OrderEvent")));
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }

    public void sendOrderEvents(List<OrderEvent> l) {
        for (OrderEvent t : l) {
            emit(t);
        }
    }

    public void emit(OrderEvent oevent) { 
        ProducerRecord<String, OrderEvent> producerRecord = new ProducerRecord<String, OrderEvent>(
                configuration.getTopicName(), oevent.getOrderID(), oevent);
       
        logger.info("sending to " + configuration.getTopicName() + " item " + producerRecord
        .toString());
        try {
        	logger.info("kafka producer " + this.kafkaProducer.toString());
            this.kafkaProducer.send(producerRecord, new Callback() {

                @Override
                public void onCompletion(RecordMetadata metadata, Exception exception) {
                	System.out.println("I am in");
                    if (exception != null) {
                        exception.printStackTrace();
                    } else {
                        logger.info("The offset of the record just sent is: " + metadata.offset());
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            safeClose();
        }
        
    }

    
    @Override
    public void safeClose(){
        kafkaProducer.flush();
        kafkaProducer.close();
        kafkaProducer = null;
    }

}
