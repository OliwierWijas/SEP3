package dto;

public class FoodSellerUpdateDTO
{
  private int accountId;
  private String name;
  private String street;
  private int number;
  private String city;
  private String email;
  private String phoneNumber;
  private String password;

  public FoodSellerUpdateDTO(int accountId, String name, String street,
      int number, String city, String email, String phoneNumber,
      String password)
  {
    this.accountId = accountId;
    this.name = name;
    this.street = street;
    this.number = number;
    this.city = city;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.password = password;
  }

  public int getAccountId()
  {
    return accountId;
  }

  public String getName()
  {
    return name;
  }

  public String getStreet()
  {
    return street;
  }

  public int getNumber()
  {
    return number;
  }

  public String getCity()
  {
    return city;
  }

  public String getEmail()
  {
    return email;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getPassword()
  {
    return password;
  }
}
