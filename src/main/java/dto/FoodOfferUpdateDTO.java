package dto;

import shared.MyDate;

public class FoodOfferUpdateDTO
{
  private int foodOfferId;
  private String title;
  private String description;
  private double price;
  private MyDate startPickUpTime;
  private MyDate endPickUpTime;

  public FoodOfferUpdateDTO(int foodOfferId, String title, String description,
      double price, MyDate startPickUpTime, MyDate endPickUpTime)
  {
    this.foodOfferId = foodOfferId;
    this.title = title;
    this.description = description;
    this.price = price;
    this.startPickUpTime = startPickUpTime;
    this.endPickUpTime = endPickUpTime;
  }

  public int getFoodOfferId()
  {
    return foodOfferId;
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
}
