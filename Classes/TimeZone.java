package Classes;
import java.time.LocalDate;

public class TimeZone {

  //Attributes
  public String CountryCode;

  public LocalDate TimeZone;

  public String CountryName;

  public String GMTOffset;

  public int Priority;

  //Methods
  //Constructor
  public TimeZone(String CountryCode, String CountryName, String GMTOffset, int Priority){
    System.out.println(".....Below statements are from TimeZone constructor.....");
    this.CountryCode = CountryCode;
    this.CountryName = CountryName;
    this.GMTOffset = GMTOffset;
    this.Priority = Priority;
    System.out.println("County Code is:"+ this.CountryCode);
    System.out.println("Country Name is:"+ this.CountryName);
    System.out.println("GMTOffset is:"+ this.GMTOffset);
    System.out.println("Priority is:"+ this.Priority);
  }

  public void showTimeZone(){
    System.out.println("showTimeZone method from time Zone Class");
  };

  public void filteredTimeZone(){
    System.out.println("filteredTimeZone method from filtered Time Zone Class");
  };
}
