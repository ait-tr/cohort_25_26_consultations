import java.util.ArrayList;

public class Main2 {
  public static void main(String[] args) {
    // generics - обобщения
    // Хочу написать класс Print
    // с методом print -
    // метод принт просто выводит в печать параметр
    int x = 26;
    Printer.print(x);
    // но допустим сможем ли мы распечатать дабл
    double y = 28.9;
    // Printer.print(y); // ошибка
    DoublePrinter.print(y);
    // Но какая проблема тогда возникает?
    // Неужели для каждого типа нам нужно создавать
    // отдельный класс и отдельный метод?
    // Это было бы очень печально, но есть решение.
    // Этим решением и являются дженерики/обощения
    // Мы можем создавать объекты с указанным типом дженерика
    UniversalPrinter<Double> printer = new UniversalPrinter<>();
    printer.print(y);
    String word2 = "Ruslan";
    UniversalPrinter<String> stringPrinter = new UniversalPrinter<>();
    stringPrinter.print(word2);
    // Когда мы используем обобщенные классы
    // - мы можем обойтись меньшим количеством классов.
    // Тем самым повышает переиспользование кода (reusability).
    // Класс ArrayList - это пример обобщенного класса
    // При создании объекта ArrayList мы должны указать тип хранимого
    // значения
    ArrayList<String> names = new ArrayList<>();

  }
}
