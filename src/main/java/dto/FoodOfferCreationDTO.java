package dto;

import shared.Date;

public class FoodOfferCreationDTO
{
  private int foodSellerId;
  private String title;
  private String description;
  private double price;
  private Date startPickUpTime;
  private Date endPickUpTime;

  public FoodOfferCreationDTO(int foodSellerId, String title, String description,
      double price, Date startPickUpTime, Date endPickUpTime)
  {
    this.foodSellerId = foodSellerId;
    this.title = title;
    this.description = description;
    this.price = price;
    this.startPickUpTime = startPickUpTime;
    this.endPickUpTime = endPickUpTime;
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

  public Date getStartPickUpTime()
  {
    return startPickUpTime;
  }

  public Date getEndPickUpTime()
  {
    return endPickUpTime;
  }
}
