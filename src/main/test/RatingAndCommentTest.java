import dao.RatingAndCommentDAO;
import dto.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.MyDate;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class RatingAndCommentTest
{
  private RatingAndCommentDAO dao;

  @BeforeEach
  void setUp() throws SQLException
  {
    this.dao = RatingAndCommentDAO.getInstance();
  }

  @Test
  void creating_rating_adds_changed_to_the_database() throws SQLException
  {
    RatingBasicDTO dto = new RatingBasicDTO(2, 10, 3);
    dao.createRating(dto);
    ReadRatingDTO readRatingDTO = new ReadRatingDTO(10, 2);
    int rating = dao.readRating(readRatingDTO);
    assertEquals(3, rating);
  }

  @Test
  void creating_comment_adds_changes_to_the_database() throws SQLException
  {
    CommentBasicDTO dto = new CommentBasicDTO(2, 10, "comment");
    dao.createComment(dto);
    MyDate date = new MyDate(2023, 12, 11, 0, 0);
    ReadCustomerDTO customer = new ReadCustomerDTO(10, "", "", "firstName", "lastName");
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "", "");
    ReadCommentDTO commentDTO = new ReadCommentDTO(8, customer, foodSeller, date, "comment");
    ArrayList<ReadCommentDTO> dtos = dao.readCommentsByFoodSellerId(2);
    assertTrue(dtos.contains(commentDTO));
  }

  @Test
  void updating_rating_changes_it_in_the_database() throws SQLException
  {
    RatingBasicDTO dto = new RatingBasicDTO(2, 10, 4);
    dao.updateRating(dto);
    ReadRatingDTO readRatingDTO = new ReadRatingDTO(10, 2);
    int rating = dao.readRating(readRatingDTO);
    assertEquals(4, rating);
  }

  @Test
  void deleting_comment_removes_it_from_the_database() throws SQLException
  {
    dao.deleteComment(7);
    MyDate date = new MyDate(2023, 12, 11, 0, 0);
    ReadCustomerDTO customer = new ReadCustomerDTO(10, "", "", "firstName", "lastName");
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "", "");
    ReadCommentDTO commentDTO = new ReadCommentDTO(7, customer, foodSeller, date, "comment");
    ArrayList<ReadCommentDTO> dtos = dao.readCommentsByFoodSellerId(2);
    assertFalse(dtos.contains(commentDTO));
  }

  @Test
  void reading_comments_by_food_seller_id_returns_correct_comments() throws SQLException
  {
    MyDate date = new MyDate(2023, 12, 11, 0, 0);
    ReadCustomerDTO customer = new ReadCustomerDTO(10, "", "", "firstName", "lastName");
    ReadFoodSellerDTO foodSeller = new ReadFoodSellerDTO(2, "", "", "", "");
    ReadCommentDTO commentDTO = new ReadCommentDTO(8, customer, foodSeller, date, "comment");
    ArrayList<ReadCommentDTO> dtos = dao.readCommentsByFoodSellerId(2);
    for (int i = 0; i < dtos.size(); i++)
    {
      assertEquals(2, dtos.get(i).getFoodSeller().getAccountId());
    }
    assertTrue(dtos.contains(commentDTO));
  }

  @Test
  void reading_average_rating_by_food_seller_id_returns_correct_rating() throws SQLException
  {
    double rating = dao.readAverageRatingByFoodSellerId(2);
    assertEquals(rating, 3);
  }

  @Test
  void reading_rating_of_a_specific_food_seller_made_by_customer_returns_correct_rating() throws SQLException
  {
    ReadRatingDTO readRatingDTO = new ReadRatingDTO(10, 2);
    int rating = dao.readRating(readRatingDTO);
    assertEquals(4, rating);
  }
}
