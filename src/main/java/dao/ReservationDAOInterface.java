package dao;

import dto.ReadCustomerReservationDTO;
import dto.ReadFoodSellerReservationDTO;
import dto.ReservationCreationDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservationDAOInterface
{
  void createReservation(ReservationCreationDTO dto) throws SQLException;
  void deleteReservation(int reservationNumber) throws SQLException;
  ArrayList<ReadCustomerReservationDTO> readCustomerReservations(int customerId) throws SQLException;
  ArrayList<ReadFoodSellerReservationDTO> readFoodSellerReservations(int foodSellerId) throws SQLException;
  void completeReservation(int reservationNumber) throws SQLException;
}
