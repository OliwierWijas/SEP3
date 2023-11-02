package server;

import customer.*;
import dao.AccountDAO;
import dao.CustomerDAOInterface;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;

public class CustomerServiceImpl extends CustomerServiceGrpc.CustomerServiceImplBase
{
  private CustomerDAOInterface dao;

  public CustomerServiceImpl() throws SQLException
  {
    this.dao = AccountDAO.getInstance();
  }

  @Override public void createCustomer(CreateCustomerRequest request, StreamObserver<EmptyResponse> responseObserver)
  {
    try
    {
      dao.createCustomer(request.getFirstName(), request.getLastName(), request.getPhoneNumber(), request.getEmail(), request.getPassword());
      EmptyResponse response = EmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (SQLException e)
    {
      if(e.getMessage().contains("duplicate key value violates unique constraint \"account_email_key\""))
        responseObserver.onError(Status.ALREADY_EXISTS.withDescription("User with the provided email already has an account.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
      else if (e.getMessage().contains("duplicate key value violates unique constraint \"account_phonenumber_key\""))
        responseObserver.onError(Status.ALREADY_EXISTS.withDescription("User with the provided phone number already has an account.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
      else
        responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override public void updateEmail(UpdateEmailRequest request, StreamObserver<EmptyResponse> responseObserver){
    try {
      dao.updateEmail(request.getAccountId(), request.getEmail());
      EmptyResponse response = EmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    } catch (SQLException e) {
      responseObserver.onError(Status.ALREADY_EXISTS.withDescription("User with the provided email already has an account.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }
  }

  @Override public void updatePassword(UpdatePasswordRequest request, StreamObserver<EmptyResponse> responseObserver){
    try{
      dao.updatePassword(request.getAccountId(), request.getPassword());
      EmptyResponse response = EmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }catch (SQLException e) {
      responseObserver.onError(Status.INTERNAL.withDescription("Something went wrong. Try again.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }
  }

  @Override public void updatePhoneNumber(UpdatePhoneNumberRequest request, StreamObserver<EmptyResponse> responseObserver)
  {
    try{
      dao.updatePhoneNumber(request.getAccountId(), request.getPhoneNumber());
      EmptyResponse response = EmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    } catch (SQLException e)
    {
      responseObserver.onError(Status.ALREADY_EXISTS.withDescription("User with the provided phone number already has an account.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }
  }
}
