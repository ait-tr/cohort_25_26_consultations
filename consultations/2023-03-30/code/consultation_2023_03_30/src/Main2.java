import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // получим от пользователя код
        // вызываем метод
        int codeFromUser = codeValidator();
        // вызовем второй метод, куда передадим код от первого метода
        String carBrand = getBrandByNumber(codeFromUser);
        System.out.println(carBrand);
    }
    public static String getBrandByNumber(int code){
        switch (code){
            case 1:
                return "BMW";
            case 2:
                return "Volkswagen";
            case 3:
                return "Mercedes";
            case 4:
                return "Porsche";
            default:
                return "No such brand";
        }
    }
    public static int codeValidator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код машины");
        int code = scanner.nextInt();
        if (code < 1 || code > 4){
            System.out.println("Невалидный код");
            System.out.println("Введите код заново");
            code = scanner.nextInt();
        }
        return code;
    }

}

// 1 - BMW
// 2 - Volkswagen
// 3 - Mercedes
// 4 - Porsche
