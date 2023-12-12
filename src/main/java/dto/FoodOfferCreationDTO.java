package dto;

import shared.MyDate;

public class FoodOfferCreationDTO
{
  private int foodSellerId;
  private String title;
  private String description;
  private double price;
  private MyDate startPickUpTime;
  private MyDate endPickUpTime;
  private String photo;

  public FoodOfferCreationDTO(int foodSellerId, String title, String description,
      double price, MyDate startPickUpTime, MyDate endPickUpTime, String photo)
  {
    this.foodSellerId = foodSellerId;
    this.title = title;
    this.description = description;
    this.price = price;
    this.startPickUpTime = startPickUpTime;
    this.endPickUpTime = endPickUpTime;
    this.photo = photo;
  }

  public int getFoodSellerId()
  {
    return foodSellerId;
  }

  public String getTitle()
  {
    return title;
  }

  public String getDescription()
  {
    return description;
  }

  public double getPrice()
  {
    return price;
  }

  public MyDate getStartPickUpTime()
  {
    return startPickUpTime;
  }

  public MyDate getEndPickUpTime()
  {
    return endPickUpTime;
  }

  public String getPhoto()
  {
    return photo;
  }
}
