package dao;

import dto.FoodOfferBasicDTO;
import dto.ReadFoodOffersDTO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FoodOfferDAOInterface
{
  void createFoodOffer(FoodOfferBasicDTO dto) throws SQLException;
  ArrayList<ReadFoodOffersDTO> readAvailableFoodOffers() throws  SQLException;
  ArrayList<ReadFoodOffersDTO> readFoodOffersByFoodSellerId(int foodSellerId) throws SQLException;
  void updateFoodOffer(FoodOfferBasicDTO dto) throws SQLException;
  void deleteFoodOffer(int foodOfferId) throws SQLException;
}
