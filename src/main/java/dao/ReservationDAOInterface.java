package dao;

import dto.ReadCustomerReservationDTO;
import dto.ReadFoodSellerReservationDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservationDAOInterface
{
  void createReservation(int customerId, int foodOfferId) throws SQLException;
  void deleteReservation(int reservationNumber) throws SQLException;
  ArrayList<ReadCustomerReservationDTO> readCustomerReservations(int customerId) throws SQLException;
  //ArrayList<ReadCustomerReservationDTO> readCompletedCustomerReservations(int customerId) throws SQLException;
  ArrayList<ReadFoodSellerReservationDTO> readFoodSellerReservations(int foodSellerId) throws SQLException;
  void completeReservation(int reservationNumber) throws SQLException;
  //ArrayList<ReadFoodSellerReservationDTO> readCompletedFoodSellerReservations(int foodSellerId) throws SQLException;
}
