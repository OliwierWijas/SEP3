import dao.AccountDAO;
import dao.LoginDAO;
import dto.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountDAOTest
{

  private AccountDAO dao;

  @BeforeEach void setUp() throws SQLException
  {
    this.dao = AccountDAO.getInstance();
  }

  @Test void creating_customer_adds_it_to_the_database() throws SQLException
  {
    FoodSellerCreationDTO dto = new FoodSellerCreationDTO("name", "street", 7, "Horsens",
        "0987654321", "foodseller@via.dk", "Password123");
    dao.createFoodSeller(dto);
    LoginDAO loginDAO = LoginDAO.getInstance();
    UserBasicDto user = loginDAO.login("foodseller@via.dk", "Password123");
    assertEquals("name", user.getName());
    assertEquals("street 7, Horsens", user.getAddress());
    assertEquals("0987654321", user.getPhoneNumber());
    assertEquals("foodseller@via.dk", user.getEmail());
    assertEquals("Password123", user.getPassword());
    assertTrue(user.getId() > 0);
    assertEquals("", user.getFirstName());
    assertEquals("", user.getLastName());
  }

  @Test void creating_food_seller_adds_it_to_the_database() throws SQLException
  {
    CustomerCreationDTO dto = new CustomerCreationDTO("firstName", "lastName",
        "1234567890", "email@via.dk", "Password123");
    dao.createCustomer(dto);
    LoginDAO loginDAO = LoginDAO.getInstance();
    UserBasicDto user = loginDAO.login("email@via.dk", "Password123");
    assertEquals("firstName", user.getFirstName());
    assertEquals("lastName", user.getLastName());
    assertEquals("1234567890", user.getPhoneNumber());
    assertEquals("email@via.dk", user.getEmail());
    assertEquals("Password123", user.getPassword());
    assertTrue(user.getId() > 0);
    assertEquals("", user.getName());
    assertEquals("", user.getAddress());
  }

  @Test void creating_user_with_not_unique_email_throws_an_error()
      throws SQLException
  {
    CustomerCreationDTO dto = new CustomerCreationDTO("firstName", "lastName",
        "12345678901", "email@via.dk", "Password123");
    assertThrows(RuntimeException.class, () -> dao.createCustomer(dto));
  }

  @Test void creating_user_with_not_unique_phonenumber_thrown_an_error()
      throws SQLException
  {
    CustomerCreationDTO dto = new CustomerCreationDTO("firstName", "lastName",
        "1234567890", "email1@via.dk", "Password123");
    assertThrows(RuntimeException.class, () -> dao.createCustomer(dto));
  }

  @Test
  void creating_too_short_password_throws_an_exception() throws SQLException
  {
    CustomerCreationDTO dto = new CustomerCreationDTO("firstName", "lastName",
        "1234567890", "email1@via.dk", "Passw");
    assertThrows(RuntimeException.class, () -> dao.createCustomer(dto));
  }

  @Test
  void creating_too_long_password_throws_an_exception() throws SQLException
  {
    CustomerCreationDTO dto = new CustomerCreationDTO("firstName", "lastName",
        "1234567890", "email1@via.dk", "Password123456789");
    assertThrows(RuntimeException.class, () -> dao.createCustomer(dto));
  }

  @Test
  void updating_name_changes_data_in_the_database() throws SQLException
  {
    FoodSellerUpdateDTO foodSellerUpdateDTO = new FoodSellerUpdateDTO(19, "newname", "", 0, "", "", "", "");
    dao.updateName(foodSellerUpdateDTO);
    LoginDAO loginDAO = LoginDAO.getInstance();
    UserBasicDto user = loginDAO.login("foodseller@via.dk", "Password123");
    assertEquals("newname", user.getName());
  }

  @Test
  void updating_address_changes_data_in_the_database() throws SQLException
  {
    FoodSellerUpdateDTO foodSellerUpdateDTO = new FoodSellerUpdateDTO(19, "", "newstreet", 10, "Copenhagen", "", "", "");
    dao.updateAddress(foodSellerUpdateDTO);
    LoginDAO loginDAO = LoginDAO.getInstance();
    UserBasicDto user = loginDAO.login("foodseller@via.dk", "Password123");
    assertEquals("newstreet 10, Copenhagen", user.getAddress());
  }

  @Test
  void updating_email_changes_data_in_the_database() throws SQLException
  {
    dao.updateEmail(19, "newFoodSeller@via.dk");
    LoginDAO loginDAO = LoginDAO.getInstance();
    UserBasicDto user = loginDAO.login("newFoodSeller@via.dk", "Password123");
    assertEquals("newFoodSeller@via.dk", user.getEmail());
  }

  @Test
  void updating_phone_number_changes_data_in_the_database() throws SQLException
  {
    dao.updatePhoneNumber(19, "566789432");
    LoginDAO loginDAO = LoginDAO.getInstance();
    UserBasicDto user = loginDAO.login("newFoodSeller@via.dk", "Password123");
    assertEquals("566789432", user.getPhoneNumber());
  }

  @Test
  void updating_password_changes_data_in_the_database() throws SQLException
  {
    dao.updatePassword(19, "newPassword123");
    LoginDAO loginDAO = LoginDAO.getInstance();
    UserBasicDto user = loginDAO.login("newFoodSeller@via.dk", "newPassword123");
    assertEquals("newPassword123", user.getPassword());
  }

  @Test
  void getting_food_seller_by_id_returns_correct_data() throws SQLException
  {
    ReadFoodSellerDTO dto = dao.getFoodSellerById(19);
    assertEquals(19, dto.getAccountId());
    assertEquals("newFoodSeller@via.dk", dto.getEmail());
    assertEquals("566789432", dto.getPhoneNumber());
    assertEquals("newname", dto.getName());
    assertEquals("newstreet 10, Copenhagen", dto.getAddress());
  }

  @Test
  void getting_all_food_sellers_returns_correct_data() throws SQLException
  {
    ArrayList<ReadFoodSellerDTO> dtos = dao.getAllFoodSellers();
    ReadFoodSellerDTO dto1 = new ReadFoodSellerDTO(2, "burger.concept@gmail.com", "0291375829", "Burger Concept", "Main 70, Horsens");
    ReadFoodSellerDTO dto2 = new ReadFoodSellerDTO(19, "newFoodSeller@via.dk", "566789432", "newname", "newstreet 10, Copenhagen");
    assertTrue(dtos.contains(dto1));
    assertTrue(dtos.contains(dto2));
  }

  @Test
  void deleting_account_of_food_seller_with_ongoing_reservations_throws_an_exception() throws SQLException
  {
    assertThrows(RuntimeException.class, () -> dao.deleteAccount(2));
  }

  @Test
  void deleting_account_removes_it_from_the_database() throws SQLException
  {
    dao.deleteAccount(19);
    ArrayList<ReadFoodSellerDTO> dtos = dao.getAllFoodSellers();
    ReadFoodSellerDTO dto = new ReadFoodSellerDTO(19, "newFoodSeller@via.dk", "566789432", "newname", "newstreet 10, Copenhagen");
    assertFalse(dtos.contains(dto));
  }
}