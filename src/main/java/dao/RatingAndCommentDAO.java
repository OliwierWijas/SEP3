package dao;

import dto.CommentBasicDTO;
import dto.RatingBasicDTO;
import dto.ReadCommentDTO;
import dto.ReadRatingDTO;
import shared.MyDate;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class RatingAndCommentDAO implements RatingAndCommentDAOInterface{

    private static RatingAndCommentDAO instance;

    private RatingAndCommentDAO() throws SQLException
    {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public static synchronized RatingAndCommentDAO getInstance() throws SQLException
    {
        if (instance == null)
            instance = new RatingAndCommentDAO();
        return instance;
    }

    private Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=toofreshtoowastedatabase", "postgres", "sql3486");
    }

    @Override
    public synchronized void createRating(RatingBasicDTO dto) throws SQLException {
        try(Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement("insert into rate(rate, customerid, foodsellerid) values(?, ?, ?)");
            statement.setInt(1, dto.getRate());
            statement.setInt(2, dto.getCustomerId());
            statement.setInt(3, dto.getFoodSellerId());

            statement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public synchronized void createComment(CommentBasicDTO dto) throws SQLException {
        try(Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement("insert into comment(date, text, customerid, foodsellerid) values(?, ?, ?, ?)");
            statement.setDate(1, Date.valueOf(LocalDate.now()));
            statement.setString(2, dto.getComment());
            statement.setInt(3, dto.getCustomerId());
            statement.setInt(4, dto.getFoodSellerId());

            statement.executeUpdate();
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public synchronized void updateRating(RatingBasicDTO dto) throws SQLException {
        try(Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement("update rate set rate = ? where foodsellerid = ? and customerid = ?");
            statement.setInt(1, dto.getRate());
            statement.setInt(2, dto.getFoodSellerId());
            statement.setInt(3, dto.getCustomerId());
            statement.executeUpdate();
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public synchronized void deleteComment(int commentId) throws SQLException {
        try(Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement("delete from comment where id = ?");
            statement.setInt(1, commentId);
            statement.executeUpdate();
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public synchronized ArrayList<ReadCommentDTO> readCommentsByFoodSellerId(int foodSellerId) throws SQLException {
        try(Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement("select * from comment join customer on comment.customerid = customer.accountid where foodsellerid =?");
            statement.setInt(1, foodSellerId);
            ResultSet resultSet = statement.executeQuery();

            ArrayList<ReadCommentDTO> comments = new ArrayList<>();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                int customerId = resultSet.getInt("customerid");
                String customerFirstName = resultSet.getString("firstname");
                String customerLastName = resultSet.getString("lastname");
                Date date = resultSet.getDate("date");
                MyDate myDate = new MyDate(date.getYear()+1900, date.getMonth()+1, date.getDate(), 0,0);
                String content = resultSet.getString("text");

                ReadCommentDTO comment = new ReadCommentDTO(id, customerId, foodSellerId, customerFirstName, customerLastName, myDate, content);
                comments.add(comment);
            }
            return comments;
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public synchronized double readAverageRatingByFoodSellerId(int foodSellerId) throws SQLException {
        try(Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement("select avg(rate) from rate where foodsellerid = ?");
            statement.setInt(1, foodSellerId);
            ResultSet resultSet = statement.executeQuery();
            double rate = 0;
            if(resultSet.next()){
                rate = resultSet.getDouble("avg");
            }
            return rate;
        }
        catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public synchronized int readRating(ReadRatingDTO dto) throws SQLException {
        try(Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement("select rate from rate where customerid = ? and foodsellerid = ?");
            statement.setInt(1, dto.getCustomerId());
            statement.setInt(2, dto.getFoodSellerId());
            ResultSet resultSet = statement.executeQuery();
            int rate = 0;
            if(resultSet.next()){
                rate = resultSet.getInt("rate");
            }
            return rate;
        }
        catch(Exception e){
            throw new RuntimeException(e.getMessage());        }
    }
}
