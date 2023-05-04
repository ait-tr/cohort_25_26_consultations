public class Main {
  public static void main(String[] args) {
    Fruit mango = new Fruit(
        "mango", 300, "green", true);
    Fruit mango2 = new Fruit(
        "mango", 500, "green", true);
    // создали незаполненный объект при помощи пустого конструктора
    // в полях такого объекта хранятся значения по умолчанию
    Fruit fruit1 = new Fruit();
    System.out.println(fruit1.isExotic); // false
    System.out.println(fruit1.title);    // null
    System.out.println(fruit1.weight);   // 0.0
    System.out.println(fruit1.color);    // null
    // Значения по умолчанию
    // boolean -> false
    // String или любого ссылочного типа -> null
    // int -> 0
    // double -> 0.0
    // Integer -> null

    // Как заполнить объект значениями
    fruit1.title = "banana";
    fruit1.color = "yellow";
    fruit1.weight = 70;
    fruit1.isExotic = true;

    Animal panda = new Animal();
    System.out.println(panda.getName()); // null
    panda.setName("Po");                 // записали новое значение в поле name
    System.out.println(panda.getName()); // Po
    panda.setAge(27);
    System.out.println(panda);
    
  }
}