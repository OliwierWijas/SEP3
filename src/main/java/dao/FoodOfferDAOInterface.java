package dao;

import dto.ReadFoodOffersDTO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FoodOfferDAOInterface
{
  void createFoodOffer(int foodSellerId, String title, String description,
      double price, Date startPickUpTime, Date endPickUpTime) throws SQLException;
  ArrayList<ReadFoodOffersDTO> readAvailableFoodOffers() throws  SQLException;
  ArrayList<ReadFoodOffersDTO> readFoodOffersByFoodSellerId(int foodSellerId) throws SQLException;
  void updateFoodOffer(int foodOfferId, String title, String description,
      double price, Date startPickUpTime, Date endPickUpTime) throws SQLException;
  void deleteFoodOffer(int foodOfferId) throws SQLException;
}
