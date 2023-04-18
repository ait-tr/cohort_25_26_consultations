public class Mouse {
    String name;
    String color;
    Mouse(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void sayHi(){
        System.out.println("Привет. Меня зовут " + name);
    }
    public void tellColor(){
        System.out.println("Мой цвет: " + color);
    }
    public int sum(int number1, int number2){
        return number1 + number2;
    }
}
