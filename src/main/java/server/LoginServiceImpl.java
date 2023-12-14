package server;

import dao.LoginDAO;
import dao.LoginDAOInterface;
import dto.UserBasicDto;
import login.LoginRequest;
import login.LoginResponse;
import login.LoginServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;

public class LoginServiceImpl extends LoginServiceGrpc.LoginServiceImplBase
{
  private LoginDAOInterface dao;

  public LoginServiceImpl(LoginDAOInterface dao) throws SQLException
  {
    this.dao = dao;
  }

  @Override public void login(LoginRequest request,
      StreamObserver<LoginResponse> responseObserver)
  {
    try
    {
      UserBasicDto dto = dao.login(request.getEmail(), request.getPassword());
      LoginResponse response = LoginResponse.newBuilder().setId(dto.getId()).setEmail(dto.getEmail()).setPassword(dto.getPassword()).setPhoneNumber(dto.getPhoneNumber()).setType(dto.getType()).setFirstName(
          dto.getFirstName()).setLastName(dto.getLastName()).setName(dto.getName()).setAddress(dto.getAddress()).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }
  }
}
