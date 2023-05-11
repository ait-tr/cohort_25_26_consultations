import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    // мы сравниваем примитивы при помощи ==
    int x = 9;
    int y = 10;
    if(x == y){
      System.out.println("Bingo");
    }
    // для всех ссылочных типов мы должны использовать
    // equals
    String str1 = "hey";
    String str2 = "Hey-hey";
    System.out.println(str1.equals(str2));
    Planet planet1 = new Planet("Earth", 4);
    Planet planet2 = new Planet("Earth", 4);
    // если
    System.out.println(planet1.hashCode());
    System.out.println(planet2.hashCode());
    if(planet1.hashCode() == planet2.hashCode()){
      System.out.println(planet1.equals(planet2));
    }
    System.out.println("A".hashCode());
    System.out.println(new Integer(65).hashCode());
    String a = "A";
    Integer sixtyFive = new Integer(65);
    System.out.println(a.equals(sixtyFive));


    Planet earth = new Planet("Earth", 3);
    HashSet<Planet> planets = new HashSet<>();
    planets.add(planet1);
    // содержит ли множество указанный элемент?
    // сначала посмотрит по hashCode,
    // если найдет совпадающий hashCode потом по equals
    planets.contains(earth);

    HashSet<Food> foods = new HashSet<>();
    foods.add(new Food("Burger", 1500));
    foods.add(new Food("Pasta", 1200));
    foods.add(new Food("Burger", 1500));
    System.out.println(foods);
    int m = 10;
    m = 29;
    System.out.println(m);
    final int COUNT = 10;

  }
}