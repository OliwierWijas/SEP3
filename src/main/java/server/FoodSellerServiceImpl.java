package server;

import com.google.gson.Gson;
import dao.AccountDAO;
import dao.FoodSellerDAOInterface;
import dto.FoodSellerCreationDTO;
import dto.FoodSellerUpdateDTO;
import dto.ReadFoodOffersDTO;
import dto.ReadFoodSellerDTO;
import foodOffer.ReadFoodOffersListResponse;
import foodSeller.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;
import java.util.ArrayList;

public class FoodSellerServiceImpl extends FoodSellerServiceGrpc.FoodSellerServiceImplBase
{
  private FoodSellerDAOInterface dao;
  private Gson gson;

  public FoodSellerServiceImpl(FoodSellerDAOInterface dao) throws SQLException
  {
    this.dao = dao;
    gson = new Gson();
  }

  @Override public void createFoodSeller(CreateFoodSellerRequest request,
      StreamObserver<FoodSellerEmptyResponse> responseObserver)
  {
    try
    {
      FoodSellerCreationDTO dto = new FoodSellerCreationDTO(request.getName(), request.getStreet(), request.getNumber(), request.getCity(), request.getPhoneNumber(), request.getEmail(), request.getPassword());
      dao.createFoodSeller(dto);
      foodSeller.FoodSellerEmptyResponse response = foodSeller.FoodSellerEmptyResponse.newBuilder().build();
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

  @Override public void updateName(UpdateFoodSellerNameRequest request,
      StreamObserver<FoodSellerEmptyResponse> responseObserver)
  {
    try {
      dao.updateName(new FoodSellerUpdateDTO(request.getAccountId(), request.getName(), null,0,null,null,null,null));
      foodSeller.FoodSellerEmptyResponse response = foodSeller.FoodSellerEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    } catch (SQLException e) {
      responseObserver.onError(Status.ALREADY_EXISTS.withDescription("User with the provided email already has an account.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }    }

  @Override public void updateAddress(UpdateFoodSellerAddressRequest request,
      StreamObserver<FoodSellerEmptyResponse> responseObserver)
  {
    try {
      dao.updateAddress(new FoodSellerUpdateDTO(request.getAccountId(), null, request.getStreet(), request.getNumber(), request.getCity(), null,null,null));
      foodSeller.FoodSellerEmptyResponse response = foodSeller.FoodSellerEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    } catch (SQLException e) {
      responseObserver.onError(Status.ALREADY_EXISTS.withDescription("User with the provided email already has an account.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }    }

  @Override public void updateEmail(UpdateFoodSellerEmailRequest request,
      StreamObserver<FoodSellerEmptyResponse> responseObserver)
  {
    try {
      dao.updateEmail(request.getAccountId(), request.getEmail());
      foodSeller.FoodSellerEmptyResponse response = foodSeller.FoodSellerEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    } catch (SQLException e) {
      responseObserver.onError(Status.ALREADY_EXISTS.withDescription("User with the provided email already has an account.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }
  }

  @Override public void updatePassword(UpdateFoodSellerPasswordRequest request,
      StreamObserver<FoodSellerEmptyResponse> responseObserver)
  {
    try{
      dao.updatePassword(request.getAccountId(), request.getPassword());
      foodSeller.FoodSellerEmptyResponse response = foodSeller.FoodSellerEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }catch (SQLException e) {
      responseObserver.onError(Status.INTERNAL.withDescription("Something went wrong. Try again.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }  }

  @Override public void updatePhoneNumber(UpdateFoodSellerPhoneNumberRequest request,
      StreamObserver<FoodSellerEmptyResponse> responseObserver)
  {
    try{
      dao.updatePhoneNumber(request.getAccountId(), request.getPhoneNumber());
      foodSeller.FoodSellerEmptyResponse response = foodSeller.FoodSellerEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    } catch (SQLException e)
    {
      responseObserver.onError(Status.ALREADY_EXISTS.withDescription("User with the provided phone number already has an account.").withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }  }

  @Override public void deleteAccount(DeleteFoodSellerAccountRequest request,
      StreamObserver<FoodSellerEmptyResponse> responseObserver)
  {
    try{
      dao.deleteAccount(request.getAccountId());
      foodSeller.FoodSellerEmptyResponse response = foodSeller.FoodSellerEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }catch (Exception e) {
      responseObserver.onError(Status.INTERNAL.withDescription(e.getMessage()).withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }
  }

  @Override
  public void getFoodSellerById(GetFoodSellerByIdRequest request, StreamObserver<GetFoodSellerByIdResponse> responseObserver) {
    try{
      ReadFoodSellerDTO dto = dao.getFoodSellerById(request.getAccountId());
      GetFoodSellerByIdResponse response = GetFoodSellerByIdResponse.newBuilder().setAccountId(dto.getAccountId()).setEmail(dto.getEmail()).setPhoneNumber(dto.getPhoneNumber()).setName(dto.getName()).setAddress(dto.getAddress()).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }catch (SQLException e) {
      responseObserver.onError(Status.INTERNAL.withDescription(e.getMessage()).withCause(new RuntimeException(e.getMessage())).asRuntimeException());
    }
  }

  @Override public void getAllFoodSellers(GetAllFoodSellersRequest request,
      StreamObserver<GetAllFoodSellersResponse> responseObserver)
  {
    try
    {
      ArrayList<ReadFoodSellerDTO> foodSellers = dao.getAllFoodSellers();
      String string = gson.toJson(foodSellers);
      GetAllFoodSellersResponse response = GetAllFoodSellersResponse.newBuilder().setList(string).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }
}
