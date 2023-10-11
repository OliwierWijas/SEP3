package dto;

import java.util.Date;

public class ReadFoodOffersDTO
{
    private final int id;
    private final int foodSellerId;
    private final String title;
    private final String description;
    private final double price;
    private final Date startPickUpTime;
    private final Date endPickUpTime;
    private String foodSellerName;
    private String foodSellerAddress;
    private final boolean isReserved;
    private final boolean isCompleted;

    public ReadFoodOffersDTO(int id, int foodSellerId, String title, String description, double price, Date startPickUpTime, Date endPickUpTime, boolean isReserved, boolean isCompleted) {
        this.id = id;
        this.foodSellerId = foodSellerId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.startPickUpTime = startPickUpTime;
        this.endPickUpTime = endPickUpTime;
        this.isReserved = isReserved;
        this.isCompleted = isCompleted;
    }

    public void setFoodSellerName(String foodSellerName) {
        this.foodSellerName = foodSellerName;
    }

    public void setFoodSellerAddress(String foodSellerAddress) {
        this.foodSellerAddress = foodSellerAddress;
    }
}
