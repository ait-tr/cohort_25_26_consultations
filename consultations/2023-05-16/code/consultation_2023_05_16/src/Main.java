import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Math.random();
    // от 0 включительно до 1 не включительно
    System.out.println(Math.random());
    // если число в диапазоне, то можно воспользоваться формулой
    int min = 10;  // нижняя граница диапазона
    int max = 30;  // верхняя граница диапазона
    int randomNumber = min + (int)(Math.random()*(max - min + 1));
    System.out.println(randomNumber); // случайное число в диапазоне от 10 до 30 включительно

    // Класс Random
    Random random = new Random();
    int x = random.nextInt(10); // генерирует случайное число от 0 до 10, 10 не включительно;
    System.out.println(x);
    int y = random.nextInt(20, 31); // сгенерирует случайное число из указанного диапазона, верхняя не включительно

    // Comparable
    //
    ArrayList<Food> foods = new ArrayList<>();
    foods.add(new Food("Fish", 20, 3, 18));
    foods.add(new Food("Stake", 30, 6, 50));
    foods.add(new Food("Broccoli", 2, 15, 6));
    System.out.println("До сортировки");
    System.out.println(foods);

    Food fish = new Food("Fish", 20, 3, 18);
    Food stake = new Food("Stake", 30, 6, 50);
    System.out.println(fish.compareTo(stake));
    // Collections.sort будет работать только при условии,
    // что мы имплементировали в классе интерфейс Сomparable
    Collections.sort(foods);
    System.out.println("После сортировки");
    System.out.println(foods);

    // если мы хотим использовать другую логику сортировки,
    // то нам придется использовать интерфейс Comparator
    foods.sort(new FoodByProteinComparator());
    //
    System.out.println("После сортировки по протеинам");
    System.out.println(foods);
    //
    System.out.println("После сортировки по углеводам в обратном порядке");
    System.out.println("От большего к меньшему"); // метод .reversed()
    foods.sort(new FoodByCarbonhydratesCamparator().reversed());
    System.out.println(foods);

  }

}