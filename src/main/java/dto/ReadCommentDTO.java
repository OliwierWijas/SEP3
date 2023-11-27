package dto;

import shared.MyDate;

import java.util.Date;

public class ReadCommentDTO
{
  private int id;
  private int customerId;
  private int foodSellerId;
  private String customerFirstName;
  private String customerLastName;
  private MyDate date;
  private String content;

  public ReadCommentDTO(int id, int customerId, int foodSellerId, String customerFirstName, String customerLastName, MyDate date, String content) {
    this.id = id;
    this.customerId = customerId;
    this.foodSellerId = foodSellerId;
    this.customerFirstName = customerFirstName;
    this.customerLastName = customerLastName;
    this.date = date;
    this.content = content;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getCustomerId()
  {
    return customerId;
  }

  public void setCustomerId(int customerId)
  {
    this.customerId = customerId;
  }

  public int getFoodSellerId()
  {
    return foodSellerId;
  }

  public void setFoodSellerId(int foodSellerId)
  {
    this.foodSellerId = foodSellerId;
  }

  public MyDate getDate()
  {
    return date;
  }

  public void setDate(MyDate date)
  {
    this.date = date;
  }

  public String getContent()
  {
    return content;
  }

  public void setContent(String content)
  {
    this.content = content;
  }

}
