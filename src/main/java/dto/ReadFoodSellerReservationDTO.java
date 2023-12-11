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
    private ReadCustomerDTO customer;
    private boolean isCompleted;

    public ReadFoodSellerReservationDTO(int id, String title, String description, double price, MyDate startPickUpTime, MyDate endPickUpTime, int reservationNumber, ReadCustomerDTO customer, boolean isCompleted) {
        this.foodOfferId = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.startPickUpTime = startPickUpTime;
        this.endPickUpTime = endPickUpTime;
        this.reservationNumber = reservationNumber;
        this.customer = customer;
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

    public ReadCustomerDTO getCustomer() {return customer;}

    @Override public boolean equals(Object obj)
    {
        if (obj == null || obj.getClass() != getClass())
            return false;

        ReadFoodSellerReservationDTO other =(ReadFoodSellerReservationDTO) obj;
        return this.foodOfferId == other.foodOfferId && this.title.equals(other.title) && this.description.equals(other.description) && this.price == other.price && this.startPickUpTime.equals(other.startPickUpTime) && this.endPickUpTime.equals(other.endPickUpTime) && this.reservationNumber == other.reservationNumber && this.customer.equals(other.customer) && this.isCompleted == other.isCompleted;
    }
}
