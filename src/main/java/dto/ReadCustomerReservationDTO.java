package dto;

import shared.MyDate;

import java.util.Date;

public class ReadCustomerReservationDTO {
    private int foodOfferId;
    private String title;
    private String description;
    private double price;
    private MyDate startPickUpTime;
    private MyDate endPickUpTime;
    private int reservationNumber;
    private ReadFoodSellerDTO foodSeller;
    private boolean isCompleted;

    public ReadCustomerReservationDTO(int id, String title, String description, double price, MyDate startPickUpTime, MyDate endPickUpTime, int reservationNumber, ReadFoodSellerDTO foodSeller, boolean isCompleted) {
        this.foodOfferId = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.startPickUpTime = startPickUpTime;
        this.endPickUpTime = endPickUpTime;
        this.reservationNumber = reservationNumber;
        this.foodSeller = foodSeller;
        this.isCompleted = isCompleted;
    }

    public boolean isCompleted()
    {
        return isCompleted;
    }

    public int getFoodOfferId() {
        return foodOfferId;
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

    public MyDate getStartPickUpTime() {
        return startPickUpTime;
    }

    public MyDate getEndPickUpTime() {
        return endPickUpTime;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public ReadFoodSellerDTO getFoodSeller() {return foodSeller;}
}
