public class Main {
    public static void main(String[] args) {
        String youngestChild;       // declare    - объявили переменную - тип и имя
        youngestChild = "Ivan";     // initialize - присвоили первичное значение
        youngestChild = "Simon";    // перезаписываем значение на другое
//        System.out.println(youngestChild); // Simon
        youngestChild = "Katya";
//        System.out.println(youngestChild); // Katya
        // String youngestChild = "Ira"; - нельзя заново объявить существующую переменную
        int a = 10;
        int b = 12;
        int c = a + b;
        int sum = a + c;
        //
        String example = "I am example";
        System.out.println(example.charAt(2)); // a
        System.out.println(example.length());  // 12
        // то есть индекс последнего символа = длинна - 1
        int index = example.length() - 1;
        char lastSymbol = example.charAt(index);
        System.out.println(lastSymbol);
    }
}