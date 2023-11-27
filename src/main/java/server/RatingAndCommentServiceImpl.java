package server;

import com.google.gson.Gson;
import dao.RatingAndCommentDAOInterface;
import dto.*;
import foodOffer.FoodOfferEmptyResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import ratingAndComment.*;
import shared.MyDate;

import java.util.ArrayList;

public class RatingAndCommentServiceImpl extends RatingAndCommentServiceGrpc.RatingAndCommentServiceImplBase {

    private RatingAndCommentDAOInterface dao;
    private Gson gson;

    public RatingAndCommentServiceImpl(RatingAndCommentDAOInterface dao) {
        this.dao = dao;
        this.gson = new Gson();
    }

    @Override
    public void createRating(CreateAndUpdateRatingRequest request, StreamObserver<RatingAndCommentEmptyResponse> responseObserver) {
        try
        {
            RatingBasicDTO dto = new RatingBasicDTO(request.getFoodSellerId(), request.getCustomerId(), request.getRate());
            dao.createRating(dto);
            RatingAndCommentEmptyResponse response = RatingAndCommentEmptyResponse.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
        }
    }

    @Override
    public void createComment(CreateCommentRequest request, StreamObserver<RatingAndCommentEmptyResponse> responseObserver) {
        try
        {
            CommentBasicDTO dto = new CommentBasicDTO(request.getFoodSellerId(), request.getCustomerId(), request.getComment());
            dao.createComment(dto);
            RatingAndCommentEmptyResponse response = RatingAndCommentEmptyResponse.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
        }
    }

    @Override
    public void updateRating(CreateAndUpdateRatingRequest request, StreamObserver<RatingAndCommentEmptyResponse> responseObserver) {
        try
        {
            RatingBasicDTO dto = new RatingBasicDTO(request.getFoodSellerId(), request.getCustomerId(), request.getRate());
            dao.updateRating(dto);
            RatingAndCommentEmptyResponse response = RatingAndCommentEmptyResponse.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
        }
    }

    @Override
    public void deleteComment(DeleteCommentRequest request, StreamObserver<RatingAndCommentEmptyResponse> responseObserver) {
        try
        {
            dao.deleteComment(request.getCommentId());
            RatingAndCommentEmptyResponse response = RatingAndCommentEmptyResponse.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
        }
    }

    @Override
    public void readCommentsByFoodSellerId(ReadCommentsByFoodSellerIdRequest request, StreamObserver<ReadCommentsByFoodSellerIdResponse> responseObserver) {
        try
        {
            ArrayList<ReadCommentDTO> comments = dao.readCommentsByFoodSellerId(request.getFoodSellerId());
            ReadCommentsByFoodSellerIdResponse response = ReadCommentsByFoodSellerIdResponse.newBuilder().setList(gson.toJson(comments)).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
        }
    }

    @Override
    public void readAverageRatingByFoodSellerId(ReadAverageRatingByFoodSellerIdRequest request, StreamObserver<ReadAverageRatingByFoodSellerIdResponse> responseObserver) {
        try
        {
            double rating = dao.readAverageRatingByFoodSellerId(request.getFoodSellerId());
            ReadAverageRatingByFoodSellerIdResponse response = ReadAverageRatingByFoodSellerIdResponse.newBuilder().setRate(rating).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
        }
    }

    @Override
    public void readRating(ReadRatingRequest request, StreamObserver<ReadRatingResponse> responseObserver) {
        try
        {
            ReadRatingDTO dto = new ReadRatingDTO(request.getCustomerId(), request.getFoodSellerId());
            int rating = dao.readRating(dto);
            ReadRatingResponse response = ReadRatingResponse.newBuilder().setRate(rating).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            responseObserver.onError(Status.INTERNAL.withDescription("Internal error. Try again later.").asRuntimeException());
        }
    }
}
