package customer;

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
    comments = "Source: FoodSeller.proto")
public final class CustomergfServiceGrpc {

  private CustomergfServiceGrpc() {}

  public static final String SERVICE_NAME = "customer.CustomergfService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<customer.CreategfCustomerRequest,
      customer.CreategfCustomerResponse> METHOD_CREATE_CUSTOMER =
      io.grpc.MethodDescriptor.<customer.CreategfCustomerRequest, customer.CreategfCustomerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "customer.CustomergfService", "CreateCustomer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CreategfCustomerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CreategfCustomerResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomergfServiceStub newStub(io.grpc.Channel channel) {
    return new CustomergfServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomergfServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomergfServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomergfServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomergfServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomergfServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCustomer(customer.CreategfCustomerRequest request,
        io.grpc.stub.StreamObserver<customer.CreategfCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CUSTOMER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_CUSTOMER,
            asyncUnaryCall(
              new MethodHandlers<
                customer.CreategfCustomerRequest,
                customer.CreategfCustomerResponse>(
                  this, METHODID_CREATE_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class CustomergfServiceStub extends io.grpc.stub.AbstractStub<CustomergfServiceStub> {
    private CustomergfServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomergfServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomergfServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomergfServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCustomer(customer.CreategfCustomerRequest request,
        io.grpc.stub.StreamObserver<customer.CreategfCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CUSTOMER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomergfServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomergfServiceBlockingStub> {
    private CustomergfServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomergfServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomergfServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomergfServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public customer.CreategfCustomerResponse createCustomer(customer.CreategfCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CUSTOMER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomergfServiceFutureStub extends io.grpc.stub.AbstractStub<CustomergfServiceFutureStub> {
    private CustomergfServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomergfServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomergfServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomergfServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<customer.CreategfCustomerResponse> createCustomer(
        customer.CreategfCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CUSTOMER, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CUSTOMER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomergfServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomergfServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CUSTOMER:
          serviceImpl.createCustomer((customer.CreategfCustomerRequest) request,
              (io.grpc.stub.StreamObserver<customer.CreategfCustomerResponse>) responseObserver);
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

  private static final class CustomergfServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return customer.FoodSeller.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CustomergfServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomergfServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_CUSTOMER)
              .build();
        }
      }
    }
    return result;
  }
}
