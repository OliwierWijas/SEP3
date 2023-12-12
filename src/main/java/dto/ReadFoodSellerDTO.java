package dto;

public class ReadFoodSellerDTO {
    private int accountId;
    private String email;
    private String phoneNumber;
    private String name;
    private String address;
    private String photo;

    public ReadFoodSellerDTO(int accountId, String email, String phoneNumber, String name, String address, String photo) {
        this.accountId = accountId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.photo = photo;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
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

    public String getPhoto()
    {
        return photo;
    }

    @Override public String toString()
    {
        return "ReadFoodSellerDTO{" + "accountId=" + accountId + ", email='"
            + email + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", name='"
            + name + '\'' + ", address='" + address + '\'' + '}';
    }

    @Override public boolean equals(Object obj)
    {
        if (obj == null || obj.getClass() != getClass())
            return false;

        ReadFoodSellerDTO other = (ReadFoodSellerDTO) obj;
        return this.accountId == other.accountId && this.email.equals(other.email) && this.phoneNumber.equals(other.phoneNumber) && this.name.equals(other.name) && this.address.equals(other.address);
    }
}
