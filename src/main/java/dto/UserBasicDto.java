package dto;

public class UserBasicDto
{
  private int id;
  private String email;
  private String password;
  private String phoneNumber;
  private String type;

  private String firstName;
  private String lastName;
  private String name;
  private String address;

  public UserBasicDto(int id, String email, String password, String phoneNumber, String type,
      String firstName, String lastName, String name, String address)
  {
    this.id = id;
    this.email = email;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.type = type;
    this.firstName = firstName;
    this.lastName = lastName;
    this.name = name;
    this.address = address;
  }

  public int getId() {
    return id;
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
  public String getType() {return type;}

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

  @Override public String toString()
  {
    return "UserBasicDto{" + "id=" + id + ", email='" + email + '\''
        + ", password='" + password + '\'' + ", phoneNumber='" + phoneNumber
        + '\'' + ", type='" + type + '\'' + ", firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\'' + ", name='" + name + '\''
        + ", address='" + address + '\'' + '}';
  }
}
