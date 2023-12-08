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
}
