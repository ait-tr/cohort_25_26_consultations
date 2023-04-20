import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {9, 12, 18, 24, 9};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("***");
        // теперь сделаем то же самое с помощью for-each
        for(int element: numbers){
            System.out.println(element);
        }
        String[] words = {"apple", "orange", "pear"};
        for(String word: words){
            System.out.println(word);
        }
        words[2]= null;

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venera");
        planets.add("Earth");
        planets.add("Mars");
        System.out.println(planets);
        planets.remove(1);   // Удаление по индексу Удалит Venera
        System.out.println(planets);
        planets.remove("Mars"); // Удаляем объект - передаем объект, который желаем удалить
        System.out.println(planets);
        // с массивом
        String[] students = {"Yulia", "Iryna", "Dmitry", "Elias"};
        for (int i = 0; i< students.length; i++){
            if (students[i].equals("Dmitry")){
                students[i] = null;
            }
        }
        System.out.println(Arrays.toString(students));

        "word".equals("word2"); // false
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(9);
        numbers2.add(12);
        numbers2.add(20);
        int sum = 0;
        for(int i = 0; i < numbers2.size(); i++){
            System.out.println("sum: " + sum + " element: "+ numbers2.get(i) );
            sum = sum + numbers2.get(i);
        }
        System.out.println(sum);
        // то же самое, но с помощью for-each
        int sum2 = 0;
        for(Integer number: numbers2){
            sum2 += number;
        }
        System.out.println(sum2);
        String[] words2 = {"Apple", "Car" , "Giraffe" , "Sword"};
        String car = "Car";     // 67
        String apple = "Apple"; // 65
        char carFirst = car.charAt(0);
        char appleFirst = apple.charAt(0);
        System.out.println(carFirst + appleFirst);
        System.out.println(appleFirst > carFirst);
        boolean isBoy = false;
        String name = isBoy ?"Sergey" : "Katya";

        // switch
        String animal = "pig";
        // "pig"     --> "Wheee"
        // "chicken" --> "Pick-pick"
        // "dog"     --> "Woof"
        switch (animal) {
            case "pig":
                System.out.println("Случай со свинкой");
                // здесь любой код
                break;
            case "chicken":
                System.out.println("Случай с цыпленком");
                break;
            case "dog":
                System.out.println("Случай с собачкой");
                break;
            default:
                System.out.println("Все остальные значения animal");
                System.out.println("Случай по умолчанию");
        }


    }

}