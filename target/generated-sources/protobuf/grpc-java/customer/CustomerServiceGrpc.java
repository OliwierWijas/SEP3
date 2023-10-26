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
    comments = "Source: CustomerService.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "customer.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<customer.CreateCustomerRequest,
      customer.CreateCustomerResponse> METHOD_CREATE_CUSTOMER =
      io.grpc.MethodDescriptor.<customer.CreateCustomerRequest, customer.CreateCustomerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "customer.CustomerService", "CreateCustomer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CreateCustomerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CreateCustomerResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<customer.UpdateEmailRequest,
      customer.UpdateEmailResponse> METHOD_UPDATE_EMAIL =
      io.grpc.MethodDescriptor.<customer.UpdateEmailRequest, customer.UpdateEmailResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "customer.CustomerService", "UpdateEmail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.UpdateEmailRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.UpdateEmailResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCustomer(customer.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<customer.CreateCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CUSTOMER, responseObserver);
    }

    /**
     */
    public void updateEmail(customer.UpdateEmailRequest request,
        io.grpc.stub.StreamObserver<customer.UpdateEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_EMAIL, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_CUSTOMER,
            asyncUnaryCall(
              new MethodHandlers<
                customer.CreateCustomerRequest,
                customer.CreateCustomerResponse>(
                  this, METHODID_CREATE_CUSTOMER)))
          .addMethod(
            METHOD_UPDATE_EMAIL,
            asyncUnaryCall(
              new MethodHandlers<
                customer.UpdateEmailRequest,
                customer.UpdateEmailResponse>(
                  this, METHODID_UPDATE_EMAIL)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCustomer(customer.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<customer.CreateCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CUSTOMER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmail(customer.UpdateEmailRequest request,
        io.grpc.stub.StreamObserver<customer.UpdateEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_EMAIL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public customer.CreateCustomerResponse createCustomer(customer.CreateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CUSTOMER, getCallOptions(), request);
    }

    /**
     */
    public customer.UpdateEmailResponse updateEmail(customer.UpdateEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_EMAIL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<customer.CreateCustomerResponse> createCustomer(
        customer.CreateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CUSTOMER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<customer.UpdateEmailResponse> updateEmail(
        customer.UpdateEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_EMAIL, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CUSTOMER = 0;
  private static final int METHODID_UPDATE_EMAIL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CUSTOMER:
          serviceImpl.createCustomer((customer.CreateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<customer.CreateCustomerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL:
          serviceImpl.updateEmail((customer.UpdateEmailRequest) request,
              (io.grpc.stub.StreamObserver<customer.UpdateEmailResponse>) responseObserver);
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

  private static final class CustomerServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return customer.CustomerServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_CUSTOMER)
              .addMethod(METHOD_UPDATE_EMAIL)
              .build();
        }
      }
    }
    return result;
  }
}
