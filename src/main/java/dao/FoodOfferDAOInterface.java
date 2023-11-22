package dao;

import dto.FoodOfferCreationDTO;
import dto.FoodOfferUpdateDTO;
import dto.ReadFoodOffersDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface FoodOfferDAOInterface
{
  void createFoodOffer(FoodOfferCreationDTO dto) throws SQLException;
  ArrayList<ReadFoodOffersDTO> readAvailableFoodOffers() throws  SQLException;
  ArrayList<ReadFoodOffersDTO> readFoodOffersByFoodSellerId(int foodSellerId) throws SQLException;
  void updateFoodOffer(FoodOfferUpdateDTO dto) throws SQLException;
  void deleteFoodOffer(int foodOfferId) throws SQLException;
}
