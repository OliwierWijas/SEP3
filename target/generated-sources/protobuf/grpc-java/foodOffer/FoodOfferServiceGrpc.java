package foodOffer;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: FoodOfferService.proto")
public final class FoodOfferServiceGrpc {

  private FoodOfferServiceGrpc() {}

  public static final String SERVICE_NAME = "foodOffer.FoodOfferService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodOffer.CreateFoodOfferRequest,
      foodOffer.FoodOfferEmptyResponse> METHOD_CREATE_FOOD_OFFER =
      io.grpc.MethodDescriptor.<foodOffer.CreateFoodOfferRequest, foodOffer.FoodOfferEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodOffer.FoodOfferService", "createFoodOffer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.CreateFoodOfferRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.FoodOfferEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodOffer.ReadAvailableFoodOffersRequest,
      foodOffer.ReadFoodOffersListResponse> METHOD_READ_AVAILABLE_FOOD_OFFERS =
      io.grpc.MethodDescriptor.<foodOffer.ReadAvailableFoodOffersRequest, foodOffer.ReadFoodOffersListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodOffer.FoodOfferService", "readAvailableFoodOffers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.ReadAvailableFoodOffersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.ReadFoodOffersListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodOffer.ReadFoodOffersByFoodSellerIdRequest,
      foodOffer.ReadFoodOffersListResponse> METHOD_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID =
      io.grpc.MethodDescriptor.<foodOffer.ReadFoodOffersByFoodSellerIdRequest, foodOffer.ReadFoodOffersListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodOffer.FoodOfferService", "readFoodOffersByFoodSellerId"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.ReadFoodOffersByFoodSellerIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.ReadFoodOffersListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodOffer.UpdateFoodOfferRequest,
      foodOffer.FoodOfferEmptyResponse> METHOD_UPDATE_FOOD_OFFER =
      io.grpc.MethodDescriptor.<foodOffer.UpdateFoodOfferRequest, foodOffer.FoodOfferEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodOffer.FoodOfferService", "updateFoodOffer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.UpdateFoodOfferRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.FoodOfferEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodOffer.DeleteFoodOfferRequest,
      foodOffer.FoodOfferEmptyResponse> METHOD_DELETE_FOOD_OFFER =
      io.grpc.MethodDescriptor.<foodOffer.DeleteFoodOfferRequest, foodOffer.FoodOfferEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodOffer.FoodOfferService", "deleteFoodOffer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.DeleteFoodOfferRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodOffer.FoodOfferEmptyResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FoodOfferServiceStub newStub(io.grpc.Channel channel) {
    return new FoodOfferServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FoodOfferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FoodOfferServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FoodOfferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FoodOfferServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FoodOfferServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createFoodOffer(foodOffer.CreateFoodOfferRequest request,
        io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_FOOD_OFFER, responseObserver);
    }

