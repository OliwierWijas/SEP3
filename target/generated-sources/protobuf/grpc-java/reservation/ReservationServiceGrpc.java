package reservation;

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
    comments = "Source: ReservationService.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "reservation.ReservationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<reservation.CreateReservationRequest,
      reservation.ReservationEmptyResponse> METHOD_CREATE_RESERVATION =
      io.grpc.MethodDescriptor.<reservation.CreateReservationRequest, reservation.ReservationEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "reservation.ReservationService", "createReservation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.CreateReservationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.ReservationEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<reservation.DeleteReservationRequest,
      reservation.ReservationEmptyResponse> METHOD_DELETE_RESERVATION =
      io.grpc.MethodDescriptor.<reservation.DeleteReservationRequest, reservation.ReservationEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "reservation.ReservationService", "deleteReservation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.DeleteReservationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.ReservationEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<reservation.ReadCustomerReservationsRequest,
      reservation.ReadReservationsListResponse> METHOD_READ_CUSTOMER_RESERVATIONS =
      io.grpc.MethodDescriptor.<reservation.ReadCustomerReservationsRequest, reservation.ReadReservationsListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "reservation.ReservationService", "readCustomerReservations"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.ReadCustomerReservationsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.ReadReservationsListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<reservation.ReadFoodSellerReservationsRequest,
      reservation.ReadReservationsListResponse> METHOD_READ_FOOD_SELLER_RESERVATIONS =
      io.grpc.MethodDescriptor.<reservation.ReadFoodSellerReservationsRequest, reservation.ReadReservationsListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "reservation.ReservationService", "readFoodSellerReservations"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.ReadFoodSellerReservationsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.ReadReservationsListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<reservation.CompleteReservationRequest,
      reservation.ReservationEmptyResponse> METHOD_COMPLETE_RESERVATION =
      io.grpc.MethodDescriptor.<reservation.CompleteReservationRequest, reservation.ReservationEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "reservation.ReservationService", "completeReservation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.CompleteReservationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              reservation.ReservationEmptyResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createReservation(reservation.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_RESERVATION, responseObserver);
    }

    /**
     */
    public void deleteReservation(reservation.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_RESERVATION, responseObserver);
    }

    /**
     */
    public void readCustomerReservations(reservation.ReadCustomerReservationsRequest request,
        io.grpc.stub.StreamObserver<reservation.ReadReservationsListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_CUSTOMER_RESERVATIONS, responseObserver);
    }

    /**
     */
    public void readFoodSellerReservations(reservation.ReadFoodSellerReservationsRequest request,
        io.grpc.stub.StreamObserver<reservation.ReadReservationsListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_FOOD_SELLER_RESERVATIONS, responseObserver);
    }

    /**
     */
    public void completeReservation(reservation.CompleteReservationRequest request,
        io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMPLETE_RESERVATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_RESERVATION,
            asyncUnaryCall(
              new MethodHandlers<
                reservation.CreateReservationRequest,
                reservation.ReservationEmptyResponse>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            METHOD_DELETE_RESERVATION,
            asyncUnaryCall(
              new MethodHandlers<
                reservation.DeleteReservationRequest,
                reservation.ReservationEmptyResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .addMethod(
            METHOD_READ_CUSTOMER_RESERVATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                reservation.ReadCustomerReservationsRequest,
                reservation.ReadReservationsListResponse>(
                  this, METHODID_READ_CUSTOMER_RESERVATIONS)))
          .addMethod(
            METHOD_READ_FOOD_SELLER_RESERVATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                reservation.ReadFoodSellerReservationsRequest,
                reservation.ReadReservationsListResponse>(
                  this, METHODID_READ_FOOD_SELLER_RESERVATIONS)))
          .addMethod(
            METHOD_COMPLETE_RESERVATION,
            asyncUnaryCall(
              new MethodHandlers<
                reservation.CompleteReservationRequest,
                reservation.ReservationEmptyResponse>(
                  this, METHODID_COMPLETE_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createReservation(reservation.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_RESERVATION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(reservation.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_RESERVATION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readCustomerReservations(reservation.ReadCustomerReservationsRequest request,
        io.grpc.stub.StreamObserver<reservation.ReadReservationsListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_CUSTOMER_RESERVATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readFoodSellerReservations(reservation.ReadFoodSellerReservationsRequest request,
        io.grpc.stub.StreamObserver<reservation.ReadReservationsListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_FOOD_SELLER_RESERVATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void completeReservation(reservation.CompleteReservationRequest request,
        io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMPLETE_RESERVATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public reservation.ReservationEmptyResponse createReservation(reservation.CreateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_RESERVATION, getCallOptions(), request);
    }

    /**
     */
    public reservation.ReservationEmptyResponse deleteReservation(reservation.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_RESERVATION, getCallOptions(), request);
    }

    /**
     */
    public reservation.ReadReservationsListResponse readCustomerReservations(reservation.ReadCustomerReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_CUSTOMER_RESERVATIONS, getCallOptions(), request);
    }

    /**
     */
    public reservation.ReadReservationsListResponse readFoodSellerReservations(reservation.ReadFoodSellerReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_FOOD_SELLER_RESERVATIONS, getCallOptions(), request);
    }

    /**
     */
    public reservation.ReservationEmptyResponse completeReservation(reservation.CompleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMPLETE_RESERVATION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reservation.ReservationEmptyResponse> createReservation(
        reservation.CreateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_RESERVATION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reservation.ReservationEmptyResponse> deleteReservation(
        reservation.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_RESERVATION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reservation.ReadReservationsListResponse> readCustomerReservations(
        reservation.ReadCustomerReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_CUSTOMER_RESERVATIONS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reservation.ReadReservationsListResponse> readFoodSellerReservations(
        reservation.ReadFoodSellerReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_FOOD_SELLER_RESERVATIONS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reservation.ReservationEmptyResponse> completeReservation(
        reservation.CompleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMPLETE_RESERVATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_DELETE_RESERVATION = 1;
  private static final int METHODID_READ_CUSTOMER_RESERVATIONS = 2;
  private static final int METHODID_READ_FOOD_SELLER_RESERVATIONS = 3;
  private static final int METHODID_COMPLETE_RESERVATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((reservation.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((reservation.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse>) responseObserver);
          break;
        case METHODID_READ_CUSTOMER_RESERVATIONS:
          serviceImpl.readCustomerReservations((reservation.ReadCustomerReservationsRequest) request,
              (io.grpc.stub.StreamObserver<reservation.ReadReservationsListResponse>) responseObserver);
          break;
        case METHODID_READ_FOOD_SELLER_RESERVATIONS:
          serviceImpl.readFoodSellerReservations((reservation.ReadFoodSellerReservationsRequest) request,
              (io.grpc.stub.StreamObserver<reservation.ReadReservationsListResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_RESERVATION:
          serviceImpl.completeReservation((reservation.CompleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<reservation.ReservationEmptyResponse>) responseObserver);
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

  private static final class ReservationServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return reservation.ReservationServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_RESERVATION)
              .addMethod(METHOD_DELETE_RESERVATION)
              .addMethod(METHOD_READ_CUSTOMER_RESERVATIONS)
              .addMethod(METHOD_READ_FOOD_SELLER_RESERVATIONS)
              .addMethod(METHOD_COMPLETE_RESERVATION)
              .build();
        }
      }
    }
    return result;
  }
}
