// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodOfferService.proto

package foodOffer;

public interface UpdateFoodOfferRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:foodOffer.UpdateFoodOfferRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 foodOfferId = 1;</code>
   */
  int getFoodOfferId();

  /**
   * <code>string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>double price = 4;</code>
   */
  double getPrice();

  /**
   * <code>string startPickUpTime = 5;</code>
   */
  java.lang.String getStartPickUpTime();
  /**
   * <code>string startPickUpTime = 5;</code>
   */
  com.google.protobuf.ByteString
      getStartPickUpTimeBytes();

  /**
   * <code>string endPickUpTime = 6;</code>
   */
  java.lang.String getEndPickUpTime();
  /**
   * <code>string endPickUpTime = 6;</code>
   */
  com.google.protobuf.ByteString
      getEndPickUpTimeBytes();
}
