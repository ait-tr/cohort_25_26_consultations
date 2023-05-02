public class Main {
    public static void main(String[] args) {
        // три размера для кофе: small, medium, big
        // стоимость кофе: 3, 4, 6
        int priceOfFirst = CoffeeSize.SMALL.price;
        System.out.println(CoffeeSize.SMALL.price);
        int priceOfBigOrder = CoffeeSize.BIG.price * 2
                + CoffeeSize.MEDIUM.price;
        String result = sumOfOrder(CoffeeSize.BIG, 100);
        System.out.println(result);
        int x = 10;
        x = 156;
        final int y = 20;
        // y = 239; //
        CoffeeSize obj1 = CoffeeSize.BIG;
        CoffeeSize obj2 = CoffeeSize.SMALL;
        System.out.println(obj1.getFullEngName());
        System.out.println(obj2.getFullEngName());
        System.out.println(obj1.getFullRusName());
        System.out.println(obj2.getFullRusName());
        System.out.println(obj1.price);
        System.out.println(obj2.price);
        System.out.println(obj1.getPrice());
        System.out.println(obj2.getPrice());

        System.out.println(sumOfDesserts(Dessert.CHEESECAKE, 3));
    }
    // Добрый день, клиент! Ваш заказ стоит <сумма заказа>
    // пусть принимает позицию товарную и количество, сколько мы хотим
    // например 5 больших кружек капучино
    // sumOfOrder
    public static String sumOfOrder(CoffeeSize size, int numberOfCups){
        return "Добрый день, клиент! Ваш заказ стоит " +
                size.price * numberOfCups + " Состав заказа: "
                + size.getFullRusName() + " в количестве " + numberOfCups;
    }
    public static String sumOfDesserts(Dessert dessert, int number){
        return "Вы заказали " + dessert.getName() +  " Стоимость заказа: " + number * dessert.price
                + " Вес заказа: " + dessert.weight * number;
    }
}