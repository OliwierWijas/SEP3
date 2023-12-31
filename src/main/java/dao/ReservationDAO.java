package dao;

import dto.*;
import shared.MyDate;

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
    return DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres?currentSchema=toofreshtoowastedatabase",
        "postgres", "xf31bhl9");
  }

  @Override public synchronized void createReservation(ReservationCreationDTO dto)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement(
          "INSERT INTO Reservation(customerId, foodOfferId) VALUES (?,?)");
      statement.setInt(1, dto.getCustomerId());
      statement.setInt(2, dto.getFoodOfferId());
      statement.executeUpdate();
    }
    catch (Exception e)
    {
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized void deleteReservation(int reservationNumber)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement(
          "delete from reservation where reservationnumber = ?;");
      statement.setInt(1, reservationNumber);
      statement.executeUpdate();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized ArrayList<ReadCustomerReservationDTO> readCustomerReservations(
      int customerId) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement(
          "SELECT * FROM FOODOFFER JOIN RESERVATION  ON foodOffer.id = reservation.foodOfferId JOIN FOODSELLER ON foodSeller.accountId = foodOffer.foodSellerid where reservation.customerId = ?");
      statement.setInt(1, customerId);
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadCustomerReservationDTO> reservationsDtos = new ArrayList<>();
      while (resultSet.next())
      {
        int foodOfferId = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Timestamp startPickUpTime = resultSet.getTimestamp("startpickuptime");
        Timestamp endPickUpTime = resultSet.getTimestamp("endpickuptime");

        MyDate start = new MyDate(startPickUpTime.getYear() + 1900,
            startPickUpTime.getMonth() + 1, startPickUpTime.getDate(),
            startPickUpTime.getHours(), startPickUpTime.getMinutes());
        MyDate end = new MyDate(endPickUpTime.getYear() + 1900,
            endPickUpTime.getMonth() + 1, endPickUpTime.getDate(), endPickUpTime.getHours(), endPickUpTime.getMinutes());

        int reservationNumber = resultSet.getInt("reservationnumber");
        int foodSellerId = resultSet.getInt("accountid");
        String foodSellerName = resultSet.getString("name");
        String street = resultSet.getString("street");
        int number = resultSet.getInt("number");
        String city = resultSet.getString("city");
        String address = street + " " + number + ", " + city;
        boolean isCompleted = resultSet.getBoolean("isCompleted");
        String photo = resultSet.getString(10);
        ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(foodSellerId, "", "", foodSellerName, address, "");
        ReadCustomerReservationDTO dto = new ReadCustomerReservationDTO(
            foodOfferId, title, description, price, start, end,
            reservationNumber, foodSeller,
            isCompleted, photo);
        reservationsDtos.add(dto);
      }
      return reservationsDtos;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized ArrayList<ReadFoodSellerReservationDTO> readFoodSellerReservations(
      int foodSellerId) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement(
          "SELECT * FROM FOODOFFER JOIN RESERVATION ON foodOffer.id = reservation.foodOfferId JOIN customer on reservation.customerId = customer.accountId where foodOffer.foodSellerid = ?");
      statement.setInt(1, foodSellerId);
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadFoodSellerReservationDTO> reservationDtos = new ArrayList<>();
      while (resultSet.next())
      {
        int foodOfferId = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Timestamp startPickUpTime = resultSet.getTimestamp("startpickuptime");
        Timestamp endPickUpTime = resultSet.getTimestamp("endpickuptime");

        MyDate start = new MyDate(startPickUpTime.getYear() + 1900,
            startPickUpTime.getMonth() + 1, startPickUpTime.getDate(),
            startPickUpTime.getHours(), startPickUpTime.getMinutes());
        MyDate end = new MyDate(endPickUpTime.getYear() + 1900,
            endPickUpTime.getMonth() + 1, endPickUpTime.getDate(), endPickUpTime.getHours(), endPickUpTime.getMinutes());

        int reservationNumber = resultSet.getInt("reservationnumber");
        int customerId = resultSet.getInt("customerid");
        String customerFirstName = resultSet.getString("firstname");
        String customerLastName = resultSet.getString("lastname");

        PreparedStatement statement1 = connection.prepareStatement(
            "SELECT * FROM account where id = ?");
        statement1.setInt(1, customerId);
        ResultSet resultSet1 = statement1.executeQuery();
        String phoneNumber = "";
        if (resultSet1.next())
        {
          phoneNumber = resultSet1.getString("phonenumber");
        }

        boolean isCompleted = resultSet.getBoolean("isCompleted");
        String photo = resultSet.getString(10);
        ReadCustomerDTO customer = new ReadCustomerDTO(customerId, "", phoneNumber, customerFirstName, customerLastName);
        ReadFoodSellerReservationDTO dto = new ReadFoodSellerReservationDTO(
            foodOfferId, title, description, price, start, end,
            reservationNumber, customer,
            isCompleted, photo);
        reservationDtos.add(dto);
      }
      return reservationDtos;
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public void completeReservation(int reservationNumber)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement(
          "SELECT foodofferid FROM reservation WHERE reservationnumber = ?;");
      statement.setInt(1, reservationNumber);
      ResultSet resultSet = statement.executeQuery();
      if (resultSet.next())
      {
        int foodOfferId = resultSet.getInt(1);
        PreparedStatement statement1 = connection.prepareStatement(
            "UPDATE foodoffer SET iscompleted = true WHERE id = ?;");
        statement1.setInt(1, foodOfferId);
        statement1.executeUpdate();
      }
    }
  }
}