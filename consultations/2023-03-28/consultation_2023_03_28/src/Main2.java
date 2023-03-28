import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Какой пол ребенка? мальчик/девочка
        // Какой возраст у ребенка?
        // 7 --> мальчик: лего пираты, девочке: лего салон красоты
        // 8 --> мальчик: планшет, девочке: набор детской косметики
        // 9 --> мальчику: мяч, девочке: обруч

        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой пол ребенка? мальчик/девочка");
        String gender = scanner.nextLine();
        System.out.println("Какой возраст у ребенка?");
        int age = scanner.nextInt();
        if (gender.equals("мальчик")) {
            // код для мальчика
            switch (age) {
                case 7:
                    System.out.println("Лего пираты");
                    break;
                case 8:
                    System.out.println("Планшет");
                    break;
                case 9:
                    System.out.println("Мяч");
                    break;
                default:
                    System.out.println("Нет подарка для этого возраста");
                    break;
            }
        } else {
            // код для девочки
            switch (age) {
                case 7:
                    System.out.println("Лего салон красоты");
                    break;
                case 8:
                    System.out.println("Набор косметики");
                    break;
                case 9:
                    System.out.println("Обруч");
                    break;
                default:
                    System.out.println("Нет подарка для этого возраста");
                    break;
            }
        }

    }
}
