import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] fruits = getInfoFromUser();
        print(fruits);
        play("футбол");
        play("хоккей");
        play("карты");
        int x = 15 + getFive();
        System.out.println(x);
        String[] cars = new String[] {
                "BMW",
                "Mercedes",
                "Porsche"
        };
        print(cars);
        changeBMWtoKIA(cars);
        print(cars);
        System.out.println("** Дальше займемся сканером **");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество машин");
        String answer = scanner.nextLine(); // "jn15g" --> 15
        int carsNumber = Integer.parseInt(answer);
        String[] usersCars = new String[carsNumber];
        // дальше будем получать от пользователя по одной машине
        for(int i = 0; i < carsNumber; i++){
            System.out.println("Введите название машины");
            usersCars[i] = scanner.nextLine();
        }
        print(usersCars);
    }
    // хочется создать метод
    // - который бы получал от пользователя информацию
    // и возвращал бы эту информацию
    // получить названия двух фруктов
    public static String[] getInfoFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название фрукта");
        String fruit1 = scanner.nextLine();
        System.out.println("Введите название второго фрукта");
        String fruit2 = scanner.nextLine();
        return new String[]{fruit1, fruit2};
    }
    public static void print(String[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void changeBMWtoKIA(String[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("BMW")){
                arr[i] = "KIA";
            }
        }
    }

    public static void play(String gameTitle) {
        System.out.println("Поиграем в "+ gameTitle);
    }
    public static int getFive(){
        return 5;
    }
}