public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {5, 7, 10, 14, 2};
        // можем ли мы изменить, увеличить каждое значение на 10
        // Вариант 1, вручную
        myNumbers[0] = myNumbers[0] + 10; // массив изменился - мы мутировали массив
        myNumbers[1] += 10;
        myNumbers[2] += 10;
        myNumbers[3] += 10;
        myNumbers[4] += 10;

        for (int i = 0; i < myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }
        // Вариант 2, уже не вручную
        for (int i = 0; i < myNumbers.length; i++){
            myNumbers[i] += 10;
        }
        // Вариант 3, все то же самое но при помощи метода
        addTenToEach(myNumbers);
        printElements(myNumbers);
        System.out.println("*****");

        int[] arr3 = new int[]{6, 9, 12};
        int[] arr4 = copyFirstTwoElements(arr3);
        System.out.println("*** Старый массив после использования метода **");
        printElements(arr3); // распечатаем старый массив, убедимся, что он не изменился
        System.out.println("*** Новый массив - который мы получили в результате вызова метода **");
        printElements(arr4);
        printElements(copyFirstTwoElements(arr3)); // можем распечать не сохраняя в переменную

        System.out.println("Ссылочные типы и примитивные");
        // примитивные типы
        int x = 9;
        int y = x;
        x = 10; // изменится ли y
        System.out.println(y);
        // ссылочные типы
        String[] arr5 = {"Ivan", "Boris", "Semeon"};
        String[] arr6 = arr5;
        arr5[0] = "Неожиданно";
        System.out.println(arr6[0]); // !!! arr6 изменилось
    }
    // метод, который принимает массив
    // копирует первые два элемента и возвращает новый массив
    // метод не должен менять исходный массив
    public static int[] copyFirstTwoElements(int[] arr){
        int[] newArr = new int[2]; // создали новый массив из двух элементов
        // Вариант 1 вручную
//        newArr[0] = arr[0];
//        newArr[1] = arr[1];
        for(int i =0; i < newArr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static void addTenToEach(int [] array){
        for (int i = 0; i < array.length; i++){
            array[i] += 10;
        }
    }
    public static void printElements(int[] array){
        for (int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}