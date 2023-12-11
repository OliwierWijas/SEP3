package dto;

import shared.MyDate;

import java.util.Date;

public class ReadCommentDTO
{
  private int id;
  private ReadCustomerDTO customer;
  private ReadFoodSellerDTO foodSeller;
  private MyDate date;
  private String content;

  public ReadCommentDTO(int id, ReadCustomerDTO customer, ReadFoodSellerDTO foodSeller, MyDate date, String content) {
    this.id = id;
    this.customer = customer;
    this.foodSeller = foodSeller;
    this.date = date;
    this.content = content;
  }

  public ReadFoodSellerDTO getFoodSeller()
  {
    return foodSeller;
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
      return false;

    ReadCommentDTO other = (ReadCommentDTO) obj;
    return this.id == other.id && this.customer.equals(other.customer) && this.foodSeller.equals(other.foodSeller) && this.date.equals(other.date) && this.content.equals(other.content);
  }
}
