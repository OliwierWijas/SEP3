package dao;

import dto.FoodOfferCreationDTO;
import dto.FoodOfferUpdateDTO;
import dto.ReadFoodOffersDTO;
import dto.ReadFoodSellerDTO;
import shared.MyDate;

import java.sql.*;
import java.util.ArrayList;

public class FoodOfferDAO implements FoodOfferDAOInterface
{
  private static FoodOfferDAO instance;

  private FoodOfferDAO() throws SQLException
  {
    DriverManager.registerDriver(new org.postgresql.Driver());
  }

  public static synchronized FoodOfferDAO getInstance() throws SQLException
  {
    if (instance == null)
      instance = new FoodOfferDAO();
    return instance;
  }

  private Connection getConnection() throws SQLException
  {
    return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=toofreshtoowastedatabase", "postgres", "xf31bhl9");
  }

  @Override public synchronized void createFoodOffer(FoodOfferCreationDTO dto) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("INSERT INTO FoodOffer (title, description, price, startPickUpTime, endPickUpTime, foodSellerId, photo) VALUES (?,?,?,?,?,?,?);");
      statement.setString(1, dto.getTitle());
      statement.setString(2, dto.getDescription());
      statement.setDouble(3, dto.getPrice());

      MyDate myDate = dto.getStartPickUpTime();
      Timestamp start = new Timestamp(myDate.getYear() - 1900, myDate.getMonth() - 1, myDate.getDay(), myDate.getHour(), myDate.getMinute(), 0, 0);

      statement.setTimestamp(4, start);

      myDate = dto.getEndPickUpTime();
      Timestamp end = new Timestamp(myDate.getYear() - 1900, myDate.getMonth() - 1, myDate.getDay(), myDate.getHour(), myDate.getMinute(), 0, 0);

