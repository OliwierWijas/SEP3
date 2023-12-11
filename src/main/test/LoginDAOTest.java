import dao.LoginDAO;
import dto.UserBasicDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;

public class LoginDAOTest
{
  private LoginDAO dao;

  @BeforeEach void setUp() throws SQLException
  {
    this.dao = LoginDAO.getInstance();
  }

  @Test
  void logging_in_to_customer_account_returns_correct_user_information() throws SQLException
  {
    UserBasicDto user = dao.login("email@via.dk", "Password123");
    assertEquals(10, user.getId());
    assertEquals("email@via.dk", user.getEmail());
    assertEquals("Password123", user.getPassword());
    assertEquals("1234567890", user.getPhoneNumber());
    assertEquals("customer", user.getType());
    assertEquals("firstName", user.getFirstName());
    assertEquals("lastName", user.getLastName());
    assertEquals("", user.getName());
    assertEquals("", user.getAddress());
  }

  @Test
  void logging_in_to_food_seller_account_returns_correct_user_information() throws SQLException
  {
    UserBasicDto user = dao.login("burger.concept@gmail.com", "Password123");
    assertEquals(2, user.getId());
    assertEquals("burger.concept@gmail.com", user.getEmail());
    assertEquals("Password123", user.getPassword());
    assertEquals("0291375829", user.getPhoneNumber());
    assertEquals("foodseller", user.getType());
    assertEquals("", user.getFirstName());
    assertEquals("", user.getLastName());
    assertEquals("Burger Concept", user.getName());
    assertEquals("Main 70, Horsens", user.getAddress());
  }

  @Test
  void logging_in_to_an_non_existing_account_throws_an_exception() throws SQLException
  {
    assertThrows(RuntimeException.class, () -> dao.login("nonexistingemail@via.dk", "Password123"));
  }
}
