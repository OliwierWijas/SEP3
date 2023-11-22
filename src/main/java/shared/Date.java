package shared;

public class Date
{
  private int year;
  private int month;
  private int day;
  private int hour;
  private int minute;

  public Date(int year, int month, int day, int hour, int minute)
  {
    this.year = year - 1900;
    this.month = month - 1;
    this.day = day;
    this.hour = hour;
    this.minute = minute;
  }

  public int getYear()
  {
    return year;
  }

  public int getMonth()
  {
    return month;
  }

  public int getDay()
  {
    return day;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }
}
