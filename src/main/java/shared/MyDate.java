package shared;

public class MyDate
{
  private int year;
  private int month;
  private int day;
  private int hour;
  private int minute;

  public MyDate(int year, int month, int day, int hour, int minute)
  {
    this.year = year;
    this.month = month;
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

  @Override public String toString()
  {
    return "MyDate{" + "year=" + year + ", month=" + month + ", day=" + day
        + ", hour=" + hour + ", minute=" + minute + '}';
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
      return false;

    MyDate other = (MyDate) obj;
    return this.year == other.year && this.month == other.month && this.day == other.day && this.hour == other.hour && this.minute == other.minute;
  }
}
