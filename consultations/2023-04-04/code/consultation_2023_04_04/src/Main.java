public class Main {
    public static void main(String[] args) {


        String word = "Ivan";
        word = word + "Vladimir";
        System.out.println(word);

        String acc = "apple_";
//        acc += "apple_";
//        acc += "apple_";
//        acc += "apple_";
//  один раз в начале //
        for (int i = 2; i < 10; i++) {
            acc += "apple_";
        }
        System.out.println(acc);

        for (int i = 0; i < 10; i++) {
            System.out.println("Количество людей в команде " + i);
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Хотите найти себе четного человека в команду?");
//            break;
        }
        // более сложные случаи
        for (int i = 1, j = 2; i < 5; i++, j++) {
            System.out.println(i + " " + j);
        }
        // 1 10
        // 2 9
        // 3 8
        // ...
        System.out.println("*".repeat(10));

        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println(i + " " + j);
        }


        System.out.println("*".repeat(10));

        // accumulator
        // суммировать все четные числа от 28 до 300;
        int accumulator = 0;
        for (int i = 28; i < 301; i++) {
            if (i % 2 == 0) {
                accumulator += i; // accumulator = accumulator + i;
//                System.out.println(i);
            }
        }
        System.out.println(accumulator);

        // задача от Анны - вывести первые 15 чисел этой последовательности
        for (int i = 28, j = 1; i < 301 && j <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                j++;
            }
        }
        // как из одного типа получить другой
        // 1. из String в int или double...
        String x = "9123";
        int x1 = Integer.parseInt(x); // из String в int
        String namePlusAge = "Ivan37";
        String age = namePlusAge.substring(4); // "37"
        int ageAsNumber = Integer.parseInt(age); // из String в int
        double ageAsDouble = Double.parseDouble(age); // из String в double
        // 2. преобразование в тип стринг
        // первый способ преобразования - прибавление к пустой строке ""
        double weight = 65.5;
        String weightAsString = "" + weight;
        System.out.println(weightAsString);
        // второй способ преобразования из чего угодно в String
        // метод valueOf() создаст стринг из переданного значения
        double horsePowers = 4.3;
        String horsePowersAsString = String.valueOf(horsePowers);
        // code wars
        // charAt
        String mother = "Mama";
        char a = mother.charAt(1);
        System.out.println(a);





    }
}