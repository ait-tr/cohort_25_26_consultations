import java.util.List;

public class Butler {
  public void hello(String guestName, TypeOfGreeting typeOfGreeting){
    System.out.println( typeOfGreeting.greet(guestName));
  }
  public void greetAll(List<String> names, TypeOfGreeting typeOfGreeting){
    for(String name: names){
      System.out.println(typeOfGreeting.greet(name));
    }
  }
}
