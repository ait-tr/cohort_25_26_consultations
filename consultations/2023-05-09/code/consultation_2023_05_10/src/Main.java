import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Duck donald = new Duck(
        24, "Donald Duck", 2, 50);
    donald.say();
    System.out.println(donald);

    Penguin colonel = new Penguin(
        2,
        "Colonel",
        2,
        30, 5);
    colonel.say();
    System.out.println(colonel);
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(colonel);
    animals.add(donald);
    System.out.println("****");
    for (Animal animal: animals){
      animal.say();
    }
    colonel.print();
    int x = colonel.print(2);
    Duckling donaldJr = new Duckling(1,
        "Junior", 0.5, 0);
    donaldJr.say();

  }
}