      statement.setTimestamp(5, end);
      statement.setInt(6, dto.getFoodSellerId());
      statement.setString(7, dto.getPhoto());
      statement.executeUpdate();
    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public synchronized ArrayList<ReadFoodOffersDTO> readAvailableFoodOffers() throws SQLException {
    try (Connection connection = getConnection()){
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM FoodOffer JOIN foodseller ON foodoffer.foodsellerid = foodseller.accountid WHERE iscompleted = false and isreserved = false");
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadFoodOffersDTO> foodOffersDTOS = new ArrayList<>();
      while(resultSet.next()){
        int id = resultSet.getInt("id");
        int foodSellerId = resultSet.getInt("foodsellerid");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Timestamp startPickUpTime = resultSet.getTimestamp("startpickuptime");
        Timestamp endPickUpTime = resultSet.getTimestamp("endpickuptime");
        String foodSellerName = resultSet.getString("name");
        String street = resultSet.getString("street");
        int number = resultSet.getInt("number");
        String city = resultSet.getString("city");
        String foodSellerAddress = street + " " + number + ", " + city;
        String photo = resultSet.getString(10);

        MyDate start = new MyDate(startPickUpTime.getYear() + 1900, startPickUpTime.getMonth() + 1, startPickUpTime.getDate(), startPickUpTime.getHours(), startPickUpTime.getMinutes());
        MyDate end = new MyDate(endPickUpTime.getYear() + 1900, endPickUpTime.getMonth() + 1, endPickUpTime.getDate(), endPickUpTime.getHours(), endPickUpTime.getMinutes());

        ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(foodSellerId, "", "", foodSellerName, foodSellerAddress, "");
        ReadFoodOffersDTO dto = new ReadFoodOffersDTO(id, foodSeller, title, description, price, start, end, false, false, photo);
        foodOffersDTOS.add(dto);
      }
      return foodOffersDTOS;
    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public synchronized ArrayList<ReadFoodOffersDTO> readFoodOffersByFoodSellerId(int foodSellerId) throws SQLException {
    try (Connection connection = getConnection()){
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM foodoffer WHERE foodsellerid = ?");
      statement.setInt(1, foodSellerId);
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadFoodOffersDTO> foodOffers = new ArrayList<>();

      while(resultSet.next()){
        int foodOfferId = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Timestamp startPickUpTime = resultSet.getTimestamp("startpickuptime");
        Timestamp endPickUpTime = resultSet.getTimestamp("endpickuptime");

        MyDate start = new MyDate(startPickUpTime.getYear() + 1900, startPickUpTime.getMonth() + 1, startPickUpTime.getDate(), startPickUpTime.getHours(), startPickUpTime.getMinutes());
        MyDate end = new MyDate(endPickUpTime.getYear() + 1900, endPickUpTime.getMonth() + 1, endPickUpTime.getDate(), endPickUpTime.getHours(), endPickUpTime.getMinutes());
        boolean isReserved = resultSet.getBoolean("isreserved");
        boolean isCompleted = resultSet.getBoolean("iscompleted");
        String photo = resultSet.getString("photo");
        ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(foodSellerId, "", "", "", "", "");
        ReadFoodOffersDTO dto = new ReadFoodOffersDTO(foodOfferId, foodSeller, title, description,price,  start, end, isReserved, isCompleted, photo);
        foodOffers.add(dto);
      }
      return foodOffers;
    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public synchronized void updateFoodOffer(FoodOfferUpdateDTO dto) throws SQLException {
    try(Connection connection = getConnection()){
      PreparedStatement statement = connection.prepareStatement("UPDATE foodoffer SET title = ?, description = ?, price = ?, startpickuptime = ?, endpickuptime = ? WHERE id = ?");
      statement.setString(1, dto.getTitle());
      statement.setString(2, dto.getDescription());
      statement.setDouble(3, dto.getPrice());

      MyDate myDate = dto.getStartPickUpTime();
      Timestamp start = new Timestamp(myDate.getYear() - 1900, myDate.getMonth() - 1, myDate.getDay(), myDate.getHour(), myDate.getMinute(), 0, 0);

      statement.setTimestamp(4, start);

      myDate = dto.getEndPickUpTime();
      Timestamp end = new Timestamp(myDate.getYear() - 1900, myDate.getMonth() - 1, myDate.getDay() , myDate.getHour(), myDate.getMinute(), 0, 0);

      statement.setTimestamp(5, end);
      statement.setInt(6, dto.getFoodOfferId());
      statement.executeUpdate();

    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public synchronized void deleteFoodOffer(int foodOfferId) throws SQLException {
    try(Connection connection = getConnection()){
      PreparedStatement statement = connection.prepareStatement("DELETE FROM foodoffer WHERE id = ?");
      statement.setInt(1, foodOfferId);
      statement.executeUpdate();
    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public ReadFoodOffersDTO readFoodOfferById(int id) throws SQLException {
    try (Connection connection = getConnection()){
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM foodoffer JOIN foodseller on foodoffer.foodsellerid = foodseller.accountid WHERE foodoffer.id = ?");
      statement.setInt(1, id);
      ResultSet resultSet = statement.executeQuery();
      if(resultSet.next()){
        int foodSellerId = resultSet.getInt("foodsellerid");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Timestamp startPickUpTime = resultSet.getTimestamp("startpickuptime");
        Timestamp endPickUpTime = resultSet.getTimestamp("endpickuptime");
        String foodSellerName = resultSet.getString("name");
        String street = resultSet.getString("street");
        int number = resultSet.getInt("number");
        String city = resultSet.getString("city");
        String foodSellerAddress = street + " " + number + ", " + city;
        MyDate start = new MyDate(startPickUpTime.getYear() + 1900, startPickUpTime.getMonth() + 1, startPickUpTime.getDate(), startPickUpTime.getHours(), startPickUpTime.getMinutes());
        MyDate end = new MyDate(endPickUpTime.getYear() + 1900, endPickUpTime.getMonth() + 1, endPickUpTime.getDate(), endPickUpTime.getHours(), endPickUpTime.getMinutes());
        boolean isReserved = resultSet.getBoolean("isreserved");
        boolean isCompleted = resultSet.getBoolean("iscompleted");
        String photo = resultSet.getString("photo");
        ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(foodSellerId, "", "", foodSellerName, foodSellerAddress, "");
        ReadFoodOffersDTO dto = new ReadFoodOffersDTO(id, foodSeller, title, description,price,  start, end, isReserved, isCompleted, photo);
        return dto;
      }
    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
    return null;
  }
}
