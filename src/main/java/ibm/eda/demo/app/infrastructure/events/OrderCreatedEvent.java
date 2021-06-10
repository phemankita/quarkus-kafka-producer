/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ibm.eda.demo.app.infrastructure.events;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OrderCreatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 347806762876788791L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderCreatedEvent\",\"namespace\":\"ibm.eda.demo.app.infrastructure.events\",\"fields\":[{\"name\":\"orderID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Unique ID from source system\"},{\"name\":\"productID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Unique ID for the product as defined in product catalog\"},{\"name\":\"customerID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Unique ID for the customer organization\"},{\"name\":\"quantity\",\"type\":\"int\",\"doc\":\"Quantity ordered\"},{\"name\":\"status\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Status of the order.\"},{\"name\":\"shippingAddress\",\"type\":{\"type\":\"record\",\"name\":\"Address\",\"fields\":[{\"name\":\"street\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Street name with number within the street\"},{\"name\":\"city\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"city\"},{\"name\":\"state\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"State code or name\"},{\"name\":\"country\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Country\"},{\"name\":\"zipcode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Zipcode\"}]},\"doc\":\"Address to ship the ordered items\",\"namespace\":\"ibm.eda.demo.app.infrastructure.events\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderCreatedEvent> ENCODER =
      new BinaryMessageEncoder<OrderCreatedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderCreatedEvent> DECODER =
      new BinaryMessageDecoder<OrderCreatedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderCreatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderCreatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderCreatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderCreatedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderCreatedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderCreatedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderCreatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderCreatedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Unique ID from source system */
   private java.lang.String orderID;
  /** Unique ID for the product as defined in product catalog */
   private java.lang.String productID;
  /** Unique ID for the customer organization */
   private java.lang.String customerID;
  /** Quantity ordered */
   private int quantity;
  /** Status of the order. */
   private java.lang.String status;
  /** Address to ship the ordered items */
   private ibm.eda.demo.app.infrastructure.events.Address shippingAddress;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderCreatedEvent() {}

  /**
   * All-args constructor.
   * @param orderID Unique ID from source system
   * @param productID Unique ID for the product as defined in product catalog
   * @param customerID Unique ID for the customer organization
   * @param quantity Quantity ordered
   * @param status Status of the order.
   * @param shippingAddress Address to ship the ordered items
   */
  public OrderCreatedEvent(java.lang.String orderID, java.lang.String productID, java.lang.String customerID, java.lang.Integer quantity, java.lang.String status, ibm.eda.demo.app.infrastructure.events.Address shippingAddress) {
    this.orderID = orderID;
    this.productID = productID;
    this.customerID = customerID;
    this.quantity = quantity;
    this.status = status;
    this.shippingAddress = shippingAddress;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orderID;
    case 1: return productID;
    case 2: return customerID;
    case 3: return quantity;
    case 4: return status;
    case 5: return shippingAddress;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orderID = value$ != null ? value$.toString() : null; break;
    case 1: productID = value$ != null ? value$.toString() : null; break;
    case 2: customerID = value$ != null ? value$.toString() : null; break;
    case 3: quantity = (java.lang.Integer)value$; break;
    case 4: status = value$ != null ? value$.toString() : null; break;
    case 5: shippingAddress = (ibm.eda.demo.app.infrastructure.events.Address)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'orderID' field.
   * @return Unique ID from source system
   */
  public java.lang.String getOrderID() {
    return orderID;
  }


  /**
   * Sets the value of the 'orderID' field.
   * Unique ID from source system
   * @param value the value to set.
   */
  public void setOrderID(java.lang.String value) {
    this.orderID = value;
  }

  /**
   * Gets the value of the 'productID' field.
   * @return Unique ID for the product as defined in product catalog
   */
  public java.lang.String getProductID() {
    return productID;
  }


  /**
   * Sets the value of the 'productID' field.
   * Unique ID for the product as defined in product catalog
   * @param value the value to set.
   */
  public void setProductID(java.lang.String value) {
    this.productID = value;
  }

  /**
   * Gets the value of the 'customerID' field.
   * @return Unique ID for the customer organization
   */
  public java.lang.String getCustomerID() {
    return customerID;
  }


  /**
   * Sets the value of the 'customerID' field.
   * Unique ID for the customer organization
   * @param value the value to set.
   */
  public void setCustomerID(java.lang.String value) {
    this.customerID = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return Quantity ordered
   */
  public int getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * Quantity ordered
   * @param value the value to set.
   */
  public void setQuantity(int value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return Status of the order.
   */
  public java.lang.String getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * Status of the order.
   * @param value the value to set.
   */
  public void setStatus(java.lang.String value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'shippingAddress' field.
   * @return Address to ship the ordered items
   */
  public ibm.eda.demo.app.infrastructure.events.Address getShippingAddress() {
    return shippingAddress;
  }


  /**
   * Sets the value of the 'shippingAddress' field.
   * Address to ship the ordered items
   * @param value the value to set.
   */
  public void setShippingAddress(ibm.eda.demo.app.infrastructure.events.Address value) {
    this.shippingAddress = value;
  }

  /**
   * Creates a new OrderCreatedEvent RecordBuilder.
   * @return A new OrderCreatedEvent RecordBuilder
   */
  public static ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder newBuilder() {
    return new ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder();
  }

  /**
   * Creates a new OrderCreatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderCreatedEvent RecordBuilder
   */
  public static ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder newBuilder(ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder other) {
    if (other == null) {
      return new ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder();
    } else {
      return new ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new OrderCreatedEvent RecordBuilder by copying an existing OrderCreatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new OrderCreatedEvent RecordBuilder
   */
  public static ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder newBuilder(ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent other) {
    if (other == null) {
      return new ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder();
    } else {
      return new ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderCreatedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderCreatedEvent>
    implements org.apache.avro.data.RecordBuilder<OrderCreatedEvent> {

    /** Unique ID from source system */
    private java.lang.String orderID;
    /** Unique ID for the product as defined in product catalog */
    private java.lang.String productID;
    /** Unique ID for the customer organization */
    private java.lang.String customerID;
    /** Quantity ordered */
    private int quantity;
    /** Status of the order. */
    private java.lang.String status;
    /** Address to ship the ordered items */
    private ibm.eda.demo.app.infrastructure.events.Address shippingAddress;
    private ibm.eda.demo.app.infrastructure.events.Address.Builder shippingAddressBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderID)) {
        this.orderID = data().deepCopy(fields()[0].schema(), other.orderID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.productID)) {
        this.productID = data().deepCopy(fields()[1].schema(), other.productID);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.customerID)) {
        this.customerID = data().deepCopy(fields()[2].schema(), other.customerID);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.quantity)) {
        this.quantity = data().deepCopy(fields()[3].schema(), other.quantity);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.status)) {
        this.status = data().deepCopy(fields()[4].schema(), other.status);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.shippingAddress)) {
        this.shippingAddress = data().deepCopy(fields()[5].schema(), other.shippingAddress);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasShippingAddressBuilder()) {
        this.shippingAddressBuilder = ibm.eda.demo.app.infrastructure.events.Address.newBuilder(other.getShippingAddressBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing OrderCreatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.orderID)) {
        this.orderID = data().deepCopy(fields()[0].schema(), other.orderID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productID)) {
        this.productID = data().deepCopy(fields()[1].schema(), other.productID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.customerID)) {
        this.customerID = data().deepCopy(fields()[2].schema(), other.customerID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.quantity)) {
        this.quantity = data().deepCopy(fields()[3].schema(), other.quantity);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.status)) {
        this.status = data().deepCopy(fields()[4].schema(), other.status);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.shippingAddress)) {
        this.shippingAddress = data().deepCopy(fields()[5].schema(), other.shippingAddress);
        fieldSetFlags()[5] = true;
      }
      this.shippingAddressBuilder = null;
    }

    /**
      * Gets the value of the 'orderID' field.
      * Unique ID from source system
      * @return The value.
      */
    public java.lang.String getOrderID() {
      return orderID;
    }


    /**
      * Sets the value of the 'orderID' field.
      * Unique ID from source system
      * @param value The value of 'orderID'.
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder setOrderID(java.lang.String value) {
      validate(fields()[0], value);
      this.orderID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orderID' field has been set.
      * Unique ID from source system
      * @return True if the 'orderID' field has been set, false otherwise.
      */
    public boolean hasOrderID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'orderID' field.
      * Unique ID from source system
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder clearOrderID() {
      orderID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'productID' field.
      * Unique ID for the product as defined in product catalog
      * @return The value.
      */
    public java.lang.String getProductID() {
      return productID;
    }


    /**
      * Sets the value of the 'productID' field.
      * Unique ID for the product as defined in product catalog
      * @param value The value of 'productID'.
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder setProductID(java.lang.String value) {
      validate(fields()[1], value);
      this.productID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'productID' field has been set.
      * Unique ID for the product as defined in product catalog
      * @return True if the 'productID' field has been set, false otherwise.
      */
    public boolean hasProductID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'productID' field.
      * Unique ID for the product as defined in product catalog
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder clearProductID() {
      productID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerID' field.
      * Unique ID for the customer organization
      * @return The value.
      */
    public java.lang.String getCustomerID() {
      return customerID;
    }


    /**
      * Sets the value of the 'customerID' field.
      * Unique ID for the customer organization
      * @param value The value of 'customerID'.
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder setCustomerID(java.lang.String value) {
      validate(fields()[2], value);
      this.customerID = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'customerID' field has been set.
      * Unique ID for the customer organization
      * @return True if the 'customerID' field has been set, false otherwise.
      */
    public boolean hasCustomerID() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'customerID' field.
      * Unique ID for the customer organization
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder clearCustomerID() {
      customerID = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * Quantity ordered
      * @return The value.
      */
    public int getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * Quantity ordered
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder setQuantity(int value) {
      validate(fields()[3], value);
      this.quantity = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * Quantity ordered
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'quantity' field.
      * Quantity ordered
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder clearQuantity() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * Status of the order.
      * @return The value.
      */
    public java.lang.String getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * Status of the order.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder setStatus(java.lang.String value) {
      validate(fields()[4], value);
      this.status = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * Status of the order.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'status' field.
      * Status of the order.
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder clearStatus() {
      status = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'shippingAddress' field.
      * Address to ship the ordered items
      * @return The value.
      */
    public ibm.eda.demo.app.infrastructure.events.Address getShippingAddress() {
      return shippingAddress;
    }


    /**
      * Sets the value of the 'shippingAddress' field.
      * Address to ship the ordered items
      * @param value The value of 'shippingAddress'.
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder setShippingAddress(ibm.eda.demo.app.infrastructure.events.Address value) {
      validate(fields()[5], value);
      this.shippingAddressBuilder = null;
      this.shippingAddress = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'shippingAddress' field has been set.
      * Address to ship the ordered items
      * @return True if the 'shippingAddress' field has been set, false otherwise.
      */
    public boolean hasShippingAddress() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'shippingAddress' field and creates one if it doesn't exist yet.
     * Address to ship the ordered items
     * @return This builder.
     */
    public ibm.eda.demo.app.infrastructure.events.Address.Builder getShippingAddressBuilder() {
      if (shippingAddressBuilder == null) {
        if (hasShippingAddress()) {
          setShippingAddressBuilder(ibm.eda.demo.app.infrastructure.events.Address.newBuilder(shippingAddress));
        } else {
          setShippingAddressBuilder(ibm.eda.demo.app.infrastructure.events.Address.newBuilder());
        }
      }
      return shippingAddressBuilder;
    }

    /**
     * Sets the Builder instance for the 'shippingAddress' field
     * Address to ship the ordered items
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder setShippingAddressBuilder(ibm.eda.demo.app.infrastructure.events.Address.Builder value) {
      clearShippingAddress();
      shippingAddressBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'shippingAddress' field has an active Builder instance
     * Address to ship the ordered items
     * @return True if the 'shippingAddress' field has an active Builder instance
     */
    public boolean hasShippingAddressBuilder() {
      return shippingAddressBuilder != null;
    }

    /**
      * Clears the value of the 'shippingAddress' field.
      * Address to ship the ordered items
      * @return This builder.
      */
    public ibm.eda.demo.app.infrastructure.events.OrderCreatedEvent.Builder clearShippingAddress() {
      shippingAddress = null;
      shippingAddressBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderCreatedEvent build() {
      try {
        OrderCreatedEvent record = new OrderCreatedEvent();
        record.orderID = fieldSetFlags()[0] ? this.orderID : (java.lang.String) defaultValue(fields()[0]);
        record.productID = fieldSetFlags()[1] ? this.productID : (java.lang.String) defaultValue(fields()[1]);
        record.customerID = fieldSetFlags()[2] ? this.customerID : (java.lang.String) defaultValue(fields()[2]);
        record.quantity = fieldSetFlags()[3] ? this.quantity : (java.lang.Integer) defaultValue(fields()[3]);
        record.status = fieldSetFlags()[4] ? this.status : (java.lang.String) defaultValue(fields()[4]);
        if (shippingAddressBuilder != null) {
          try {
            record.shippingAddress = this.shippingAddressBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("shippingAddress"));
            throw e;
          }
        } else {
          record.shippingAddress = fieldSetFlags()[5] ? this.shippingAddress : (ibm.eda.demo.app.infrastructure.events.Address) defaultValue(fields()[5]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderCreatedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderCreatedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderCreatedEvent>
    READER$ = (org.apache.avro.io.DatumReader<OrderCreatedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.orderID);

    out.writeString(this.productID);

    out.writeString(this.customerID);

    out.writeInt(this.quantity);

    out.writeString(this.status);

    this.shippingAddress.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.orderID = in.readString();

      this.productID = in.readString();

      this.customerID = in.readString();

      this.quantity = in.readInt();

      this.status = in.readString();

      if (this.shippingAddress == null) {
        this.shippingAddress = new ibm.eda.demo.app.infrastructure.events.Address();
      }
      this.shippingAddress.customDecode(in);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.orderID = in.readString();
          break;

        case 1:
          this.productID = in.readString();
          break;

        case 2:
          this.customerID = in.readString();
          break;

        case 3:
          this.quantity = in.readInt();
          break;

        case 4:
          this.status = in.readString();
          break;

        case 5:
          if (this.shippingAddress == null) {
            this.shippingAddress = new ibm.eda.demo.app.infrastructure.events.Address();
          }
          this.shippingAddress.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










