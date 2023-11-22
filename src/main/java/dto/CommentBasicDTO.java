package dto;

public class CommentBasicDTO {
    private int foodSellerId;
    private int customerId;
    private String comment;


    public CommentBasicDTO(int foodSellerId, int customerId, String comment) {
        this.foodSellerId = foodSellerId;
        this.customerId = customerId;
        this.comment = comment;
    }

    public int getFoodSellerId() {
        return foodSellerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getComment() {
        return comment;
    }
}
