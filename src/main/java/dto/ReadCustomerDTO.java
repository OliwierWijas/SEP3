package dto;

public class ReadCustomerDTO
{
  private int accountId;
  private String email;
  private String phoneNumber;
  private String firstName;
  private String lastName;

  public ReadCustomerDTO(int accountId, String email, String phoneNumber,
      String firstName, String lastName)
  {
    this.accountId = accountId;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getAccountId()
  {
    return accountId;
  }

  public String getEmail()
  {
    return email;
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

  @Override public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
      return false;

    ReadCustomerDTO other = (ReadCustomerDTO) obj;
    return this.accountId == other.accountId && this.email.equals(other.email) && this.phoneNumber.equals(other.phoneNumber) && this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
  }
}
