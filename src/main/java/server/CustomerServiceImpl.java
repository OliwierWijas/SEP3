package server;

import customer.CreateCustomerRequest;
import customer.CreateCustomerResponse;
import customer.CustomerServiceGrpc;
import dao.CustomerDAOInterface;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;

public class CustomerServiceImpl extends CustomerServiceGrpc.CustomerServiceImplBase
{
  private CustomerDAOInterface dao;

  @Override public void createCustomer(CreateCustomerRequest request, StreamObserver<CreateCustomerResponse> responseObserver)
  {
    try
    {
      dao.createCustomer(request.getFirstName(), request.getLastName(), request.getPhoneNumber(), request.getEmail(), request.getPassword());
      CreateCustomerResponse response = CreateCustomerResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (SQLException e)
    {
      throw new RuntimeException(e);
    }
  }
}
