package dto;

import shared.Date;

public class FoodOfferUpdateDTO
{
  private int foodOfferId;
  private String title;
  private String description;
  private double price;
  private Date startPickUpTime;
  private Date endPickUpTime;

  public FoodOfferUpdateDTO(int foodOfferId, String title, String description,
      double price, Date startPickUpTime, Date endPickUpTime)
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

  public Date getStartPickUpTime()
  {
    return startPickUpTime;
  }

  public Date getEndPickUpTime()
  {
    return endPickUpTime;
  }
}
