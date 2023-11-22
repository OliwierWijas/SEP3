package dao;

import dto.ReadCustomerReservationDTO;
import dto.ReadFoodSellerReservationDTO;

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
    return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=toofreshtoowastedatabase", "postgres", "xf31bhl9");
  }

  @Override public void createReservation(int customerId, int foodOfferId)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("INSERT INTO Reservation(customerId, foodOfferId) VALUES (?,?)");
      statement.setInt(1, customerId);
      statement.setInt(2, foodOfferId);
      statement.executeUpdate();
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

  @Override public void deleteReservation(int foodOfferId) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("DELETE FROM reservation WHERE foodOfferId = ? AND (SELECT isCompleted FROM foodOffer WHERE id = ?) = FALSE");
      statement.setInt(1, foodOfferId);
      statement.setInt(2, foodOfferId);
      statement.executeUpdate();
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

  @Override
  public ArrayList<ReadCustomerReservationDTO> readCustomerReservations(int customerId) throws SQLException {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM FOODOFFER JOIN RESERVATION  ON foodOffer.id = reservation.foodOfferId JOIN FOODSELLER ON foodSeller.accountId = foodOffer.foodSellerid where reservation.customerId = ? AND isCompleted = false");
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
        ReadCustomerReservationDTO dto = new ReadCustomerReservationDTO(foodOfferId, title,description, price, startPickUpTime, endPickUpTime, reservationNumber, foodSellerId, foodSellerName, address);
        reservationsDtos.add(dto);
      }
      return reservationsDtos;
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public ArrayList<ReadCustomerReservationDTO> readCompletedCustomerReservations(int customerId) throws SQLException {
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
        ReadCustomerReservationDTO dto = new ReadCustomerReservationDTO(foodOfferId, title,description, price, startPickUpTime, endPickUpTime, reservationNumber, foodSellerId, foodSellerName, address);
        reservationsDtos.add(dto);
      }
      return reservationsDtos;
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public ArrayList<ReadFoodSellerReservationDTO> readFoodSellerReservations(int foodSellerId) throws SQLException {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM FOODOFFER JOIN RESERVATION ON foodOffer.id = reservation.foodOfferId JOIN customer on reservation.customerId = customer.accountId where foodOffer.foodSellerid = ? AND foodOffer.isCompleted = false");
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

        ReadFoodSellerReservationDTO dto = new ReadFoodSellerReservationDTO(foodOfferId, title, description, price, startPickUpTime, endPickUpTime, reservationNumber, customerId, customerFirstName, customerLastName);
        reservationDtos.add(dto);
      }
      return reservationDtos;
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public ArrayList<ReadFoodSellerReservationDTO> readCompletedFoodSellerReservations(int foodSellerId) throws SQLException {
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

        ReadFoodSellerReservationDTO dto = new ReadFoodSellerReservationDTO(foodOfferId, title, description, price, startPickUpTime, endPickUpTime, reservationNumber, customerId, customerFirstName, customerLastName);
        reservationDtos.add(dto);
      }
      return reservationDtos;
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return  null;
  }
}
