package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.sql.SQLException;

public class ServerStart
{
  public static void main(String[] args)
      throws IOException, InterruptedException, SQLException
  {
    Server server = ServerBuilder.forPort(8080).addService(new CustomerServiceImpl()).build();
    server.start();
    System.out.println("Server ready for incoming requests at port : " + server.getPort() + ".");
    server.awaitTermination();
  }
}
