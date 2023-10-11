package dto;

import java.util.Date;

public class ReadCustomerReservationDTO {
    private int foodOfferId;
    private String title;
    private String description;
    private double price;
    private Date startPickUpTime;
    private Date endPickUpTime;
    private int reservationNumber;
    private int foodSellerId;
    private String foodSellerName;
    private String address;

    public ReadCustomerReservationDTO(int id, String title, String description, double price, Date startPickUpTime, Date endPickUpTime, int reservationNumber, int foodSellerId, String foodSellerName, String address) {
        this.foodOfferId = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.startPickUpTime = startPickUpTime;
        this.endPickUpTime = endPickUpTime;
        this.reservationNumber = reservationNumber;
        this.foodSellerId = foodSellerId;
        this.foodSellerName = foodSellerName;
        this.address = address;
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

    public Date getStartPickUpTime() {
        return startPickUpTime;
    }

    public Date getEndPickUpTime() {
        return endPickUpTime;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public int getFoodSellerId() {
        return foodSellerId;
    }

    public String getFoodSellerName() {
        return foodSellerName;
    }

    public String getAddress() {
        return address;
    }
}
