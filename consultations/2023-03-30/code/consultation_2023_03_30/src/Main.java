public class Main {
    public static void main(String[] args) {
        boolean isEmpty = true;
        boolean isNotEmpty = !isEmpty;
        boolean isMore = 9 >= 8;
        boolean isSameWords = "Ivan".equals("Vova");
        System.out.println(isSameWords);
        int a = 20;
        int b = 12;
        if (a > b) {
            // в этот блок мы попадаем, когда условие true
            System.out.println("Мы попали в блок if");
        } else {
            // в этот блок мы попадаем, когда условие false
            System.out.println();
        }
        int age = 70;
        // для людей 70 и старше --> "Вы разменяли 8-й десяток"
        // для всех остальных --> "Вы совсем молоды"
        if (age >= 70) {
            System.out.println("Вы разменяли 8-й десяток");
        } else {
            System.out.println("Вы совсем молоды");
        }

        String name1 = "Igor";
        String name2 = "Semen";
        if (!name1.equals(name2)){
            System.out.println("Пришли разные люди");
        } else {
            System.out.println("Оди и тот же ");
        }
        // то же самое без отрицания
        if (name1.equals(name2)) {
            System.out.println("Оди и тот же ");
        } else {
            System.out.println("Пришли разные люди");
        }
        // методы
        // можем
        int result = lazyMethod(10);
        // input ---> [метод что-то делает внутри] --> output
        int result2 = hardWorkingMethod(24);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(toggleMethod(1));
        System.out.println(toggleMethod(2));
        blackHole(1278);
        blackHole(-12);
    }

    public static void blackHole(int number){
        System.out.println("Я хоть и черная дыра, но все же выводит  в консоль");
        System.out.println("Здесь могла быть ваша реклама");
        return;
    }
    public static int lazyMethod(int input){
        System.out.println("Я ленивый метод");
        return input;
    }
    public static int hardWorkingMethod(int input){
        System.out.println("Тяжело работать");
        return input + 1000;
    }

    public static int toggleMethod(int input){
        if(input == 1){
            return 1000;
        } else {
            return 10;
        }
    }





}