package server;

import com.google.gson.Gson;
import dao.ReservationDAOInterface;
import dto.ReadCustomerReservationDTO;
import dto.ReadFoodSellerReservationDTO;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import reservation.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationServiceImpl extends ReservationServiceGrpc.ReservationServiceImplBase
{
  private ReservationDAOInterface dao;
  private Gson gson;

  public ReservationServiceImpl(ReservationDAOInterface dao)
  {
    this.dao = dao;
    this.gson = new Gson();
  }

  @Override public void createReservation(CreateReservationRequest request,
      StreamObserver<ReservationEmptyResponse> responseObserver)
  {
    try
    {
      dao.createReservation(request.getCustomerId(), request.getFoodOfferId());
      ReservationEmptyResponse response = ReservationEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override public void deleteReservation(DeleteReservationRequest request,
      StreamObserver<ReservationEmptyResponse> responseObserver)
  {
    try
    {
      dao.deleteReservation(request.getFoodOfferId());
      ReservationEmptyResponse response = ReservationEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override public void readCustomerReservations(
      ReadCustomerReservationsRequest request,
      StreamObserver<ReadReservationsListResponse> responseObserver)
  {
    try
    {
      ArrayList<ReadCustomerReservationDTO> customerReservations = dao.readCustomerReservations(request.getCustomerId());
      String string = gson.toJson(customerReservations);
      ReadReservationsListResponse response = ReadReservationsListResponse.newBuilder().setList(string).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }

  @Override public void readFoodSellerReservations(
      ReadFoodSellerReservationsRequest request,
      StreamObserver<ReadReservationsListResponse> responseObserver)
  {
    try
    {
      ArrayList<ReadFoodSellerReservationDTO> foodSellerReservations = dao.readFoodSellerReservations(request.getFoodSellerId());
      String string = gson.toJson(foodSellerReservations);
      ReadReservationsListResponse response = ReadReservationsListResponse.newBuilder().setList(string).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }
}
