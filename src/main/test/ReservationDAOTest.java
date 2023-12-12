import dao.FoodOfferDAO;
import dao.ReservationDAO;
import dto.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.MyDate;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationDAOTest
{
  private ReservationDAO dao;

  @BeforeEach
  void setUp() throws SQLException
  {
    this.dao = ReservationDAO.getInstance();
  }

  @Test
  void reserving_food_offer_changes_its_status_in_the_database() throws SQLException
  {
    ReservationCreationDTO dto = new ReservationCreationDTO(10, 11);
    dao.createReservation(dto);
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "Burger Concept", "Main 70, Horsens");
    ReadCustomerReservationDTO reservation = new ReadCustomerReservationDTO(11, "title", "description", 100, start, end, 12, foodSeller , false);
    ArrayList<ReadCustomerReservationDTO> dtos = dao.readCustomerReservations(10);
    assertTrue(dtos.contains(reservation));
    FoodOfferDAO foodOfferDAO = FoodOfferDAO.getInstance();
    ReadFoodOffersDTO foodOffer = foodOfferDAO.readFoodOfferById(11);
    assertTrue(foodOffer.isReserved());
    assertFalse(foodOffer.isCompleted());
  }

  @Test
  void reserving_already_reserved_food_offer_throws_an_exception() throws SQLException
  {
    ReservationCreationDTO dto = new ReservationCreationDTO(10, 11);
    assertThrows(RuntimeException.class, () -> dao.createReservation(dto));
  }

  @Test
  void cancelling_reservation_changes_its_status_in_the_database() throws SQLException
  {
    dao.deleteReservation(9);
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "Burger Concept", "Main 70, Horsens");
    ReadCustomerReservationDTO reservation = new ReadCustomerReservationDTO(11, "title", "description", 100, start, end, 9, foodSeller , false);
    ArrayList<ReadCustomerReservationDTO> dtos = dao.readCustomerReservations(10);
    assertFalse(dtos.contains(reservation));
    FoodOfferDAO foodOfferDAO = FoodOfferDAO.getInstance();
    ReadFoodOffersDTO foodOffer = foodOfferDAO.readFoodOfferById(11);
    assertFalse(foodOffer.isReserved());
    assertFalse(foodOffer.isCompleted());
  }

  @Test
  void completing_reservation_changes_its_status_in_the_database() throws SQLException
  {
    dao.completeReservation(12);
    ArrayList<ReadCustomerReservationDTO> dtos = dao.readCustomerReservations(10);
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "Burger Concept", "Main 70, Horsens");
    ReadCustomerReservationDTO reservation = new ReadCustomerReservationDTO(11, "title", "description", 100, start, end, 12, foodSeller , true);
    assertTrue(dtos.contains(reservation));
    FoodOfferDAO foodOfferDAO = FoodOfferDAO.getInstance();
    ReadFoodOffersDTO foodOffer = foodOfferDAO.readFoodOfferById(11);
    assertTrue(foodOffer.isReserved());
    assertTrue(foodOffer.isCompleted());
  }

  @Test
  void reading_food_seller_reservations_returns_correct_reservations() throws SQLException
  {
    ArrayList<ReadFoodSellerReservationDTO> dtos = dao.readFoodSellerReservations(2);
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    ReadCustomerDTO customer = new ReadCustomerDTO(10, "", "", "firstName", "lastName");
    ReadFoodSellerReservationDTO reservation = new ReadFoodSellerReservationDTO(11, "title", "description", 100, start, end, 12, customer , true);
    assertTrue(dtos.contains(reservation));
  }

  @Test
  void reading_customer_reservations_returns_correct_reservations() throws SQLException
  {
    ArrayList<ReadCustomerReservationDTO> dtos = dao.readCustomerReservations(10);
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "Burger Concept", "Main 70, Horsens");
    ReadCustomerReservationDTO reservation = new ReadCustomerReservationDTO(11, "title", "description", 100, start, end, 12, foodSeller , true);
    assertTrue(dtos.contains(reservation));
  }
}