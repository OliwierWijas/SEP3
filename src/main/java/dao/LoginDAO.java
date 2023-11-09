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

  @Override public UserBasicDto login(String email, String password)
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
          PreparedStatement statement1 = connection.prepareStatement("SELECT * FROM Customer WHERE id = ?;");
          statement1.setInt(1, id);
          ResultSet set = statement.executeQuery();
          if(set.next())
          {
            String firstName = set.getString("firstname");
            String lastName = set.getString("lastname");
            dto = new UserBasicDto(email, password, phoneNumber, firstName, lastName,null, null);
          }
        }
        else
        {
          PreparedStatement statement1 = connection.prepareStatement("SELECT * FROM FoodSeller WHERE id = ?;");
          statement1.setInt(1, id);
          ResultSet set = statement.executeQuery();
          if(set.next())
          {
            String name = set.getString("name");
            String address = set.getString("address");
            dto = new UserBasicDto(email, password, phoneNumber, null, null,name, address);
          }
        }
      }
      return dto;
    }
  }

}
