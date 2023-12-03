package server;

import dao.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.sql.SQLException;

public class ServerStart
{
  public static void main(String[] args)
      throws IOException, InterruptedException, SQLException
  {
    Server server = ServerBuilder.forPort(8080)
        .addService(new CustomerServiceImpl(AccountDAO.getInstance()))
        .addService(new FoodSellerServiceImpl(AccountDAO.getInstance()))
        .addService(new LoginServiceImpl(LoginDAO.getInstance()))
        .addService(new FoodOfferServiceImpl(FoodOfferDAO.getInstance()))
        .addService(new ReservationServiceImpl(ReservationDAO.getInstance()))
        .addService(new RatingAndCommentServiceImpl(RatingAndCommentDAO.getInstance()))
        .build();
    server.start();
    System.out.println("Server ready for incoming requests at port : " + server.getPort() + ".");
    server.awaitTermination();
  }
}