    /**
     */
    public void readAvailableFoodOffers(foodOffer.ReadAvailableFoodOffersRequest request,
        io.grpc.stub.StreamObserver<foodOffer.ReadFoodOffersListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_AVAILABLE_FOOD_OFFERS, responseObserver);
    }

    /**
     */
    public void readFoodOffersByFoodSellerId(foodOffer.ReadFoodOffersByFoodSellerIdRequest request,
        io.grpc.stub.StreamObserver<foodOffer.ReadFoodOffersListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID, responseObserver);
    }

    /**
     */
    public void updateFoodOffer(foodOffer.UpdateFoodOfferRequest request,
        io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_FOOD_OFFER, responseObserver);
    }

    /**
     */
    public void deleteFoodOffer(foodOffer.DeleteFoodOfferRequest request,
        io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_FOOD_OFFER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_FOOD_OFFER,
            asyncUnaryCall(
              new MethodHandlers<
                foodOffer.CreateFoodOfferRequest,
                foodOffer.FoodOfferEmptyResponse>(
                  this, METHODID_CREATE_FOOD_OFFER)))
          .addMethod(
            METHOD_READ_AVAILABLE_FOOD_OFFERS,
            asyncUnaryCall(
              new MethodHandlers<
                foodOffer.ReadAvailableFoodOffersRequest,
                foodOffer.ReadFoodOffersListResponse>(
                  this, METHODID_READ_AVAILABLE_FOOD_OFFERS)))
          .addMethod(
            METHOD_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID,
            asyncUnaryCall(
              new MethodHandlers<
                foodOffer.ReadFoodOffersByFoodSellerIdRequest,
                foodOffer.ReadFoodOffersListResponse>(
                  this, METHODID_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID)))
          .addMethod(
            METHOD_UPDATE_FOOD_OFFER,
            asyncUnaryCall(
              new MethodHandlers<
                foodOffer.UpdateFoodOfferRequest,
                foodOffer.FoodOfferEmptyResponse>(
                  this, METHODID_UPDATE_FOOD_OFFER)))
          .addMethod(
            METHOD_DELETE_FOOD_OFFER,
            asyncUnaryCall(
              new MethodHandlers<
                foodOffer.DeleteFoodOfferRequest,
                foodOffer.FoodOfferEmptyResponse>(
                  this, METHODID_DELETE_FOOD_OFFER)))
          .build();
    }
  }

  /**
   */
  public static final class FoodOfferServiceStub extends io.grpc.stub.AbstractStub<FoodOfferServiceStub> {
    private FoodOfferServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FoodOfferServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodOfferServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FoodOfferServiceStub(channel, callOptions);
    }

    /**
     */
    public void createFoodOffer(foodOffer.CreateFoodOfferRequest request,
        io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_FOOD_OFFER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAvailableFoodOffers(foodOffer.ReadAvailableFoodOffersRequest request,
        io.grpc.stub.StreamObserver<foodOffer.ReadFoodOffersListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_AVAILABLE_FOOD_OFFERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readFoodOffersByFoodSellerId(foodOffer.ReadFoodOffersByFoodSellerIdRequest request,
        io.grpc.stub.StreamObserver<foodOffer.ReadFoodOffersListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFoodOffer(foodOffer.UpdateFoodOfferRequest request,
        io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_FOOD_OFFER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFoodOffer(foodOffer.DeleteFoodOfferRequest request,
        io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_FOOD_OFFER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FoodOfferServiceBlockingStub extends io.grpc.stub.AbstractStub<FoodOfferServiceBlockingStub> {
    private FoodOfferServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FoodOfferServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodOfferServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FoodOfferServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public foodOffer.FoodOfferEmptyResponse createFoodOffer(foodOffer.CreateFoodOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_FOOD_OFFER, getCallOptions(), request);
    }

    /**
     */
    public foodOffer.ReadFoodOffersListResponse readAvailableFoodOffers(foodOffer.ReadAvailableFoodOffersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_AVAILABLE_FOOD_OFFERS, getCallOptions(), request);
    }

    /**
     */
    public foodOffer.ReadFoodOffersListResponse readFoodOffersByFoodSellerId(foodOffer.ReadFoodOffersByFoodSellerIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID, getCallOptions(), request);
    }

    /**
     */
    public foodOffer.FoodOfferEmptyResponse updateFoodOffer(foodOffer.UpdateFoodOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_FOOD_OFFER, getCallOptions(), request);
    }

    /**
     */
    public foodOffer.FoodOfferEmptyResponse deleteFoodOffer(foodOffer.DeleteFoodOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_FOOD_OFFER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FoodOfferServiceFutureStub extends io.grpc.stub.AbstractStub<FoodOfferServiceFutureStub> {
    private FoodOfferServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FoodOfferServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodOfferServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FoodOfferServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodOffer.FoodOfferEmptyResponse> createFoodOffer(
        foodOffer.CreateFoodOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_FOOD_OFFER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodOffer.ReadFoodOffersListResponse> readAvailableFoodOffers(
        foodOffer.ReadAvailableFoodOffersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_AVAILABLE_FOOD_OFFERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodOffer.ReadFoodOffersListResponse> readFoodOffersByFoodSellerId(
        foodOffer.ReadFoodOffersByFoodSellerIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodOffer.FoodOfferEmptyResponse> updateFoodOffer(
        foodOffer.UpdateFoodOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_FOOD_OFFER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodOffer.FoodOfferEmptyResponse> deleteFoodOffer(
        foodOffer.DeleteFoodOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_FOOD_OFFER, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FOOD_OFFER = 0;
  private static final int METHODID_READ_AVAILABLE_FOOD_OFFERS = 1;
  private static final int METHODID_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID = 2;
  private static final int METHODID_UPDATE_FOOD_OFFER = 3;
  private static final int METHODID_DELETE_FOOD_OFFER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FoodOfferServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FoodOfferServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FOOD_OFFER:
          serviceImpl.createFoodOffer((foodOffer.CreateFoodOfferRequest) request,
              (io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse>) responseObserver);
          break;
        case METHODID_READ_AVAILABLE_FOOD_OFFERS:
          serviceImpl.readAvailableFoodOffers((foodOffer.ReadAvailableFoodOffersRequest) request,
              (io.grpc.stub.StreamObserver<foodOffer.ReadFoodOffersListResponse>) responseObserver);
          break;
        case METHODID_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID:
          serviceImpl.readFoodOffersByFoodSellerId((foodOffer.ReadFoodOffersByFoodSellerIdRequest) request,
              (io.grpc.stub.StreamObserver<foodOffer.ReadFoodOffersListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FOOD_OFFER:
          serviceImpl.updateFoodOffer((foodOffer.UpdateFoodOfferRequest) request,
              (io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse>) responseObserver);
          break;
        case METHODID_DELETE_FOOD_OFFER:
          serviceImpl.deleteFoodOffer((foodOffer.DeleteFoodOfferRequest) request,
              (io.grpc.stub.StreamObserver<foodOffer.FoodOfferEmptyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class FoodOfferServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return foodOffer.FoodOfferServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FoodOfferServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FoodOfferServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_FOOD_OFFER)
              .addMethod(METHOD_READ_AVAILABLE_FOOD_OFFERS)
              .addMethod(METHOD_READ_FOOD_OFFERS_BY_FOOD_SELLER_ID)
              .addMethod(METHOD_UPDATE_FOOD_OFFER)
              .addMethod(METHOD_DELETE_FOOD_OFFER)
              .build();
        }
      }
    }
    return result;
  }
}
