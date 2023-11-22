package dao;

import dto.FoodOfferCreationDTO;
import dto.FoodOfferUpdateDTO;
import dto.ReadFoodOffersDTO;

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

  @Override public void createFoodOffer(FoodOfferCreationDTO dto) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("INSERT INTO FoodOffer (title, description, price, startPickUpTime, endPickUpTime, foodSellerId) VALUES (?,?,?,?,?,?);");
      statement.setString(1, dto.getTitle());
      statement.setString(2, dto.getDescription());
      statement.setDouble(3, dto.getPrice());

      shared.Date date = dto.getStartPickUpTime();
      Timestamp start = new Timestamp(date.getYear(), date.getMonth(), date.getDay(), date.getHour(), date.getMinute(), 0, 0);

      statement.setTimestamp(4, start);

      date = dto.getEndPickUpTime();
      Timestamp end = new Timestamp(date.getYear(), date.getMonth(), date.getDay(), date.getHour(), date.getMinute(), 0, 0);

      statement.setTimestamp(5, end);
      statement.setInt(6, dto.getFoodSellerId());
      statement.executeUpdate();
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  @Override
  public ArrayList<ReadFoodOffersDTO> readAvailableFoodOffers() throws SQLException {
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
        Date startPickUpTime = resultSet.getDate("startpickuptime");
        Date endPickUpTime = resultSet.getDate("endpickuptime");
        String foodSellerName = resultSet.getString("name");
        String foodSellerAddress = resultSet.getString("address");

        ReadFoodOffersDTO dto = new ReadFoodOffersDTO(id, foodSellerId, title, description, price, startPickUpTime, endPickUpTime, false, false);
        dto.setFoodSellerName(foodSellerName);
        dto.setFoodSellerAddress(foodSellerAddress);
        foodOffersDTOS.add(dto);
      }
      return foodOffersDTOS;
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public ArrayList<ReadFoodOffersDTO> readFoodOffersByFoodSellerId(int foodSellerId) throws SQLException {
    try (Connection connection = getConnection()){
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM foodoffer WHERE foodsellerid = ? AND isreserved = false AND iscompleted = false");
      statement.setInt(1, foodSellerId);
      ResultSet resultSet = statement.executeQuery();

      ArrayList<ReadFoodOffersDTO> foodOffers = new ArrayList<>();

      while(resultSet.next()){
        int foodOfferId = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String description = resultSet.getString("description");
        double price = resultSet.getDouble("price");
        Date startPickUpTime = resultSet.getDate("startpickuptime");
        Date endPickUpTime = resultSet.getDate("endpickuptime");

        ReadFoodOffersDTO dto = new ReadFoodOffersDTO(foodOfferId, foodSellerId, title, description,price,  startPickUpTime, endPickUpTime, false, false);
        foodOffers.add(dto);
      }
      return foodOffers;
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public void updateFoodOffer(FoodOfferUpdateDTO dto) throws SQLException {
    try(Connection connection = getConnection()){
      PreparedStatement statement = connection.prepareStatement("UPDATE foodoffer SET title = ?, description = ?, price = ?, startpickuptime = ?, endpickuptime = ? WHERE id = ?");
      statement.setString(1, dto.getTitle());
      statement.setString(2, dto.getDescription());
      statement.setDouble(3, dto.getPrice());

      shared.Date date = dto.getStartPickUpTime();
      Timestamp start = new Timestamp(date.getYear(), date.getMonth(), date.getDay(), date.getHour(), date.getMinute(), 0, 0);

      statement.setTimestamp(4, start);

      date = dto.getEndPickUpTime();
      Timestamp end = new Timestamp(date.getYear(), date.getMonth(), date.getDay(), date.getHour(), date.getMinute(), 0, 0);

      statement.setTimestamp(5, end);
      statement.setInt(6, dto.getFoodOfferId());
      statement.executeUpdate();

    }catch(Exception e){
      e.printStackTrace();
    }
  }

  @Override
  public void deleteFoodOffer(int foodOfferId) throws SQLException {
    try(Connection connection = getConnection()){
      PreparedStatement statement = connection.prepareStatement("DELETE FROM foodoffer WHERE id = ?");
      statement.setInt(1, foodOfferId);
      statement.executeUpdate();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
