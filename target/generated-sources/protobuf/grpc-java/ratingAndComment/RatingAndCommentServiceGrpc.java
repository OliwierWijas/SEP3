package ratingAndComment;

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
    comments = "Source: RatingAndCommentService.proto")
public final class RatingAndCommentServiceGrpc {

  private RatingAndCommentServiceGrpc() {}

  public static final String SERVICE_NAME = "ratingAndComment.RatingAndCommentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ratingAndComment.CreateAndUpdateRatingRequest,
      ratingAndComment.RatingAndCommentEmptyResponse> METHOD_CREATE_RATING =
      io.grpc.MethodDescriptor.<ratingAndComment.CreateAndUpdateRatingRequest, ratingAndComment.RatingAndCommentEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ratingAndComment.RatingAndCommentService", "createRating"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.CreateAndUpdateRatingRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.RatingAndCommentEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ratingAndComment.CreateCommentRequest,
      ratingAndComment.RatingAndCommentEmptyResponse> METHOD_CREATE_COMMENT =
      io.grpc.MethodDescriptor.<ratingAndComment.CreateCommentRequest, ratingAndComment.RatingAndCommentEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ratingAndComment.RatingAndCommentService", "createComment"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.CreateCommentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.RatingAndCommentEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ratingAndComment.CreateAndUpdateRatingRequest,
      ratingAndComment.RatingAndCommentEmptyResponse> METHOD_UPDATE_RATING =
      io.grpc.MethodDescriptor.<ratingAndComment.CreateAndUpdateRatingRequest, ratingAndComment.RatingAndCommentEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ratingAndComment.RatingAndCommentService", "updateRating"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.CreateAndUpdateRatingRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.RatingAndCommentEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ratingAndComment.DeleteCommentRequest,
      ratingAndComment.RatingAndCommentEmptyResponse> METHOD_DELETE_COMMENT =
      io.grpc.MethodDescriptor.<ratingAndComment.DeleteCommentRequest, ratingAndComment.RatingAndCommentEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ratingAndComment.RatingAndCommentService", "deleteComment"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.DeleteCommentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.RatingAndCommentEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ratingAndComment.ReadCommentsByFoodSellerIdRequest,
      ratingAndComment.ReadCommentsByFoodSellerIdResponse> METHOD_READ_COMMENTS_BY_FOOD_SELLER_ID =
      io.grpc.MethodDescriptor.<ratingAndComment.ReadCommentsByFoodSellerIdRequest, ratingAndComment.ReadCommentsByFoodSellerIdResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ratingAndComment.RatingAndCommentService", "readCommentsByFoodSellerId"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.ReadCommentsByFoodSellerIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.ReadCommentsByFoodSellerIdResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ratingAndComment.ReadAverageRatingByFoodSellerIdRequest,
      ratingAndComment.ReadAverageRatingByFoodSellerIdResponse> METHOD_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID =
      io.grpc.MethodDescriptor.<ratingAndComment.ReadAverageRatingByFoodSellerIdRequest, ratingAndComment.ReadAverageRatingByFoodSellerIdResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ratingAndComment.RatingAndCommentService", "readAverageRatingByFoodSellerId"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.ReadAverageRatingByFoodSellerIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.ReadAverageRatingByFoodSellerIdResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ratingAndComment.ReadRatingRequest,
      ratingAndComment.ReadRatingResponse> METHOD_READ_RATING =
      io.grpc.MethodDescriptor.<ratingAndComment.ReadRatingRequest, ratingAndComment.ReadRatingResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ratingAndComment.RatingAndCommentService", "readRating"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.ReadRatingRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ratingAndComment.ReadRatingResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RatingAndCommentServiceStub newStub(io.grpc.Channel channel) {
    return new RatingAndCommentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RatingAndCommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RatingAndCommentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RatingAndCommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RatingAndCommentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RatingAndCommentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createRating(ratingAndComment.CreateAndUpdateRatingRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_RATING, responseObserver);
    }

    /**
     */
    public void createComment(ratingAndComment.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_COMMENT, responseObserver);
    }

    /**
     */
    public void updateRating(ratingAndComment.CreateAndUpdateRatingRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_RATING, responseObserver);
    }

    /**
     */
    public void deleteComment(ratingAndComment.DeleteCommentRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_COMMENT, responseObserver);
    }

    /**
     */
    public void readCommentsByFoodSellerId(ratingAndComment.ReadCommentsByFoodSellerIdRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.ReadCommentsByFoodSellerIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_COMMENTS_BY_FOOD_SELLER_ID, responseObserver);
    }

    /**
     */
    public void readAverageRatingByFoodSellerId(ratingAndComment.ReadAverageRatingByFoodSellerIdRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.ReadAverageRatingByFoodSellerIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID, responseObserver);
    }

    /**
     */
    public void readRating(ratingAndComment.ReadRatingRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.ReadRatingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_RATING, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_RATING,
            asyncUnaryCall(
              new MethodHandlers<
                ratingAndComment.CreateAndUpdateRatingRequest,
                ratingAndComment.RatingAndCommentEmptyResponse>(
                  this, METHODID_CREATE_RATING)))
          .addMethod(
            METHOD_CREATE_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                ratingAndComment.CreateCommentRequest,
                ratingAndComment.RatingAndCommentEmptyResponse>(
                  this, METHODID_CREATE_COMMENT)))
          .addMethod(
            METHOD_UPDATE_RATING,
            asyncUnaryCall(
              new MethodHandlers<
                ratingAndComment.CreateAndUpdateRatingRequest,
                ratingAndComment.RatingAndCommentEmptyResponse>(
                  this, METHODID_UPDATE_RATING)))
          .addMethod(
            METHOD_DELETE_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                ratingAndComment.DeleteCommentRequest,
                ratingAndComment.RatingAndCommentEmptyResponse>(
                  this, METHODID_DELETE_COMMENT)))
          .addMethod(
            METHOD_READ_COMMENTS_BY_FOOD_SELLER_ID,
            asyncUnaryCall(
              new MethodHandlers<
                ratingAndComment.ReadCommentsByFoodSellerIdRequest,
                ratingAndComment.ReadCommentsByFoodSellerIdResponse>(
                  this, METHODID_READ_COMMENTS_BY_FOOD_SELLER_ID)))
          .addMethod(
            METHOD_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID,
            asyncUnaryCall(
              new MethodHandlers<
                ratingAndComment.ReadAverageRatingByFoodSellerIdRequest,
                ratingAndComment.ReadAverageRatingByFoodSellerIdResponse>(
                  this, METHODID_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID)))
          .addMethod(
            METHOD_READ_RATING,
            asyncUnaryCall(
              new MethodHandlers<
                ratingAndComment.ReadRatingRequest,
                ratingAndComment.ReadRatingResponse>(
                  this, METHODID_READ_RATING)))
          .build();
    }
  }

  /**
   */
  public static final class RatingAndCommentServiceStub extends io.grpc.stub.AbstractStub<RatingAndCommentServiceStub> {
    private RatingAndCommentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingAndCommentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingAndCommentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingAndCommentServiceStub(channel, callOptions);
    }

    /**
     */
    public void createRating(ratingAndComment.CreateAndUpdateRatingRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_RATING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createComment(ratingAndComment.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_COMMENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRating(ratingAndComment.CreateAndUpdateRatingRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_RATING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteComment(ratingAndComment.DeleteCommentRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_COMMENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readCommentsByFoodSellerId(ratingAndComment.ReadCommentsByFoodSellerIdRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.ReadCommentsByFoodSellerIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_COMMENTS_BY_FOOD_SELLER_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAverageRatingByFoodSellerId(ratingAndComment.ReadAverageRatingByFoodSellerIdRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.ReadAverageRatingByFoodSellerIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readRating(ratingAndComment.ReadRatingRequest request,
        io.grpc.stub.StreamObserver<ratingAndComment.ReadRatingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_RATING, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RatingAndCommentServiceBlockingStub extends io.grpc.stub.AbstractStub<RatingAndCommentServiceBlockingStub> {
    private RatingAndCommentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingAndCommentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingAndCommentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingAndCommentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ratingAndComment.RatingAndCommentEmptyResponse createRating(ratingAndComment.CreateAndUpdateRatingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_RATING, getCallOptions(), request);
    }

    /**
     */
    public ratingAndComment.RatingAndCommentEmptyResponse createComment(ratingAndComment.CreateCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_COMMENT, getCallOptions(), request);
    }

    /**
     */
    public ratingAndComment.RatingAndCommentEmptyResponse updateRating(ratingAndComment.CreateAndUpdateRatingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_RATING, getCallOptions(), request);
    }

    /**
     */
    public ratingAndComment.RatingAndCommentEmptyResponse deleteComment(ratingAndComment.DeleteCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_COMMENT, getCallOptions(), request);
    }

    /**
     */
    public ratingAndComment.ReadCommentsByFoodSellerIdResponse readCommentsByFoodSellerId(ratingAndComment.ReadCommentsByFoodSellerIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_COMMENTS_BY_FOOD_SELLER_ID, getCallOptions(), request);
    }

    /**
     */
    public ratingAndComment.ReadAverageRatingByFoodSellerIdResponse readAverageRatingByFoodSellerId(ratingAndComment.ReadAverageRatingByFoodSellerIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID, getCallOptions(), request);
    }

    /**
     */
    public ratingAndComment.ReadRatingResponse readRating(ratingAndComment.ReadRatingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_RATING, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RatingAndCommentServiceFutureStub extends io.grpc.stub.AbstractStub<RatingAndCommentServiceFutureStub> {
    private RatingAndCommentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingAndCommentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingAndCommentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingAndCommentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ratingAndComment.RatingAndCommentEmptyResponse> createRating(
        ratingAndComment.CreateAndUpdateRatingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_RATING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ratingAndComment.RatingAndCommentEmptyResponse> createComment(
        ratingAndComment.CreateCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_COMMENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ratingAndComment.RatingAndCommentEmptyResponse> updateRating(
        ratingAndComment.CreateAndUpdateRatingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_RATING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ratingAndComment.RatingAndCommentEmptyResponse> deleteComment(
        ratingAndComment.DeleteCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_COMMENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ratingAndComment.ReadCommentsByFoodSellerIdResponse> readCommentsByFoodSellerId(
        ratingAndComment.ReadCommentsByFoodSellerIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_COMMENTS_BY_FOOD_SELLER_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ratingAndComment.ReadAverageRatingByFoodSellerIdResponse> readAverageRatingByFoodSellerId(
        ratingAndComment.ReadAverageRatingByFoodSellerIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ratingAndComment.ReadRatingResponse> readRating(
        ratingAndComment.ReadRatingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_RATING, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RATING = 0;
  private static final int METHODID_CREATE_COMMENT = 1;
  private static final int METHODID_UPDATE_RATING = 2;
  private static final int METHODID_DELETE_COMMENT = 3;
  private static final int METHODID_READ_COMMENTS_BY_FOOD_SELLER_ID = 4;
  private static final int METHODID_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID = 5;
  private static final int METHODID_READ_RATING = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RatingAndCommentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RatingAndCommentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RATING:
          serviceImpl.createRating((ratingAndComment.CreateAndUpdateRatingRequest) request,
              (io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse>) responseObserver);
          break;
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((ratingAndComment.CreateCommentRequest) request,
              (io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RATING:
          serviceImpl.updateRating((ratingAndComment.CreateAndUpdateRatingRequest) request,
              (io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((ratingAndComment.DeleteCommentRequest) request,
              (io.grpc.stub.StreamObserver<ratingAndComment.RatingAndCommentEmptyResponse>) responseObserver);
          break;
        case METHODID_READ_COMMENTS_BY_FOOD_SELLER_ID:
          serviceImpl.readCommentsByFoodSellerId((ratingAndComment.ReadCommentsByFoodSellerIdRequest) request,
              (io.grpc.stub.StreamObserver<ratingAndComment.ReadCommentsByFoodSellerIdResponse>) responseObserver);
          break;
        case METHODID_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID:
          serviceImpl.readAverageRatingByFoodSellerId((ratingAndComment.ReadAverageRatingByFoodSellerIdRequest) request,
              (io.grpc.stub.StreamObserver<ratingAndComment.ReadAverageRatingByFoodSellerIdResponse>) responseObserver);
          break;
        case METHODID_READ_RATING:
          serviceImpl.readRating((ratingAndComment.ReadRatingRequest) request,
              (io.grpc.stub.StreamObserver<ratingAndComment.ReadRatingResponse>) responseObserver);
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

  private static final class RatingAndCommentServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ratingAndComment.RatingAndCommentServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RatingAndCommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RatingAndCommentServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_RATING)
              .addMethod(METHOD_CREATE_COMMENT)
              .addMethod(METHOD_UPDATE_RATING)
              .addMethod(METHOD_DELETE_COMMENT)
              .addMethod(METHOD_READ_COMMENTS_BY_FOOD_SELLER_ID)
              .addMethod(METHOD_READ_AVERAGE_RATING_BY_FOOD_SELLER_ID)
              .addMethod(METHOD_READ_RATING)
              .build();
        }
      }
    }
    return result;
  }
}
