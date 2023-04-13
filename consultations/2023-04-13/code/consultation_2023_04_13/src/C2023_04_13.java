import java.util.Arrays;
import java.util.Scanner;

public class C2023_04_13 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(getNumbersInOrder())
                );
    }
    public static int[] getNumbersInOrder() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Введите число");
        int first = scanner.nextInt();
        System.out.println("Введите число");
        int second = scanner.nextInt();
        System.out.println("Введите число");
        int third = scanner.nextInt();
        // 9 3 1
        // 3 9 1 - первое и второе значение
        // 3 1 9 - второе и третье
        // 1 3 9 - перовое и второе
        int temp;
        // первое и второе значение
        if (first > second){
            temp = second;
            second = first;
            first = temp;
        }
        // сравним второе и третье
        if (second > third){
            temp = third;
            third = second;
            second = temp;
        }
        // первое и второе
        if (first > second){
            temp = second;
            second = first;
            first = temp;
        }
        return new int[]{first, second, third};
    }
}
