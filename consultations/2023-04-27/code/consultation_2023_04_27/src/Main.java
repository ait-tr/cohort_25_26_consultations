import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        // "101" -> 5
        // "100" -> 4
        // "10101010"
        // цифра в 10 системе счисления
        // метод в котором будет цикл
        // чтобы этот переводил из строчного представления
        // двоичный кода в десятичное число
        // bin dec oct hex
        String str = "100101010101";
        int acc = 0;
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            System.out.println("Разряд: " + i);
            System.out.println("Два в степени: " + (int) (Math.pow(2, i)));
            System.out.println("Цифра: " + str.charAt(j));
            System.out.println("Два в степени умноженное на цифру: " +
                    (str.charAt(j) - 48) * (int) (Math.pow(2, i)));
            // 48 это разница между char и десятичной - см. ascii цифры
            // у символа '0' - номер 48 и т.д.
            // Суммируем все выражение
            // вариант 1 с погрешностью
//            acc += (str.charAt(j)-48) * (int)(Math.pow(2, i));
            // вариант 2 с методом parse int
//            acc += Integer.parseInt(String.valueOf(str.charAt(j)))* (int)(Math.pow(2, i));
            // вариант 3 с map и с нашим методом converter
            acc += converter(str.charAt(j)) * (int) (Math.pow(2, i));
        }
        System.out.println("Цифра в десятичной: " + acc);

        System.out.println("*****");
        System.out.println(binaryToDecimal("101"));
        System.out.println(binaryToDecimal("100"));
        System.out.println(binaryToDecimal("111"));
        System.out.println(binaryToDecimal("1000"));
    }
    // этот метод преобразовывает из двоичной String в десятичную
    public static int binaryToDecimal(String number){
        int acc = 0;
        for (int i = 0, j = number.length() - 1; i < number.length(); i++, j--) {
            acc += converter(number.charAt(j)) * (int) (Math.pow(2, i));
        }
        return acc;
    }
    // метод для преобразования char в int
    public static int converter(char symbol) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        return map.get(symbol);
    }
}