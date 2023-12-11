import dao.FoodOfferDAO;
import dto.FoodOfferCreationDTO;
import dto.FoodOfferUpdateDTO;
import dto.ReadFoodOffersDTO;
import dto.ReadFoodSellerDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.MyDate;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class FoodOfferDAOTest
{
  private FoodOfferDAO dao;

  @BeforeEach
  void setUp() throws SQLException
  {
    dao = FoodOfferDAO.getInstance();
  }

  @Test
  void creating_food_offer_adds_it_to_the_database() throws SQLException
  {
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    FoodOfferCreationDTO dto = new FoodOfferCreationDTO(2, "title", "description", 100, start, end);
    dao.createFoodOffer(dto);
    ReadFoodOffersDTO foodOffer = dao.readFoodOfferById(8);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "burger.concept@gmail.com", "0291375829", "Burger Concept", "Main 70, Horsens");
    assertEquals(8, foodOffer.getId());
    assertEquals("title", foodOffer.getTitle());
    assertEquals("description", foodOffer.getDescription());
    assertEquals(100, foodOffer.getPrice());
    assertEquals(foodSeller.getAccountId(), foodOffer.getFoodSeller().getAccountId());
    assertEquals(foodSeller.getName(), foodOffer.getFoodSeller().getName());
    assertEquals(foodSeller.getAddress(), foodOffer.getFoodSeller().getAddress());
    assertEquals(start, foodOffer.getStartPickUpTime());
    assertEquals(end, foodOffer.getEndPickUpTime());
    assertFalse(foodOffer.isReserved());
    assertFalse(foodOffer.isCompleted());
  }

  @Test
  void creating_food_offer_with_the_start_date_after_the_end_date_throws_an_exception() throws SQLException
  {
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    FoodOfferCreationDTO dto = new FoodOfferCreationDTO(2, "title", "description", 100, end, start);
    assertThrows(RuntimeException.class, () ->  dao.createFoodOffer(dto));
  }

  @Test
  void creating_food_offer_with_the_start_date_equal_the_end_date_throws_an_exception() throws SQLException
  {
    MyDate date = new MyDate(2023, 12, 11, 10, 00);
    FoodOfferCreationDTO dto = new FoodOfferCreationDTO(2, "title", "description", 100, date, date);
    assertThrows(RuntimeException.class, () ->  dao.createFoodOffer(dto));
  }

  @Test
  void getting_available_food_offers_returns_correct_data() throws SQLException
  {
    ArrayList<ReadFoodOffersDTO> dtos = dao.readAvailableFoodOffers();
    for (int i = 0; i < dtos.size(); i++)
    {
      assertFalse(dtos.get(i).isReserved());
      assertFalse(dtos.get(i).isCompleted());
    }
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "Burger Concept", "Main 70, Horsens");
    ReadFoodOffersDTO dto = new ReadFoodOffersDTO(8, foodSeller, "title", "description", 100, start, end, false, false);
    assertTrue(dtos.contains(dto));
  }

  @Test
  void getting_food_offers_by_food_seller_id_returns_only_his_food_offers() throws SQLException
  {
    ArrayList<ReadFoodOffersDTO> dtos = dao.readFoodOffersByFoodSellerId(2);
    for (int i = 0; i < dtos.size(); i++)
    {
      assertEquals(2, dtos.get(i).getFoodSeller().getAccountId());
    }
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "", "");
    ReadFoodOffersDTO dto = new ReadFoodOffersDTO(8, foodSeller, "title", "description", 100, start, end, false, false);
    assertTrue(dtos.contains(dto));
  }

  @Test
  void updating_food_offer_changes_data_in_the_database() throws SQLException
  {
    MyDate start = new MyDate(2023, 12, 12, 11, 20);
    MyDate end = new MyDate(2023, 12, 13, 14, 00);
    FoodOfferUpdateDTO dto = new FoodOfferUpdateDTO(8, "newtitle", "newdescription", 120, start, end);
    dao.updateFoodOffer(dto);
    ReadFoodOffersDTO foodOffer = dao.readFoodOfferById(8);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "burger.concept@gmail.com", "0291375829", "Burger Concept", "Main 70, Horsens");
    assertEquals(8, foodOffer.getId());
    assertEquals("newtitle", foodOffer.getTitle());
    assertEquals("newdescription", foodOffer.getDescription());
    assertEquals(120, foodOffer.getPrice());
    assertEquals(foodSeller.getAccountId(), foodOffer.getFoodSeller().getAccountId());
    assertEquals(foodSeller.getName(), foodOffer.getFoodSeller().getName());
    assertEquals(foodSeller.getAddress(), foodOffer.getFoodSeller().getAddress());
    assertEquals(start, foodOffer.getStartPickUpTime());
    assertEquals(end, foodOffer.getEndPickUpTime());
    assertFalse(foodOffer.isReserved());
    assertFalse(foodOffer.isCompleted());
  }


  @Test
  void getting_food_offer_by_id_returns_correct_data() throws SQLException
  {
    MyDate start = new MyDate(2023, 12, 11, 10, 00);
    MyDate end = new MyDate(2023, 12, 12, 10, 00);
    ReadFoodOffersDTO foodOffer = dao.readFoodOfferById(11);
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "burger.concept@gmail.com", "0291375829", "Burger Concept", "Main 70, Horsens");
    assertEquals(11, foodOffer.getId());
    assertEquals("title", foodOffer.getTitle());
    assertEquals("description", foodOffer.getDescription());
    assertEquals(100, foodOffer.getPrice());
    assertEquals(foodSeller.getAccountId(), foodOffer.getFoodSeller().getAccountId());
    assertEquals(foodSeller.getName(), foodOffer.getFoodSeller().getName());
    assertEquals(foodSeller.getAddress(), foodOffer.getFoodSeller().getAddress());
    assertEquals(start, foodOffer.getStartPickUpTime());
    assertEquals(end, foodOffer.getEndPickUpTime());
    assertFalse(foodOffer.isReserved());
    assertFalse(foodOffer.isCompleted());
  }

  @Test
  void getting_food_offer_by_id_returns_null_if_it_does_not_exist() throws SQLException
  {
    ReadFoodOffersDTO foodOffer = dao.readFoodOfferById(12);
    assertNull(foodOffer);
  }

  @Test
  void deleting_food_offer_removes_data_from_the_database() throws SQLException
  {
    dao.deleteFoodOffer(8);
    ReadFoodOffersDTO foodOffer = dao.readFoodOfferById(8);
    assertNull(foodOffer);
  }
}
