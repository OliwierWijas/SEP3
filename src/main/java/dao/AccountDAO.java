package dao;

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

  @Override public void createCustomer(String firstName, String lastName,
      String phoneNumber, String email, String password) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("INSERT INTO Account (email, phoneNumber, password) VALUES (?,?,?);", PreparedStatement.RETURN_GENERATED_KEYS);
      statement.setString(1, email);
      statement.setString(2, phoneNumber);
      statement.setString(3, password);
      statement.executeUpdate();
      ResultSet keys = statement.getGeneratedKeys();
      if (keys.next())
      {
        int id = keys.getInt(1);
        PreparedStatement statement1 = connection.prepareStatement("INSERT INTO Customer(accountId, firstName, lastName) VALUES (?,?,?);");
        statement1.setInt(1, id);
        statement1.setString(2, firstName);
        statement1.setString(3, lastName);
        statement1.executeUpdate();
      }
    }
  }

  @Override public void createFoodSeller(String name, String address,
      String phoneNumber, String email, String password) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("INSERT INTO Account (email, phoneNumber, password) VALUES (?,?,?);", PreparedStatement.RETURN_GENERATED_KEYS);
      statement.setString(1, email);
      statement.setString(2, phoneNumber);
      statement.setString(3, password);
      statement.executeUpdate();
      ResultSet keys = statement.getGeneratedKeys();
      if (keys.next())
      {
        int id = keys.getInt(1);
        PreparedStatement statement1 = connection.prepareStatement("INSERT INTO FoodSeller(accountId, name, address) VALUES (?,?,?);");
        statement1.setInt(1, id);
        statement1.setString(2, name);
        statement1.setString(3, address);
        statement1.executeUpdate();
      }
    }
  }

  @Override public void updateName(int accountId, String name)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET name = ? WHERE id = ?");
      statement.setString(1, name);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }
  }

  @Override public void updateAddress(int accountId, String address)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET address = ? WHERE id = ?");
      statement.setString(1, address);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }
  }

  @Override public void updateEmail(int accountId, String email)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET email = ? WHERE id = ?");
      statement.setString(1, email);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }
  }

  @Override public void updatePassword(int accountId, String password)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET password = ? WHERE id = ?");
      statement.setString(1, password);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }
  }

  @Override public void updatePhoneNumber(int accountId, String phoneNumber)
      throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("UPDATE Account SET phonenumber = ? WHERE id = ?");
      statement.setString(1, phoneNumber);
      statement.setInt(2, accountId);
      statement.executeUpdate();
    }
  }

  @Override public void deleteAccount(int accountId) throws SQLException
  {
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("DELETE FROM Account WHERE id = ?");
      statement.setInt(1, accountId);
      statement.executeUpdate();
    }
  }
}
