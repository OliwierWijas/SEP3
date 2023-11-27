package dto;

public class ReadRatingDTO {
    private int customerId;
    private int foodSellerId;

    public ReadRatingDTO(int customerId, int foodSellerId) {
        this.customerId = customerId;
        this.foodSellerId = foodSellerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getFoodSellerId() {
        return foodSellerId;
    }
}
