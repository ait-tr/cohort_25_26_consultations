import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //  Бар
        // Что будете пить?
        // Сидр, Вино, Кофе
        // если выбирают вино,
        // то задается еще один вопрос: Красное или белое?
        // Клиент отвечает.
        // После этого бармен сообщает стоимость заказа
        // сидр 3 евро
        // вино белое - 2 евро
        // вино красное - 3 евро
        // кофе 3.5 евро
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что будете пить?(Сидр, Вино, Кофе)");
        String drink = scanner.nextLine();
        String colorOfWine = "";
        if (drink.equalsIgnoreCase("Вино")) {
            System.out.println("Вино красное или белое?");
            colorOfWine = scanner.nextLine();
        }
        switch(drink){
            case "Сидр":
                System.out.println("С вас 3 евро");
                break;
            case "Вино":
                if(colorOfWine.equalsIgnoreCase("красное")){
                    System.out.println("С вас 3 евро");
                } else {
                    System.out.println("С вас 2 евро");
                }
                break;
            case "Кофе":
                System.out.println("С вас 3,5 евро");
                break;
            default:
                System.out.println("Простите, нет такого напитка");
        }

    }
}
