import java.util.Scanner;

public class Mian2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int count = s.nextInt();
        s.nextLine();
        String[] words = new String[count];
        String word;
        boolean isContains = false;
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите слово");
            words[i] = s.nextLine();
        }
        for (int i = 0; i < words.length; i++) {
            String min = words[i];
            int minIndex = i;
            for (int j = i; j < words.length; j++) {
                if (words[j].charAt(0) < min.charAt(0)) {
                    min = words[j];
                    minIndex = j;
                }
                String temp = words[i];
                words[i] = words[minIndex];
                words[minIndex] = temp;
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
