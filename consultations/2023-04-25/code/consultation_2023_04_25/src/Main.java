import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // структура данный
        // ключи и значения, key value пара
        // ключи должны быть уникальными
        // значения могут повторяться - то есть быть неуникальными
        HashMap<String, String> map1 = new HashMap<>();
        // мы можем добавить значение, используя метод put
        map1.put("Elias", "brown");
        map1.put("Orhan", "brown");
        map1.put("Sergey", "blue");
        map1.put("Elena", "blue");
        // чтобы получить значение по ключу мы используем метод get
        System.out.println(map1.get("Sergey")); // blue
        // заменили значение по ключ "Sergey" на новое значение green
        map1.put("Sergey", "green");
        System.out.println(map1.get("Sergey"));

        System.out.println("******");
        // если мы хотим пройтись по значениям:
        for(String color: map1.values()){
            System.out.println(color);
        }
        System.out.println("******");
        // если мы хотим вывести ключи:
        for(String name : map1.keySet()){
            System.out.println(name);
        }
        // .keySet() - c помощью этого метода можем получить множество ключей
        Set namesSet = map1.keySet();
        System.out.println(namesSet);
        // получить одно значение:
        String colorOfSergey = map1.get("Sergey");
        System.out.println(colorOfSergey);
        // можно удалить пару ключ-значение по ключу remove
        map1.remove("Sergey");
        System.out.println(map1);
        map1.put("Sergey", null);
        System.out.println(map1);
        // немного про массивы и null
        String[] arr = {"9", null};
        System.out.println(arr);
        arr[0] = null;
        //
        // метод принимает номер абонемента, словарь map
        // возвращает String "Добро пожаловать в клуб <имя>"
        //
        HashMap<Integer, String> abonementsById = new HashMap<>();
        abonementsById.put(1, "Ivan Swimmer");
        abonementsById.put(2, "Daria Seeker");
        abonementsById.put(3, "Vera Wong");
        abonementsById.put(4, "Sveta Waterfall");
        System.out.println(great(1, abonementsById));
        System.out.println(great(3, abonementsById));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скажите номер абонемента");
        System.out.println(great(scanner.nextInt(), abonementsById));
        speak();
        String text = cheerUp();
        System.out.println(text.toUpperCase());
        System.out.println(cheerUp());
        repeatPhrase("pip_", 5);
    }
    public static String great(int id, HashMap<Integer, String> abonementMap){
        return "Добро пожаловать " + abonementMap.get(id) + "! Хорошей тренировки!";
    }
    public static void speak(){
        System.out.println("А ты меня любишь? " + cheerUp());
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("да")){
            System.out.println("Я тоже тебя люблю");
        } else {
            System.out.println("ассалам алейкум");
        }
//        cheerUp();
    }
    public static String cheerUp(){
        return "Скоро вы разберетесь во всех тонкостях методов";
    }
    public static void repeatPhrase(String str, int number){
        System.out.println(str.repeat(number)); // "pippippipippip"
    }
}