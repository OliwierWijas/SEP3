package dto;

import shared.MyDate;

public class ReadFoodOffersDTO
{
    private final int id;
    private final ReadFoodSellerDTO foodSeller;
    private final String title;
    private final String description;
    private final double price;
    private final MyDate startPickUpTime;
    private final MyDate endPickUpTime;
    private final boolean isReserved;
    private final boolean isCompleted;

    public ReadFoodOffersDTO(int id, ReadFoodSellerDTO foodSeller, String title, String description, double price, MyDate startPickUpTime, MyDate endPickUpTime, boolean isReserved, boolean isCompleted) {
        this.id = id;
        this.foodSeller = foodSeller;
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

    public ReadFoodSellerDTO getFoodSeller() {
        return foodSeller;
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

    public boolean isReserved() {
        return isReserved;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public MyDate getStartPickUpTime() {
        return startPickUpTime;
    }

    public MyDate getEndPickUpTime() {
        return endPickUpTime;
    }

    @Override public String toString()
    {
        return "ReadFoodOffersDTO{" + "id=" + id + ", foodSeller=" + foodSeller
            + ", title='" + title + '\'' + ", description='" + description
            + '\'' + ", price=" + price + ", startPickUpTime=" + startPickUpTime
            + ", endPickUpTime=" + endPickUpTime + ", isReserved=" + isReserved
            + ", isCompleted=" + isCompleted + '}';
    }

    @Override public boolean equals(Object obj)
    {
        if (obj == null || obj.getClass() != getClass())
            return false;

        ReadFoodOffersDTO other = (ReadFoodOffersDTO) obj;

        return this.id == other.id && this.foodSeller.equals(other.foodSeller) && this.title.equals(other.title) && this.description.equals(other.description) && this.price == other.price && this.startPickUpTime.equals(other.startPickUpTime) && this.endPickUpTime.equals(other.endPickUpTime) && this.isReserved == other.isReserved && this.isCompleted == other.isCompleted;
    }
}
