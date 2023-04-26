import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(readIntoString("input.txt"));
        System.out.println(returnSum("inputNumbers.txt"));

        //1.Есть текстовый файл. Написать метод, читающий этот файл в строку
       /* aaa
          bbbbbbb
          cc
          -> aaa bbbbbbb cc

        */
    }
    public static String readIntoString(String input) throws IOException {
        String str = "";

        BufferedReader br = new BufferedReader(new FileReader(input));
        String line;


        while((line = br.readLine())!=null){
            str = str +" "+line;
        }
      return str;
    }

    /*
    Написать метод, читающий тексовый файл с числами такого вида :
    1
    2
    3
    4
    5
    и возвращающий их сумму.
     */
    public static int returnSum (String fileName) throws IOException {
        int sum = 0;
        String nextInt;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
                while ((nextInt =br.readLine()) != null){
                    sum = sum + Integer.parseInt(nextInt);
                }

                return sum;
    }
    /*
    Написать метод, находящий самую длинную строчку в текстовом файле.
    т.е. если есть файл такого вида
aaa
bbbbbb
cc

то ответ bbbbbb
     */
}
