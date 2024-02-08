import Classes.AllTimeZone;
import Classes.CustomTimeZone;
import Classes.TimeZone;

public class GlobalTimeZoneHarbour{
  public static void main(String[] args) {
    TimeZone timeZone = new TimeZone("In", "India", "+5:30", 1);
    System.out.println("\n"+".....Below statements are from methods of TimeZone class.....");
    timeZone.showTimeZone();
    timeZone.filteredTimeZone();

    AllTimeZone allTimeZone = new AllTimeZone();
    System.out.println("\n"+".....Below statements are from methods of AllTimeZone class.....");
    allTimeZone.addToCustomTimeZone();

    CustomTimeZone customTimeZone = new CustomTimeZone();
    System.out.println("\n"+".....Below statements are from methods of CustomTimeZone class.....");
    customTimeZone.removeAddedCustomTimeZone();
    customTimeZone.updatePriority();
  }
}