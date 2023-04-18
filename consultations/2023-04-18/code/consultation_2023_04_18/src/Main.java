public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("red", 0.2);
        Fruit orange = new Fruit("yellow", 0.3);
        Fruit mango = new Fruit("green", 0.4);
        System.out.println(mango.color);
        Fruit[] fruits = {apple, orange, mango};
        // какой цвет у второго фрукта в массива?
        String colorOfSecond = fruits[1].color;
        System.out.println(colorOfSecond);
        // вывести в консоль вес каждого фрукта из массива по очереди
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].weight);
        }
        System.out.println(apple.toString());
        String text = apple.toString();
        apple.introduce();
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].toString());
        }
        System.out.println("*** Mice and Cats ***");
        Mouse jerry = new Mouse("Jerry", "grey");
        Mouse minnie = new Mouse("Minnie", "black");
        Mouse mickey = new Mouse("Mickey", "black");
        jerry.sayHi();
        jerry.tellColor();
        minnie.sayHi();
        minnie.tellColor();
        mickey.sayHi();
        mickey.tellColor();
        int sumResult = jerry.sum(12, 15);
        System.out.println(sumResult);

        System.out.println("*** мышиный массив ***");
        // создали переменную для массива
        Mouse[] mice;
        // присвоим ей значение
        // new Mouse[4] - создали пустой массив
        mice = new Mouse[4];
        // значением по умолчанию для ссылочных типов является null
        // в массиве лежит пока что четыре null
        mice[0] = new Mouse("Василий", "yellow");
        mice[1] = new Mouse("Мишка-пышка", "yellow");
        mice[2] = new Mouse("Бублик", "orange");
        mice[3] = new Mouse("Лелик", "white");
        for (int i = 0; i < mice.length; i++) {
            mice[i].sayHi();
            mice[i].tellColor();
        }
    }
}