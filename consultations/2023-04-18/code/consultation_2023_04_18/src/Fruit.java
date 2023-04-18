public class Fruit {
    String color;
    double weight;

    Fruit(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void introduce() {
        System.out.println("Добрый день, очень приятно, фрукт");
    }

    public String toString() {
//        return "Вес: " + weight + " Цвет: " + color;
        return String.format("Вес: %f Цвет: %s", weight, color);
    }
}
