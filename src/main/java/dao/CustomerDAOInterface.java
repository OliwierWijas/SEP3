package dao;

import java.sql.SQLException;

public interface CustomerDAOInterface
{
  void createCustomer(String firstName, String lastName, String phoneNumber,
      String email, String password)
      throws SQLException;
  void updateEmail(int accountId, String email) throws SQLException;
  void updatePassword(int accountId, String password) throws SQLException;
  void updatePhoneNumber(int accountId, String phoneNumber) throws SQLException;
  void deleteAccount(int accountId) throws SQLException;
}
