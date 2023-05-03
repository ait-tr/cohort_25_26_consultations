import java.util.Scanner;

public class DayOfWeekResolver {
    static Scanner scanner = new Scanner(System.in);

    public void start(){
        String dayOfWeek = readDayOfWeek();
        System.out.println("It is "+isDayOf(dayOfWeek));
        scanner.close();
    }

   String readDayOfWeek(){
       System.out.println("Enter day of week");
      // String day = scanner.nextLine();
      // return day;
       return scanner.next();
   }

   boolean isDayOf(String day){
       DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
       return isDayOff(dayOfWeek);
   }

   boolean isDayOff(DayOfWeek day){
       switch (day){
           case SATURDAY:
           case SUNDAY: return true;
           default: return false;

       }
   }
}
