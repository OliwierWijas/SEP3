package dto;

import shared.MyDate;

public class ReadFoodOffersDTO
{
    private final int id;
    private final int foodSellerId;
    private final String title;
    private final String description;
    private final double price;
    private final MyDate startPickUpTime;
    private final MyDate endPickUpTime;
    private String foodSellerName;
    private String foodSellerAddress;
    private final boolean isReserved;
    private final boolean isCompleted;

    public ReadFoodOffersDTO(int id, int foodSellerId, String title, String description, double price, MyDate startPickUpTime, MyDate endPickUpTime, boolean isReserved, boolean isCompleted) {
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

    public int getId() {
        return id;
    }

    public int getFoodSellerId() {
        return foodSellerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getFoodSellerName() {
        return foodSellerName;
    }

    public String getFoodSellerAddress() {
        return foodSellerAddress;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setFoodSellerName(String foodSellerName) {
        this.foodSellerName = foodSellerName;
    }

    public void setFoodSellerAddress(String foodSellerAddress) {
        this.foodSellerAddress = foodSellerAddress;
    }

    public MyDate getStartPickUpTime() {
        return startPickUpTime;
    }

    public MyDate getEndPickUpTime() {
        return endPickUpTime;
    }

    @Override
    public String toString() {
        return "ReadFoodOffersDTO{" +
                "id=" + id +
                ", foodSellerId=" + foodSellerId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", startPickUpTime=" + startPickUpTime +
                ", endPickUpTime=" + endPickUpTime +
                ", foodSellerName='" + foodSellerName + '\'' +
                ", foodSellerAddress='" + foodSellerAddress + '\'' +
                ", isReserved=" + isReserved +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
