import java.util.List;

public class Main {
  public static void main(String[] args) {
//    /*Задание 1а
//   Создайте функциональный интерфейс, с методом,
//         который принимает два параметра - два слова String,
//         тип возвращаемого значения - String;
    //Создайте лябду на основе этого интерфейса.
    // Пусть в этой реализации метод возвращает
    // самое длинное слово из двух. Вызовите метод.
    StringProcesser getLongestFunction = (str1, str2) -> {
      if (str1.length() > str2.length()) {
        return str1;
      }
      return str2;
    };
    String longest = getLongestFunction.process("Table", "Page");
    System.out.println(longest);
    StringProcesser getLongestFunctionVer2 =
        ((str1, str2) -> str1.length() > str2.length() ? str1 : str2);
    String longest2 = getLongestFunctionVer2.process("Tab", "Pages");
    System.out.println(longest2);

    // Cоздайте функциональный интерфейс - c методом
    // который принимает строку и число и возвращает строку.
    // Cоздайте метод repeat, который принимает строку, число и лямбду
    // (ее тип - это интерфейс, который вы создали) и возвращает новую строку.
    // Вызовите метод, передав в него лямбду,
    // такую что возвращается строка повторенная указанное количество раз.

    StringFunction repeat2times = (str, num) -> {
      return str.repeat(2);
    };
    StringFunction repeatNTimes = (str, num) -> {
      return str.repeat(num);
    };
    String str2 = repeat("cat", 10, repeat2times);
    String str3 = repeat("cat", 10, repeatNTimes);
    System.out.println(str2);
    System.out.println(str3);
    // лябмда которая 3 раза повторяет слово и добавляет слово перец
    String str4 =
        repeat("cat", 10, (str, num) -> str + str + str + "paper");
    String str5 =
        repeat("cat", 10, (str, num) -> "any word");
    System.out.println(str4);
    System.out.println(str5);

    //
    Butler alfred = new Butler();
    alfred.hello("Sergey", (name)-> "Good day, " + name);
    // Альфред гость китаец - поприветствуйте его по китайски
    alfred.hello("Po", (name)-> "Nihau "+ name);
    TypeOfGreeting easterGreeting = (name)-> "Happy Easter, " + name;
    // гости приходят к нам на пасху
    alfred.hello("Anna", easterGreeting);
    alfred.hello("Fred", easterGreeting);
    alfred.hello("John", easterGreeting);
    List guests = List.of("Liza", "Maria", "Leon", "Kate", "Paul");
    alfred.greetAll(guests, easterGreeting);
    // Хозяин поместья не в настроении и приказал всем прибывшим гостям убираться
    alfred.greetAll(guests, (name) -> name + ", go away!");

  }

  public static String repeat(String str, int number, StringFunction lambda) {
    return lambda.process(str, number);
  }
}