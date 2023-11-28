package dto;

public class ReadFoodSellerDTO {
    private int accountId;
    private String email;
    private String phoneNumber;
    private String name;
    private String address;

    public ReadFoodSellerDTO(int accountId, String email, String phoneNumber, String name, String address) {
        this.accountId = accountId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
