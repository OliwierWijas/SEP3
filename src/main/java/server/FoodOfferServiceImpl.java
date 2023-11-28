package server;

import com.google.gson.Gson;
import dao.FoodOfferDAOInterface;
import dto.FoodOfferCreationDTO;
import dto.FoodOfferUpdateDTO;
import dto.ReadFoodOffersDTO;
import foodOffer.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import shared.MyDate;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class FoodOfferServiceImpl extends FoodOfferServiceGrpc.FoodOfferServiceImplBase
{
  private FoodOfferDAOInterface dao;
  private Gson gson;

  public FoodOfferServiceImpl(FoodOfferDAOInterface dao)
  {
    this.dao = dao;
    this.gson = new Gson();
  }

  @Override public void createFoodOffer(CreateFoodOfferRequest request,
      StreamObserver<FoodOfferEmptyResponse> responseObserver)
  {
    try
    {
      FoodOfferCreationDTO dto = new FoodOfferCreationDTO(request.getFoodSellerId(), request.getTitle(), request.getDescription(), request.getPrice(), gson.fromJson(request.getStartPickUpTime(), MyDate.class), gson.fromJson(request.getEndPickUpTime(), MyDate.class));
      dao.createFoodOffer(dto);
      FoodOfferEmptyResponse response = FoodOfferEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
        responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override public void readAvailableFoodOffers(
      ReadAvailableFoodOffersRequest request,
      StreamObserver<ReadFoodOffersListResponse> responseObserver)
  {
    try
    {
      ArrayList<ReadFoodOffersDTO> availableFoodOffers = dao.readAvailableFoodOffers();
      String string = gson.toJson(availableFoodOffers);
      ReadFoodOffersListResponse response = ReadFoodOffersListResponse.newBuilder().setList(string).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override public void readFoodOffersByFoodSellerId(
      ReadFoodOffersByFoodSellerIdRequest request,
      StreamObserver<ReadFoodOffersListResponse> responseObserver)
  {
    try
    {
      ArrayList<ReadFoodOffersDTO> foodOffers = dao.readFoodOffersByFoodSellerId(request.getFoodSellerId());
      String string = gson.toJson(foodOffers);
      ReadFoodOffersListResponse response = ReadFoodOffersListResponse.newBuilder().setList(string).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override public void updateFoodOffer(UpdateFoodOfferRequest request,
      StreamObserver<FoodOfferEmptyResponse> responseObserver)
  {
    try
    {
      FoodOfferUpdateDTO dto = new FoodOfferUpdateDTO(request.getFoodOfferId(), request.getTitle(), request.getDescription(), request.getPrice(), gson.fromJson(request.getStartPickUpTime(), MyDate.class), gson.fromJson(request.getEndPickUpTime(), MyDate.class));
      dao.updateFoodOffer(dto);
      FoodOfferEmptyResponse response = FoodOfferEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override public void deleteFoodOffer(DeleteFoodOfferRequest request,
      StreamObserver<FoodOfferEmptyResponse> responseObserver)
  {
    try
    {
      dao.deleteFoodOffer(request.getFoodOfferId());
      FoodOfferEmptyResponse response = FoodOfferEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override
  public void readFoodOfferById(ReadFoodOfferByIdRequest request, StreamObserver<ReadFoodOfferByIdResponse> responseObserver) {
    try
    {
      ReadFoodOffersDTO dto = dao.readFoodOfferById(request.getId());
      System.out.println(dto);
      String start = gson.toJson(dto.getStartPickUpTime());
      String end = gson.toJson(dto.getEndPickUpTime());
      ReadFoodOfferByIdResponse response = ReadFoodOfferByIdResponse.newBuilder().setFoodSellerId(dto.getId()).setFoodSellerId(dto.getFoodSellerId()).setTitle(dto.getTitle()).setDescription(dto.getDescription()).setPrice(dto.getPrice()).setStartPickUpTime(start).setEndPickUpTime(end).setFoodSellerName(dto.getFoodSellerName()).setFoodSellerAddress(dto.getFoodSellerAddress()).setIsReserved(dto.isReserved()).setIsCompleted(dto.isCompleted()).build();
      System.out.println(response);
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }
}
