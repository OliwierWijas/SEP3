package dao;

import dto.CustomerCreationDTO;

import java.sql.SQLException;

public interface CustomerDAOInterface
{
  void createCustomer(CustomerCreationDTO dto) throws SQLException;
  void updateEmail(int accountId, String email) throws SQLException;
  void updatePassword(int accountId, String password) throws SQLException;
  void updatePhoneNumber(int accountId, String phoneNumber) throws SQLException;
  void deleteAccount(int accountId) throws SQLException;
}
