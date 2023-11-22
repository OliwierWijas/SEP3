package foodSeller;

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
    comments = "Source: FoodSellerService.proto")
public final class FoodSellerServiceGrpc {

  private FoodSellerServiceGrpc() {}

  public static final String SERVICE_NAME = "foodSeller.FoodSellerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodSeller.CreateFoodSellerRequest,
      foodSeller.FoodSellerEmptyResponse> METHOD_CREATE_FOOD_SELLER =
      io.grpc.MethodDescriptor.<foodSeller.CreateFoodSellerRequest, foodSeller.FoodSellerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodSeller.FoodSellerService", "CreateFoodSeller"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.CreateFoodSellerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.FoodSellerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodSeller.UpdateFoodSellerNameRequest,
      foodSeller.FoodSellerEmptyResponse> METHOD_UPDATE_NAME =
      io.grpc.MethodDescriptor.<foodSeller.UpdateFoodSellerNameRequest, foodSeller.FoodSellerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodSeller.FoodSellerService", "UpdateName"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.UpdateFoodSellerNameRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.FoodSellerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodSeller.UpdateFoodSellerAddressRequest,
      foodSeller.FoodSellerEmptyResponse> METHOD_UPDATE_ADDRESS =
      io.grpc.MethodDescriptor.<foodSeller.UpdateFoodSellerAddressRequest, foodSeller.FoodSellerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodSeller.FoodSellerService", "UpdateAddress"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.UpdateFoodSellerAddressRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.FoodSellerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodSeller.UpdateFoodSellerEmailRequest,
      foodSeller.FoodSellerEmptyResponse> METHOD_UPDATE_EMAIL =
      io.grpc.MethodDescriptor.<foodSeller.UpdateFoodSellerEmailRequest, foodSeller.FoodSellerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodSeller.FoodSellerService", "UpdateEmail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.UpdateFoodSellerEmailRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.FoodSellerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodSeller.UpdateFoodSellerPasswordRequest,
      foodSeller.FoodSellerEmptyResponse> METHOD_UPDATE_PASSWORD =
      io.grpc.MethodDescriptor.<foodSeller.UpdateFoodSellerPasswordRequest, foodSeller.FoodSellerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodSeller.FoodSellerService", "UpdatePassword"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.UpdateFoodSellerPasswordRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.FoodSellerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodSeller.UpdateFoodSellerPhoneNumberRequest,
      foodSeller.FoodSellerEmptyResponse> METHOD_UPDATE_PHONE_NUMBER =
      io.grpc.MethodDescriptor.<foodSeller.UpdateFoodSellerPhoneNumberRequest, foodSeller.FoodSellerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodSeller.FoodSellerService", "UpdatePhoneNumber"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.UpdateFoodSellerPhoneNumberRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.FoodSellerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<foodSeller.DeleteFoodSellerAccountRequest,
      foodSeller.FoodSellerEmptyResponse> METHOD_DELETE_ACCOUNT =
      io.grpc.MethodDescriptor.<foodSeller.DeleteFoodSellerAccountRequest, foodSeller.FoodSellerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "foodSeller.FoodSellerService", "DeleteAccount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.DeleteFoodSellerAccountRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              foodSeller.FoodSellerEmptyResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FoodSellerServiceStub newStub(io.grpc.Channel channel) {
    return new FoodSellerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FoodSellerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FoodSellerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FoodSellerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FoodSellerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FoodSellerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createFoodSeller(foodSeller.CreateFoodSellerRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_FOOD_SELLER, responseObserver);
    }

    /**
     */
    public void updateName(foodSeller.UpdateFoodSellerNameRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_NAME, responseObserver);
    }

    /**
     */
    public void updateAddress(foodSeller.UpdateFoodSellerAddressRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ADDRESS, responseObserver);
    }

    /**
     */
    public void updateEmail(foodSeller.UpdateFoodSellerEmailRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_EMAIL, responseObserver);
    }

    /**
     */
    public void updatePassword(foodSeller.UpdateFoodSellerPasswordRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PASSWORD, responseObserver);
    }

    /**
     */
    public void updatePhoneNumber(foodSeller.UpdateFoodSellerPhoneNumberRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PHONE_NUMBER, responseObserver);
    }

    /**
     */
    public void deleteAccount(foodSeller.DeleteFoodSellerAccountRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ACCOUNT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_FOOD_SELLER,
            asyncUnaryCall(
              new MethodHandlers<
                foodSeller.CreateFoodSellerRequest,
                foodSeller.FoodSellerEmptyResponse>(
                  this, METHODID_CREATE_FOOD_SELLER)))
          .addMethod(
            METHOD_UPDATE_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                foodSeller.UpdateFoodSellerNameRequest,
                foodSeller.FoodSellerEmptyResponse>(
                  this, METHODID_UPDATE_NAME)))
          .addMethod(
            METHOD_UPDATE_ADDRESS,
            asyncUnaryCall(
              new MethodHandlers<
                foodSeller.UpdateFoodSellerAddressRequest,
                foodSeller.FoodSellerEmptyResponse>(
                  this, METHODID_UPDATE_ADDRESS)))
          .addMethod(
            METHOD_UPDATE_EMAIL,
            asyncUnaryCall(
              new MethodHandlers<
                foodSeller.UpdateFoodSellerEmailRequest,
                foodSeller.FoodSellerEmptyResponse>(
                  this, METHODID_UPDATE_EMAIL)))
          .addMethod(
            METHOD_UPDATE_PASSWORD,
            asyncUnaryCall(
              new MethodHandlers<
                foodSeller.UpdateFoodSellerPasswordRequest,
                foodSeller.FoodSellerEmptyResponse>(
                  this, METHODID_UPDATE_PASSWORD)))
          .addMethod(
            METHOD_UPDATE_PHONE_NUMBER,
            asyncUnaryCall(
              new MethodHandlers<
                foodSeller.UpdateFoodSellerPhoneNumberRequest,
                foodSeller.FoodSellerEmptyResponse>(
                  this, METHODID_UPDATE_PHONE_NUMBER)))
          .addMethod(
            METHOD_DELETE_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                foodSeller.DeleteFoodSellerAccountRequest,
                foodSeller.FoodSellerEmptyResponse>(
                  this, METHODID_DELETE_ACCOUNT)))
          .build();
    }
  }

  /**
   */
  public static final class FoodSellerServiceStub extends io.grpc.stub.AbstractStub<FoodSellerServiceStub> {
    private FoodSellerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FoodSellerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodSellerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FoodSellerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createFoodSeller(foodSeller.CreateFoodSellerRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_FOOD_SELLER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateName(foodSeller.UpdateFoodSellerNameRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NAME, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddress(foodSeller.UpdateFoodSellerAddressRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ADDRESS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmail(foodSeller.UpdateFoodSellerEmailRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_EMAIL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePassword(foodSeller.UpdateFoodSellerPasswordRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PASSWORD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePhoneNumber(foodSeller.UpdateFoodSellerPhoneNumberRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PHONE_NUMBER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(foodSeller.DeleteFoodSellerAccountRequest request,
        io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ACCOUNT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FoodSellerServiceBlockingStub extends io.grpc.stub.AbstractStub<FoodSellerServiceBlockingStub> {
    private FoodSellerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FoodSellerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodSellerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FoodSellerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public foodSeller.FoodSellerEmptyResponse createFoodSeller(foodSeller.CreateFoodSellerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_FOOD_SELLER, getCallOptions(), request);
    }

    /**
     */
    public foodSeller.FoodSellerEmptyResponse updateName(foodSeller.UpdateFoodSellerNameRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_NAME, getCallOptions(), request);
    }

    /**
     */
    public foodSeller.FoodSellerEmptyResponse updateAddress(foodSeller.UpdateFoodSellerAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ADDRESS, getCallOptions(), request);
    }

    /**
     */
    public foodSeller.FoodSellerEmptyResponse updateEmail(foodSeller.UpdateFoodSellerEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_EMAIL, getCallOptions(), request);
    }

    /**
     */
    public foodSeller.FoodSellerEmptyResponse updatePassword(foodSeller.UpdateFoodSellerPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PASSWORD, getCallOptions(), request);
    }

    /**
     */
    public foodSeller.FoodSellerEmptyResponse updatePhoneNumber(foodSeller.UpdateFoodSellerPhoneNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PHONE_NUMBER, getCallOptions(), request);
    }

    /**
     */
    public foodSeller.FoodSellerEmptyResponse deleteAccount(foodSeller.DeleteFoodSellerAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ACCOUNT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FoodSellerServiceFutureStub extends io.grpc.stub.AbstractStub<FoodSellerServiceFutureStub> {
    private FoodSellerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FoodSellerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodSellerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FoodSellerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodSeller.FoodSellerEmptyResponse> createFoodSeller(
        foodSeller.CreateFoodSellerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_FOOD_SELLER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodSeller.FoodSellerEmptyResponse> updateName(
        foodSeller.UpdateFoodSellerNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NAME, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodSeller.FoodSellerEmptyResponse> updateAddress(
        foodSeller.UpdateFoodSellerAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ADDRESS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodSeller.FoodSellerEmptyResponse> updateEmail(
        foodSeller.UpdateFoodSellerEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_EMAIL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodSeller.FoodSellerEmptyResponse> updatePassword(
        foodSeller.UpdateFoodSellerPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PASSWORD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodSeller.FoodSellerEmptyResponse> updatePhoneNumber(
        foodSeller.UpdateFoodSellerPhoneNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PHONE_NUMBER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<foodSeller.FoodSellerEmptyResponse> deleteAccount(
        foodSeller.DeleteFoodSellerAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ACCOUNT, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FOOD_SELLER = 0;
  private static final int METHODID_UPDATE_NAME = 1;
  private static final int METHODID_UPDATE_ADDRESS = 2;
  private static final int METHODID_UPDATE_EMAIL = 3;
  private static final int METHODID_UPDATE_PASSWORD = 4;
  private static final int METHODID_UPDATE_PHONE_NUMBER = 5;
  private static final int METHODID_DELETE_ACCOUNT = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FoodSellerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FoodSellerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FOOD_SELLER:
          serviceImpl.createFoodSeller((foodSeller.CreateFoodSellerRequest) request,
              (io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NAME:
          serviceImpl.updateName((foodSeller.UpdateFoodSellerNameRequest) request,
              (io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS:
          serviceImpl.updateAddress((foodSeller.UpdateFoodSellerAddressRequest) request,
              (io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL:
          serviceImpl.updateEmail((foodSeller.UpdateFoodSellerEmailRequest) request,
              (io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((foodSeller.UpdateFoodSellerPasswordRequest) request,
              (io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PHONE_NUMBER:
          serviceImpl.updatePhoneNumber((foodSeller.UpdateFoodSellerPhoneNumberRequest) request,
              (io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((foodSeller.DeleteFoodSellerAccountRequest) request,
              (io.grpc.stub.StreamObserver<foodSeller.FoodSellerEmptyResponse>) responseObserver);
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

  private static final class FoodSellerServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return foodSeller.FoodSellerServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FoodSellerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FoodSellerServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_FOOD_SELLER)
              .addMethod(METHOD_UPDATE_NAME)
              .addMethod(METHOD_UPDATE_ADDRESS)
              .addMethod(METHOD_UPDATE_EMAIL)
              .addMethod(METHOD_UPDATE_PASSWORD)
              .addMethod(METHOD_UPDATE_PHONE_NUMBER)
              .addMethod(METHOD_DELETE_ACCOUNT)
              .build();
        }
      }
    }
    return result;
  }
}
