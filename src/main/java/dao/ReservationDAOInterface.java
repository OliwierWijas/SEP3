package dao;

import dto.ReadCustomerReservationDTO;
import dto.ReadFoodSellerReservationDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservationDAOInterface
{
  void createReservation(int customerId, int foodOfferId) throws SQLException;
  void deleteReservation(int foodOfferId) throws SQLException;
  ArrayList<ReadCustomerReservationDTO> readCustomerReservations(int customerId) throws SQLException;
  ArrayList<ReadCustomerReservationDTO> readCompletedCustomerReservations(int customerId) throws SQLException;
  ArrayList<ReadFoodSellerReservationDTO> readFoodSellerReservations(int foodSellerId) throws SQLException;
  ArrayList<ReadFoodSellerReservationDTO> readCompletedFoodSellerReservations(int foodSellerId) throws SQLException;
}
