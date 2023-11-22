package dao;

import dto.FoodSellerCreationDTO;

import java.sql.SQLException;

public interface FoodSellerDAOInterface
{
  void createFoodSeller(FoodSellerCreationDTO dto) throws SQLException;
  void updateName(int accountId, String name) throws SQLException;
  void updateAddress(int accountId, String address) throws SQLException;
  void updateEmail(int accountId, String email) throws SQLException;
  void updatePassword(int accountId, String password) throws SQLException;
  void updatePhoneNumber(int accountId, String phoneNumber) throws SQLException;
  void deleteAccount(int accountId) throws SQLException;
}
