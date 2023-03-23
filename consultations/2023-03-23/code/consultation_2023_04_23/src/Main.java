import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Напишите программу, которая просит пользователя ввести строку,
//        после чего выводит на экран, введенную строку,
//        в две строчки (причем строчки должны быть равны,
//        или вторая строчка может быть короче на 1 символ).

        // ввели слово: конь - если количество символов в String четное
        // первая строка: ко
        // вторая строка: нь

        // ввели слово: жеребец - нечетное количество символов
        // первая строка: жере
        // вторая строка: бец

        // Для приготовления программы нужен рецепт:
        // + одна столовая ложка сканера  - для ввода данных
        // + один стакан метода .length() - для определения длинны строки
        // - целочисленное деление %      - и для определения середины
        // - щепотка метода substring()   - для того, чтобы выделить две части строки

        // Но сначала повторим целочисленное деление
        // %

        System.out.println(9 % 8);   // 1
        System.out.println(10 % 8);  // 2
        System.out.println(12 % 8);  // 4
        System.out.println(6 % 10);  // 6
        System.out.println(16 % 10); // 6
        System.out.println(100 % 10);// 0
        System.out.println(4 % 7);   // 4
        System.out.println(7 % 4);   // 3
        System.out.println(12 % 18); // 12
        System.out.println(14 % 16); // 14
        System.out.println(16 % 14); // 2
        System.out.println(3 % 9);   // 3
        System.out.println(37 % 12); // 1
        System.out.println(37 / 12); // 3
        double d = 37 / 12;          //
        System.out.println(d);       // 3.0
        double d1 = 37d / 12;        // d - указывает, что это дабл, f- float, l- long
        System.out.println(d1);      // 3.0833333333333335

        System.out.println("******");
        double d2 = 3.78;
        int i2 = (int) d2;
        int i3 = 12;
        double d3 = (double) i3;

        // Приступим к приготовлению:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        int textLength = text.length();
        System.out.println(textLength); // 7 - для слова Жеребец // середина 3
        // 4 - конь
        int middleIndex = (textLength / 2) + textLength % 2;
        System.out.println(text.substring(0, middleIndex));
        System.out.println(text.substring(middleIndex));

        String numberOfStudents = "sdas";  // camelCase иногда lowerCamelCase
        // number_of_students - snake_case  - например в HTML - является популярным
        // number-of-students - kebab-case  - CSS - названия свойств
        // NUMBER_OF_STUDENTS - SNAKE_CASE  - такая конвенция используется для констант

    }
}