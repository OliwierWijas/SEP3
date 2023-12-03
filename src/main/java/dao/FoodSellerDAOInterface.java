package dao;

import dto.FoodSellerCreationDTO;
import dto.FoodSellerUpdateDTO;
import dto.ReadFoodSellerDTO;
import dto.ReadRatingDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface FoodSellerDAOInterface
{
  void createFoodSeller(FoodSellerCreationDTO dto) throws SQLException;
  void updateName(FoodSellerUpdateDTO dto) throws SQLException;
  void updateAddress(FoodSellerUpdateDTO dto) throws SQLException;
  void updateEmail(int accountId, String email) throws SQLException;
  void updatePassword(int accountId, String password) throws SQLException;
  void updatePhoneNumber(int accountId, String phoneNumber) throws SQLException;
  void deleteAccount(int accountId) throws SQLException;
  ReadFoodSellerDTO getFoodSellerById(int accountId) throws SQLException;
  ArrayList<ReadFoodSellerDTO> getAllFoodSellers() throws SQLException;
}
