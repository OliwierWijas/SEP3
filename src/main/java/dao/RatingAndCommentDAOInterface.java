package dao;

import dto.ReadCommentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface RatingAndCommentDAOInterface
{
    void createRating(int foodSellerId, int customerId, int rate) throws SQLException;
    void createComment(int foodSellerId, int customerId, String comment) throws SQLException;
    void updateRating(int foodSellerId, int customerId, int rate)throws SQLException;
    void deleteComment(int commentId) throws SQLException;
    ArrayList<ReadCommentDTO> readCommentsByFoodSellerId(int foodSellerId) throws SQLException;
    double readAverageRatingByFoodSellerId(int foodSellerId) throws SQLException;
    int readRating(int customerId, int foodSellerId) throws SQLException;
}
