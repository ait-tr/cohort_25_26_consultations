import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    // Написать метод, возвращающий самую длинную строку из текстового файла
    public static void main(String[] args) {
        DayOfWeekResolver resolver = new DayOfWeekResolver();
        resolver.start();

        System.out.println(isLongest("in.txt"));
    }

    public static String isLongest (String fileName)  {
        String longest = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String current;

            while ((current = br.readLine()) != null) {

                if (current.length() > longest.length())
                    longest = current;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return longest;

    }
    //1.Написать класс DayOfWeekResolver, содержащий  метод или методы и/или поля, который при вводе с клавиатуры дня недели отвечает на вопрос
    // выходной ли это день. Если выходной то возвращает true, если рабочий то false.
    // Вызов метода должен происходить в классе Main  в методе main
    // В решении использовать Enum.
    //2. Создать класс Employee, имеющий следующие поля и методы:
    /*
      - поля: salary(зарплата), numberOfWorkingHours (количество проработанных часов за день)
      - конструктор, принимающий эти параметры
      - метод AddSalaryIfMin , добавляющий  10 евро к зарплате сотрудника  если она меньше 500 евро
      - метод  AddSalaryIfMuchWork, который добавляет 5 евро к зарплате сотрудника, если количество рабочих часов
            в день больше 6
        В классе Main создать несколько экземпляров сотрудников , применить к ним эти методы, вывести результат
        в консоль
     */

}
