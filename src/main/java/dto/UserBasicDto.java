package dto;

public class UserBasicDto
{
  private String email;
  private String password;
  private String phoneNumber;

  private String firstName;
  private String lastName;
  private String name;
  private String address;

  public UserBasicDto(String email, String password, String phoneNumber,
      String firstName, String lastName, String name, String address)
  {
    this.email = email;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.name = name;
    this.address = address;
  }

  public String getEmail()
  {
    return email;
  }

  public String getPassword()
  {
    return password;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }
}
