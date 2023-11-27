package dao;

import dto.ReadCustomerReservationDTO;
import dto.ReadFoodSellerReservationDTO;
import dto.ReservationCreationDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class ReservationDAO implements ReservationDAOInterface
{
  private static ReservationDAO instance;

  private ReservationDAO() throws SQLException
  {
    DriverManager.registerDriver(new org.postgresql.Driver());
  }

  public static synchronized ReservationDAO getInstance() throws SQLException
  {
    if (instance == null)
      instance = new ReservationDAO();
    return instance;
  }

  private Connection getConnection() throws SQLException
  {
    return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=toofreshtoowastedatabase", "postgres", "sql3486");
  }

  @Override public synchronized void createReservation(ReservationCreationDTO dto)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("INSERT INTO Reservation(customerId, foodOfferId) VALUES (?,?)");
      statement.setInt(1, dto.getCustomerId());
      statement.setInt(2, dto.getFoodOfferId());
      statement.executeUpdate();
    }
    catch(Exception e){
      throw new RuntimeException(e.getMessage());    }
  }

  @Override public synchronized void deleteReservation(int reservationNumber) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("delete from reservation where reservationnumber = ?;");
      statement.setInt(1, reservationNumber);
      statement.executeQuery();
    }
    catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public synchronized ArrayList<ReadCustomerReservationDTO> readCustomerReservations(int customerId) throws SQLException {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM FOODOFFER JOIN RESERVATION  ON foodOffer.id = reservation.foodOfferId JOIN FOODSELLER ON foodSeller.accountId = foodOffer.foodSellerid where reservation.customerId = ?");
      statement.setInt(1, customerId);
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadCustomerReservationDTO> reservationsDtos = new ArrayList<>();
      while(resultSet.next()){
        int foodOfferId = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Date startPickUpTime = resultSet.getDate("startpickuptime");
        Date endPickUpTime = resultSet.getDate("endpickuptime");
        int reservationNumber = resultSet.getInt("reservationnumber");
        int foodSellerId= resultSet.getInt("accountid");
        String foodSellerName = resultSet.getString("name");
        String address = resultSet.getString("address");
        boolean isCompleted = resultSet.getBoolean("isCompleted");
        ReadCustomerReservationDTO dto = new ReadCustomerReservationDTO(foodOfferId, title,description, price, startPickUpTime, endPickUpTime, reservationNumber, foodSellerId, foodSellerName, address, isCompleted);
        reservationsDtos.add(dto);
      }
      return reservationsDtos;
    }
    catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  //@Override
  public synchronized ArrayList<ReadCustomerReservationDTO> readCompletedCustomerReservations(int customerId) throws SQLException {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM FOODOFFER JOIN RESERVATION  ON foodOffer.id = reservation.foodOfferId JOIN FOODSELLER ON foodSeller.accountId = foodOffer.foodSellerid where reservation.customerId = ? AND isCompleted = true");
      statement.setInt(1, customerId);
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadCustomerReservationDTO> reservationsDtos = new ArrayList<>();
      while(resultSet.next()){
        int foodOfferId = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Date startPickUpTime = resultSet.getDate("startpickuptime");
        Date endPickUpTime = resultSet.getDate("endpickuptime");
        int reservationNumber = resultSet.getInt("reservationnumber");
        int foodSellerId= resultSet.getInt("accountid");
        String foodSellerName = resultSet.getString("name");
        String address = resultSet.getString("address");
        ReadCustomerReservationDTO dto = new ReadCustomerReservationDTO(foodOfferId, title,description, price, startPickUpTime, endPickUpTime, reservationNumber, foodSellerId, foodSellerName, address, false);
        reservationsDtos.add(dto);
      }
      return reservationsDtos;
    }
    catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public synchronized ArrayList<ReadFoodSellerReservationDTO> readFoodSellerReservations(int foodSellerId) throws SQLException {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM FOODOFFER JOIN RESERVATION ON foodOffer.id = reservation.foodOfferId JOIN customer on reservation.customerId = customer.accountId where foodOffer.foodSellerid = ?");
      statement.setInt(1, foodSellerId);
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadFoodSellerReservationDTO> reservationDtos = new ArrayList<>();
      while(resultSet.next()){
        int foodOfferId = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Date startPickUpTime = resultSet.getDate("startpickuptime");
        Date endPickUpTime = resultSet.getDate("endpickuptime");
        int reservationNumber = resultSet.getInt("reservationnumber");
        int customerId = resultSet.getInt("customerid");
        String customerFirstName = resultSet.getString("firstname");
        String customerLastName = resultSet.getString("lastname");
        boolean isCompleted = resultSet.getBoolean("isCompleted");

        ReadFoodSellerReservationDTO dto = new ReadFoodSellerReservationDTO(foodOfferId, title, description, price, startPickUpTime, endPickUpTime, reservationNumber, customerId, customerFirstName, customerLastName, isCompleted);
        reservationDtos.add(dto);
      }
      return reservationDtos;
    }
    catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public void completeReservation(int reservationNumber)
      throws SQLException
  {
    try(Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT foodofferid FROM reservation WHERE reservationnumber = ?;");
      statement.setInt(1, reservationNumber);
      ResultSet resultSet = statement.executeQuery();
      if (resultSet.next())
      {
        int foodOfferId = resultSet.getInt(1);
        PreparedStatement statement1 = connection.prepareStatement("UPDATE foodoffer SET iscompleted = true WHERE id = ?;");
        statement1.setInt(1, foodOfferId);
        statement1.executeUpdate();
      }
    }
  }

  //@Override
  public synchronized ArrayList<ReadFoodSellerReservationDTO> readCompletedFoodSellerReservations(int foodSellerId) throws SQLException {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM FOODOFFER JOIN RESERVATION ON foodOffer.id = reservation.foodOfferId JOIN customer on reservation.customerId = customer.accountId where foodOffer.foodSellerid = ? AND foodOffer.isCompleted = true");
      statement.setInt(1, foodSellerId);
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadFoodSellerReservationDTO> reservationDtos = new ArrayList<>();
      while(resultSet.next()){
        int foodOfferId = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Date startPickUpTime = resultSet.getDate("startpickuptime");
        Date endPickUpTime = resultSet.getDate("endpickuptime");
        int reservationNumber = resultSet.getInt("reservationnumber");
        int customerId = resultSet.getInt("customerid");
        String customerFirstName = resultSet.getString("firstname");
        String customerLastName = resultSet.getString("lastname");

        ReadFoodSellerReservationDTO dto = new ReadFoodSellerReservationDTO(foodOfferId, title, description, price, startPickUpTime, endPickUpTime, reservationNumber, customerId, customerFirstName, customerLastName, false);
        reservationDtos.add(dto);
      }
      return reservationDtos;
    }
    catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }
}
