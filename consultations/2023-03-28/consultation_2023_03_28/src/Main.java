import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // мы хотим ограничить ввод цифрами от 0 до трех
        System.out.println("Введите целое число от 0 до 3 включительно");
        int answer = scanner.nextInt();
        if (!(answer >= 0 && answer <= 3)) {
            System.out.println("Введено некорректное число");
            System.out.println("Введите число 0 до 3");
            answer = scanner.nextInt();
        }
        System.out.println(answer);
        // 0 --> Cola
        // 1 --> Sprite
        // 2 --> Orange Juice
        // 3 --> Ice Tee
        switch (answer) {
            case 0:
                System.out.println("Вот ваша Cola");
                break;
            case 1:
                System.out.println("Вот ваш Sprite");
                break;
            case 2:
                System.out.println("Blablaba");
                System.out.println("Вот ваш Orange Juice");
                break;
            case 3:
                System.out.println("Вот ваш Ice Tee");
                break;
            default:
                System.out.println("Нет напитка под этим номером");
        }

        String word = "Dog";
        switch (word){
            case "Cat":
                System.out.println("Meow");
                break;
            case "Dog":
                System.out.println("Wuf");
                break;
            default:
                System.out.println("Ошибка");
        }





    }
}