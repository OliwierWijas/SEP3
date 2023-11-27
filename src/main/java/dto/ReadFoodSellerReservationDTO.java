package dto;

import shared.MyDate;

import java.util.Date;

public class ReadFoodSellerReservationDTO {

    private int foodOfferId;
    private String title;
    private String description;
    private double price;
    private MyDate startPickUpTime;
    private MyDate endPickUpTime;
    private int reservationNumber;
    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private boolean isCompleted;

    public ReadFoodSellerReservationDTO(int id, String title, String description, double price, MyDate startPickUpTime, MyDate endPickUpTime, int reservationNumber, int customerId, String customerFirstName, String customerLastName, boolean isCompleted) {
        this.foodOfferId = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.startPickUpTime = startPickUpTime;
        this.endPickUpTime = endPickUpTime;
        this.reservationNumber = reservationNumber;
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
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

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

}
