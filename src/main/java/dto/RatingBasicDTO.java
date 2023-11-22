package dto;

public class RatingBasicDTO {
    private int foodSellerId;
    private int customerId;
    private int rate;

    public RatingBasicDTO(int foodSellerId, int customerId, int rate) {
        this.foodSellerId = foodSellerId;
        this.customerId = customerId;
        this.rate = rate;
    }

    public int getFoodSellerId() {
        return foodSellerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getRate() {
        return rate;
    }
}
