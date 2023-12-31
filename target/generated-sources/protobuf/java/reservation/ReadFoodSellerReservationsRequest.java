// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package reservation;

/**
 * Protobuf type {@code reservation.ReadFoodSellerReservationsRequest}
 */
public  final class ReadFoodSellerReservationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:reservation.ReadFoodSellerReservationsRequest)
    ReadFoodSellerReservationsRequestOrBuilder {
  // Use ReadFoodSellerReservationsRequest.newBuilder() to construct.
  private ReadFoodSellerReservationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadFoodSellerReservationsRequest() {
    foodSellerId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReadFoodSellerReservationsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            foodSellerId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadFoodSellerReservationsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadFoodSellerReservationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            reservation.ReadFoodSellerReservationsRequest.class, reservation.ReadFoodSellerReservationsRequest.Builder.class);
  }

  public static final int FOODSELLERID_FIELD_NUMBER = 1;
  private int foodSellerId_;
  /**
   * <code>int32 foodSellerId = 1;</code>
   */
  public int getFoodSellerId() {
    return foodSellerId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (foodSellerId_ != 0) {
      output.writeInt32(1, foodSellerId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (foodSellerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, foodSellerId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof reservation.ReadFoodSellerReservationsRequest)) {
      return super.equals(obj);
    }
    reservation.ReadFoodSellerReservationsRequest other = (reservation.ReadFoodSellerReservationsRequest) obj;

    boolean result = true;
    result = result && (getFoodSellerId()
        == other.getFoodSellerId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FOODSELLERID_FIELD_NUMBER;
    hash = (53 * hash) + getFoodSellerId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static reservation.ReadFoodSellerReservationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static reservation.ReadFoodSellerReservationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(reservation.ReadFoodSellerReservationsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code reservation.ReadFoodSellerReservationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:reservation.ReadFoodSellerReservationsRequest)
      reservation.ReadFoodSellerReservationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadFoodSellerReservationsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadFoodSellerReservationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              reservation.ReadFoodSellerReservationsRequest.class, reservation.ReadFoodSellerReservationsRequest.Builder.class);
    }

    // Construct using reservation.ReadFoodSellerReservationsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      foodSellerId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadFoodSellerReservationsRequest_descriptor;
    }

    public reservation.ReadFoodSellerReservationsRequest getDefaultInstanceForType() {
      return reservation.ReadFoodSellerReservationsRequest.getDefaultInstance();
    }

    public reservation.ReadFoodSellerReservationsRequest build() {
      reservation.ReadFoodSellerReservationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public reservation.ReadFoodSellerReservationsRequest buildPartial() {
      reservation.ReadFoodSellerReservationsRequest result = new reservation.ReadFoodSellerReservationsRequest(this);
      result.foodSellerId_ = foodSellerId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof reservation.ReadFoodSellerReservationsRequest) {
        return mergeFrom((reservation.ReadFoodSellerReservationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(reservation.ReadFoodSellerReservationsRequest other) {
      if (other == reservation.ReadFoodSellerReservationsRequest.getDefaultInstance()) return this;
      if (other.getFoodSellerId() != 0) {
        setFoodSellerId(other.getFoodSellerId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      reservation.ReadFoodSellerReservationsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (reservation.ReadFoodSellerReservationsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int foodSellerId_ ;
    /**
     * <code>int32 foodSellerId = 1;</code>
     */
    public int getFoodSellerId() {
      return foodSellerId_;
    }
    /**
     * <code>int32 foodSellerId = 1;</code>
     */
    public Builder setFoodSellerId(int value) {
      
      foodSellerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 foodSellerId = 1;</code>
     */
    public Builder clearFoodSellerId() {
      
      foodSellerId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:reservation.ReadFoodSellerReservationsRequest)
  }

  // @@protoc_insertion_point(class_scope:reservation.ReadFoodSellerReservationsRequest)
  private static final reservation.ReadFoodSellerReservationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new reservation.ReadFoodSellerReservationsRequest();
  }

  public static reservation.ReadFoodSellerReservationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadFoodSellerReservationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReadFoodSellerReservationsRequest>() {
    public ReadFoodSellerReservationsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadFoodSellerReservationsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadFoodSellerReservationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadFoodSellerReservationsRequest> getParserForType() {
    return PARSER;
  }

  public reservation.ReadFoodSellerReservationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

