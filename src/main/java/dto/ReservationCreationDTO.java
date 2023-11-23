package dto;

public class ReservationCreationDTO
{
  private int customerId;
  private int foodOfferId;

  public ReservationCreationDTO(int customerId, int foodOfferId)
  {
    this.customerId = customerId;
    this.foodOfferId = foodOfferId;
  }

  public int getCustomerId()
  {
    return customerId;
  }

  public int getFoodOfferId()
  {
    return foodOfferId;
  }
}
