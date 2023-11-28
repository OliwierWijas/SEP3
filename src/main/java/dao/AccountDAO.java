package dao;

import dto.CustomerCreationDTO;
import dto.FoodSellerCreationDTO;
import dto.ReadFoodSellerDTO;

import java.sql.*;

public class AccountDAO implements CustomerDAOInterface, FoodSellerDAOInterface
{
  private static AccountDAO instance;

  private AccountDAO() throws SQLException
  {
    DriverManager.registerDriver(new org.postgresql.Driver());
  }

  public static synchronized AccountDAO getInstance() throws SQLException
  {
    if (instance == null)
      instance = new AccountDAO();
    return instance;
  }

  private Connection getConnection() throws SQLException
  {
    return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=toofreshtoowastedatabase", "postgres", "sql3486");
  }

  @Override public synchronized void createCustomer(CustomerCreationDTO dto) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("INSERT INTO Account (email, phoneNumber, password, type) VALUES (?,?,?,?);", PreparedStatement.RETURN_GENERATED_KEYS);
      statement.setString(1, dto.getEmail());
      statement.setString(2, dto.getPhoneNumber());
      statement.setString(3, dto.getPassword());
      statement.setString(4, "customer");
      statement.executeUpdate();
      ResultSet keys = statement.getGeneratedKeys();
      if (keys.next())
      {
        int id = keys.getInt(1);
        PreparedStatement statement1 = connection.prepareStatement("INSERT INTO Customer(accountId, firstName, lastName) VALUES (?,?,?);");
        statement1.setInt(1, id);
        statement1.setString(2, dto.getFirstName());
        statement1.setString(3, dto.getLastName());
        statement1.executeUpdate();
      }
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized void createFoodSeller(FoodSellerCreationDTO dto) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("INSERT INTO Account (email, phoneNumber, password, type) VALUES (?,?,?,?);", PreparedStatement.RETURN_GENERATED_KEYS);
      statement.setString(1, dto.getEmail());
      statement.setString(2,dto.getPhoneNumber());
      statement.setString(3, dto.getPassword());
      statement.setString(4, "foodseller");
      statement.executeUpdate();
      ResultSet keys = statement.getGeneratedKeys();
      if (keys.next())
      {
        int id = keys.getInt(1);
        PreparedStatement statement1 = connection.prepareStatement("INSERT INTO FoodSeller(accountId, name, address) VALUES (?,?,?);");
        statement1.setInt(1, id);
        statement1.setString(2, dto.getName());
        statement1.setString(3, dto.getAddress());
        statement1.executeUpdate();
      }
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized void updateName(int accountId, String name)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET name = ? WHERE id = ?");
      statement.setString(1, name);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized void updateAddress(int accountId, String address)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET address = ? WHERE id = ?");
      statement.setString(1, address);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized void updateEmail(int accountId, String email) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET email = ? WHERE id = ?");
      statement.setString(1, email);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized void updatePassword(int accountId, String password)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET password = ? WHERE id = ?");
      statement.setString(1, password);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized void updatePhoneNumber(int accountId, String phoneNumber)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET phonenumber = ? WHERE id = ?");
      statement.setString(1, phoneNumber);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override public synchronized void deleteAccount(int accountId) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("DELETE FROM Account WHERE id = ?");
      statement.setInt(1, accountId);
      statement.executeUpdate();
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public ReadFoodSellerDTO getFoodSellerById(int accountId) throws SQLException {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM Account JOIN FoodSeller ON account.id = foodseller.accountid WHERE account.id = ?");
      statement.setInt(1, accountId);
      ResultSet resultSet = statement.executeQuery();
      if(resultSet.next()){
        String email = resultSet.getString(2);
        String phoneNumber = resultSet.getString(3);
        String name = resultSet.getString(7);
        String address = resultSet.getString(8);

        ReadFoodSellerDTO dto = new ReadFoodSellerDTO(accountId, email, phoneNumber, name, address);
        return dto;
      }
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
    return null;
  }
}
