package dao;

import dto.UserBasicDto;

import java.sql.*;

public class LoginDAO implements LoginDAOInterface
{
  private static LoginDAO instance;

  private LoginDAO() throws SQLException
  {
    DriverManager.registerDriver(new org.postgresql.Driver());
  }

  public static synchronized LoginDAO getInstance() throws SQLException
  {
    if (instance == null)
      instance = new LoginDAO();
    return instance;
  }

  private Connection getConnection() throws SQLException
  {
    return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=toofreshtoowastedatabase", "postgres", "xf31bhl9");
  }

  @Override public synchronized UserBasicDto login(String email, String password)
      throws SQLException
  {
    UserBasicDto dto = null;
    try (Connection connection = getConnection())
    {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM Account WHERE email = ? and password = ?;");
      statement.setString(1,email);
      statement.setString(2,password);
      ResultSet keys = statement.executeQuery();
      if (keys.next())
      {
        int id = keys.getInt("id");
        String type = keys.getString("type");
        String phoneNumber = keys.getString("phonenumber");
        if(type.equals("customer"))
        {
          PreparedStatement statement1 = connection.prepareStatement("SELECT * FROM Customer WHERE accountid = ?;");
          statement1.setInt(1, id);
          ResultSet set = statement1.executeQuery();
          if(set.next())
          {
            String firstName = set.getString(2);
            String lastName = set.getString(3);
            dto = new UserBasicDto(id, email, password, phoneNumber, type, firstName, lastName,"", "");
          }
        }
        else
        {
          PreparedStatement statement1 = connection.prepareStatement("SELECT * FROM FoodSeller WHERE accountid = ?;");
          statement1.setInt(1, id);
          ResultSet set1 = statement1.executeQuery();
          if(set1.next())
          {
            String name = set1.getString(2);
            String street = set1.getString(3);
            int number = set1.getInt(4);
            String city = set1.getString(5);
            String address = street + " " + number + ", " + city;
            dto = new UserBasicDto(id, email, password, phoneNumber, type, "", "",name, address);
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
    if (dto == null)
      throw new RuntimeException("Account with the given information does not exist.");
    return dto;
  }
}
