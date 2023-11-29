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
      customer.CustomerEmptyResponse> METHOD_CREATE_CUSTOMER =
      io.grpc.MethodDescriptor.<customer.CreateCustomerRequest, customer.CustomerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "customer.CustomerService", "CreateCustomer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CreateCustomerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CustomerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<customer.UpdateCustomerEmailRequest,
      customer.CustomerEmptyResponse> METHOD_UPDATE_EMAIL =
      io.grpc.MethodDescriptor.<customer.UpdateCustomerEmailRequest, customer.CustomerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "customer.CustomerService", "UpdateEmail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.UpdateCustomerEmailRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CustomerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<customer.UpdateCustomerPasswordRequest,
      customer.CustomerEmptyResponse> METHOD_UPDATE_PASSWORD =
      io.grpc.MethodDescriptor.<customer.UpdateCustomerPasswordRequest, customer.CustomerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "customer.CustomerService", "UpdatePassword"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.UpdateCustomerPasswordRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CustomerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<customer.UpdateCustomerPhoneNumberRequest,
      customer.CustomerEmptyResponse> METHOD_UPDATE_PHONE_NUMBER =
      io.grpc.MethodDescriptor.<customer.UpdateCustomerPhoneNumberRequest, customer.CustomerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "customer.CustomerService", "UpdatePhoneNumber"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.UpdateCustomerPhoneNumberRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CustomerEmptyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<customer.DeleteCustomerAccountRequest,
      customer.CustomerEmptyResponse> METHOD_DELETE_ACCOUNT =
      io.grpc.MethodDescriptor.<customer.DeleteCustomerAccountRequest, customer.CustomerEmptyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "customer.CustomerService", "DeleteAccount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.DeleteCustomerAccountRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              customer.CustomerEmptyResponse.getDefaultInstance()))
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
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CUSTOMER, responseObserver);
    }

    /**
     */
    public void updateEmail(customer.UpdateCustomerEmailRequest request,
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_EMAIL, responseObserver);
    }

    /**
     */
    public void updatePassword(customer.UpdateCustomerPasswordRequest request,
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PASSWORD, responseObserver);
    }

    /**
     */
    public void updatePhoneNumber(customer.UpdateCustomerPhoneNumberRequest request,
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PHONE_NUMBER, responseObserver);
    }

    /**
     */
    public void deleteAccount(customer.DeleteCustomerAccountRequest request,
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ACCOUNT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_CUSTOMER,
            asyncUnaryCall(
              new MethodHandlers<
                customer.CreateCustomerRequest,
                customer.CustomerEmptyResponse>(
                  this, METHODID_CREATE_CUSTOMER)))
          .addMethod(
            METHOD_UPDATE_EMAIL,
            asyncUnaryCall(
              new MethodHandlers<
                customer.UpdateCustomerEmailRequest,
                customer.CustomerEmptyResponse>(
                  this, METHODID_UPDATE_EMAIL)))
          .addMethod(
            METHOD_UPDATE_PASSWORD,
            asyncUnaryCall(
              new MethodHandlers<
                customer.UpdateCustomerPasswordRequest,
                customer.CustomerEmptyResponse>(
                  this, METHODID_UPDATE_PASSWORD)))
          .addMethod(
            METHOD_UPDATE_PHONE_NUMBER,
            asyncUnaryCall(
              new MethodHandlers<
                customer.UpdateCustomerPhoneNumberRequest,
                customer.CustomerEmptyResponse>(
                  this, METHODID_UPDATE_PHONE_NUMBER)))
          .addMethod(
            METHOD_DELETE_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                customer.DeleteCustomerAccountRequest,
                customer.CustomerEmptyResponse>(
                  this, METHODID_DELETE_ACCOUNT)))
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
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CUSTOMER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmail(customer.UpdateCustomerEmailRequest request,
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_EMAIL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePassword(customer.UpdateCustomerPasswordRequest request,
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PASSWORD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePhoneNumber(customer.UpdateCustomerPhoneNumberRequest request,
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PHONE_NUMBER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(customer.DeleteCustomerAccountRequest request,
        io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ACCOUNT, getCallOptions()), request, responseObserver);
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
    public customer.CustomerEmptyResponse createCustomer(customer.CreateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CUSTOMER, getCallOptions(), request);
    }

    /**
     */
    public customer.CustomerEmptyResponse updateEmail(customer.UpdateCustomerEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_EMAIL, getCallOptions(), request);
    }

    /**
     */
    public customer.CustomerEmptyResponse updatePassword(customer.UpdateCustomerPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PASSWORD, getCallOptions(), request);
    }

    /**
     */
    public customer.CustomerEmptyResponse updatePhoneNumber(customer.UpdateCustomerPhoneNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PHONE_NUMBER, getCallOptions(), request);
    }

    /**
     */
    public customer.CustomerEmptyResponse deleteAccount(customer.DeleteCustomerAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ACCOUNT, getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<customer.CustomerEmptyResponse> createCustomer(
        customer.CreateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CUSTOMER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<customer.CustomerEmptyResponse> updateEmail(
        customer.UpdateCustomerEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_EMAIL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<customer.CustomerEmptyResponse> updatePassword(
        customer.UpdateCustomerPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PASSWORD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<customer.CustomerEmptyResponse> updatePhoneNumber(
        customer.UpdateCustomerPhoneNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PHONE_NUMBER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<customer.CustomerEmptyResponse> deleteAccount(
        customer.DeleteCustomerAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ACCOUNT, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CUSTOMER = 0;
  private static final int METHODID_UPDATE_EMAIL = 1;
  private static final int METHODID_UPDATE_PASSWORD = 2;
  private static final int METHODID_UPDATE_PHONE_NUMBER = 3;
  private static final int METHODID_DELETE_ACCOUNT = 4;

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
              (io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL:
          serviceImpl.updateEmail((customer.UpdateCustomerEmailRequest) request,
              (io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((customer.UpdateCustomerPasswordRequest) request,
              (io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PHONE_NUMBER:
          serviceImpl.updatePhoneNumber((customer.UpdateCustomerPhoneNumberRequest) request,
              (io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((customer.DeleteCustomerAccountRequest) request,
              (io.grpc.stub.StreamObserver<customer.CustomerEmptyResponse>) responseObserver);
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
