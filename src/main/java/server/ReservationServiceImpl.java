package server;

import com.google.gson.Gson;
import dao.ReservationDAOInterface;
import dto.ReadCustomerReservationDTO;
import dto.ReadFoodSellerReservationDTO;
import dto.ReservationCreationDTO;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import reservation.*;

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
      ReservationCreationDTO dto = new ReservationCreationDTO(request.getCustomerId(), request.getFoodOfferId());
      dao.createReservation(dto);
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
      dao.deleteReservation(request.getReservationNumber());
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

  @Override public void completeReservation(CompleteReservationRequest request,
      StreamObserver<ReservationEmptyResponse> responseObserver)
  {
    try
    {
      dao.completeReservation(request.getReservationNumber());
      ReservationEmptyResponse response = ReservationEmptyResponse.newBuilder().build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    catch (Exception e)
    {
      responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
    }
  }
}
