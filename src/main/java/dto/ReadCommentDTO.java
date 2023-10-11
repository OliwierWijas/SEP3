package dto;

import java.util.Date;

public class ReadCommentDTO
{
  private int id;
  private int customerId;
  private int foodSellerId;
  private String customerFirstName;
  private String customerLastName;
  private Date date;
  private String content;

  public ReadCommentDTO(int id, int customerId, int foodSellerId, String customerFirstName, String customerLastName, Date date, String content) {
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

  public Date getDate()
  {
    return date;
  }

  public void setDate(Date date)
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
