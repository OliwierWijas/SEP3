package dao;

import java.sql.SQLException;

public interface FoodSellerDAOInterface
{
  void createFoodSeller(String name, String address, String phoneNumber,
      String email, String password)
      throws SQLException;
  void updateName(int accountId, String name) throws SQLException;
  void updateAddress(int accountId, String address) throws SQLException;
  void updateEmail(int accountId, String email) throws SQLException;
  void updatePassword(int accountId, String password) throws SQLException;
  void updatePhoneNumber(int accountId, String phoneNumber) throws SQLException;
  void deleteAccount(int accountId) throws SQLException;
}
