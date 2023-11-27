import dao.FoodOfferDAO;
import dao.FoodOfferDAOInterface;
import dto.ReadFoodOffersDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws SQLException {

        FoodOfferDAOInterface dao = FoodOfferDAO.getInstance();
        ArrayList<ReadFoodOffersDTO> list = dao.readAvailableFoodOffers();
        for (int i =0; i < list.size(); i++){
            System.out.println(list.get(i).getStartPickUpTime().toString() +"  ," + list.get(i).getEndPickUpTime().toString());
        }

    }

}
