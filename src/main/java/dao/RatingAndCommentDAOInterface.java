package dao;

import dto.CommentBasicDTO;
import dto.RatingBasicDTO;
import dto.ReadCommentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface RatingAndCommentDAOInterface
{
    void createRating(RatingBasicDTO dto) throws SQLException;
    void createComment(CommentBasicDTO dto) throws SQLException;
    void updateRating(RatingBasicDTO dto)throws SQLException;
    void deleteComment(int commentId) throws SQLException;
    ArrayList<ReadCommentDTO> readCommentsByFoodSellerId(int foodSellerId) throws SQLException;
    double readAverageRatingByFoodSellerId(int foodSellerId) throws SQLException;
    int readRating(int customerId, int foodSellerId) throws SQLException;
}
