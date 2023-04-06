import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        // если мы создали массив и не задали значения
        // то там будут лежать значения по умолчанию
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        // ...
//        System.out.println(numbers[9]);
        System.out.println("*** распечатали массив со значениями по умолчанию ***");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
//        // вручную
//        numbers[0] = 15;
//        numbers[1] = 15;
//        numbers[2] = 15;
//        // ...
//        numbers[9] = 15;
        // изменили массив - записали в каждую ячейку значение 15
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 15;
        }
        numbers[0] = 10_000;
        System.out.println("** вывод в консоль **");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("**вывод в обратном порядке*");
        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(i);
            System.out.println(numbers[i]);
        }
        // как записать новые значения в массив
        // например, запишем значения от 91 до 100
        // вручную
        numbers[0] = 91;
        numbers[1] = 92;
        numbers[2] = 93;
        //...
        numbers[9] = 100;
        // numbers[i]
        System.out.println("*** через цикл фор вариант 1 ***");
        for (int i = 0; i <= 9; i++) {
            numbers[i] = 91 + i;
        }
        System.out.println("*** через цикл фор вариант 2 ***");
        int a = 91;
        for (int i = 0; i <= 9; i++) {
            numbers[i] = a;
            a++;
        }

        System.out.println("** Массив String **");
        String[] steps = new String[100];
        System.out.println(steps.length); // 100
        // Если мы не проинициализировали массив,
        // то там хранятся значения по умолчанию
        // для типа String значением по умолчанию является null
        System.out.println(steps[21]);
        steps[0] = "Step 1";
        steps[1] = "Step 2";

        // {"Step 1", "Step 2", "Step 3"...}
        for (int i = 0; i < steps.length; i++) {
            steps[i] = "Step " + (i + 1);
        }

        System.out.println("** print array of steps **");
        for (int i = 0; i < steps.length; i++) {
            System.out.println(steps[i]);
        }

        System.out.println("*** Scanner and array *** ");
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Введите имя вашего отца");
        names[0] = scanner.nextLine();
        System.out.println("Введите имя матери");
        names[1] = scanner.nextLine();
        System.out.println("Введите ваше имя");
        names[2] = scanner.nextLine();

        // распечатаем полученные значения
//        for (int i = 0; i< names.length; i++){
//            System.out.println(names[i]);
//        }
        System.out.printf(
                "Имя матери: %s \nИмя отца: %s\nИмя пользователя: %s",
                names[1],
                names[0],
                names[2]
        );

    }
}