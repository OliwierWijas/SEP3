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
    private String photo;

    public ReadCustomerReservationDTO(int id, String title, String description, double price, MyDate startPickUpTime, MyDate endPickUpTime, int reservationNumber, ReadFoodSellerDTO foodSeller, boolean isCompleted, String photo) {
        this.foodOfferId = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.startPickUpTime = startPickUpTime;
        this.endPickUpTime = endPickUpTime;
        this.reservationNumber = reservationNumber;
        this.foodSeller = foodSeller;
        this.isCompleted = isCompleted;
        this.photo = photo;
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

    public String getPhoto()
    {
        return photo;
    }

    @Override public String toString()
    {
        return "ReadCustomerReservationDTO{" + "foodOfferId=" + foodOfferId
            + ", title='" + title + '\'' + ", description='" + description
            + '\'' + ", price=" + price + ", startPickUpTime=" + startPickUpTime
            + ", endPickUpTime=" + endPickUpTime + ", reservationNumber="
            + reservationNumber + ", foodSeller=" + foodSeller
            + ", isCompleted=" + isCompleted + '}';
    }

    @Override public boolean equals(Object obj)
    {
        if (obj == null || obj.getClass() != getClass())
            return false;

        ReadCustomerReservationDTO other = (ReadCustomerReservationDTO) obj;
        return this.foodOfferId == other.foodOfferId && this.title.equals(other.title) && this.description.equals(other.description) && this.price == other.price && this.startPickUpTime.equals(other.startPickUpTime) && this.endPickUpTime.equals(other.endPickUpTime) && this.reservationNumber == other.reservationNumber && this.foodSeller.equals(other.foodSeller) && this.isCompleted == other.isCompleted;
    }
}
