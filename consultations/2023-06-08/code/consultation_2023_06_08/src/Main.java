import java.util.ArrayList;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Kristina");
    names.add("Irina");
    names.add("Sergey");
    names.add("Ekaterina");
    names.add("Ekaterina");
    System.out.println(names);

    HashSet<String> namesSet = new HashSet<>();
    namesSet.add("Kristina");
    namesSet.add("Irina");
    namesSet.add("Sergey");
    namesSet.add("Ekaterina");
    namesSet.add("Ekaterina");
    System.out.println(namesSet);
    // Выводы:
    // - дублирующиеся не добавились
    // - порядок невозможно предсказать
    // Как хранятся элементы?
    // - они добавляются в корзины по хэш коду
    // метод хеш-код вычисляет число на основании некоторых правил
    // для стринга "Sergey" вот какой хеш-код:
    System.out.println("Sergey".hashCode());
    // Могут ли два разных объекта иметь одинаковый хеш код?
    // Да, в очень редких случаях они могут совпасть.

    // Если хеш-коды разные, что можно сказать об объектах?
    // Объекты точно не равны !equals

    // Получается, что удобно сначала сравнивать хеш-код
    // и только потом, если и только если он одинаковый,
    // сравнивать методом equals.

    // Проверка наличия элементов в хэш структурах происходит мгновенно
    // О(1)

    // Есть один нюанс :)
    HashSet<Panda> pandas = new HashSet<>();
    pandas.add(new Panda("Po"));
    pandas.add(new Panda("Kun Fu"));
    pandas.add(new Panda("Po"));
    System.out.println(pandas);
    Panda panda1 = new Panda("Po");
    Panda panda2 = new Panda("Po");
    // если мы не переопределили метод equals
    // то panda1.equals(panda2) == false
    // а если переопределили, то == true
    System.out.println(panda1.equals(panda2));
    // Вывод - если работаем с хеш-структурами -
    // обязательно должен присутствовать переопределенный
    // equals и hashCode
    // Менять можно только вместе - equals и hashCode.

    // какое отношение между Rat и Animal - отношение наследования
    ArrayList<Rat> rats = new ArrayList<>();
    ArrayList<Animal> animals = new ArrayList<>();
    // ArrayList<Rat> rats между ArrayList<Animal> animals
    // нет отношения наследования
    // И что? Какие от этого проблемы?
    // Проблема в том что раз между отношения наследования,
    // мы не можем их обобщить одним параметризованным типом
    // дженерика
    // Проблема возникает в контексте именно дженериков.
    // Чтобы ее решить существует синтаксис wildcard
    // wildcard - ?
    // ? extends Animal - upper bound - верхнее ограничение
    // то любой тип потомок Animal, либо сам Animal
    ArrayList<? extends Animal> animals2 = new ArrayList<>();

    print(animals); // работает
    // print(rats); // не работает - ошибка
    unversalPrint(rats); // работает

    // ? super Rat - нижняя граница - lower bound
    // universalPrintVer2(rats); ругается

    //
  }
  public static void universalPrintVer2(ArrayList<? super Animal> animals){
    System.out.println(animals);
  }
  public static void unversalPrint(ArrayList<? extends Animal> animals){
    System.out.println(animals);
  }
  public static void print(ArrayList<Animal> animals){
    System.out.println(animals);
  }
}