package server;

import customer.*;
import dao.AccountDAO;
import dao.CustomerDAOInterface;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;

public class CustomerServiceImpl extends CustomerServiceGrpc.CustomerServiceImplBase
{
  private CustomerDAOInterface dao;

  public CustomerServiceImpl() throws SQLException
  {
    this.dao = AccountDAO.getInstance();
  }

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

  @Override public void updateEmail(UpdateEmailRequest request, StreamObserver<UpdateEmailResponse> responseObserver){
    try {
      dao.updateEmail(request.getAccountId(), request.getEmail());
      UpdateEmailResponse response = UpdateEmailResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

}
