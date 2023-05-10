public class Main {

    // создать классы , содержащие методы для подсчета площади прямоугольника,
    // квадрата и круга. Пусть кроме результат должно выводиться также название соответствующей фигуры.
    // Создать массив из нескольких таких обьектов и вывести его на экран

    public static void main(String[] args) {

        Shape circle = new Circle("Circle", 10);
        Shape square = new Square("Square",7);
        Shape rectangle = new Rectangle("Rectangle",5,10);
       // Shape shape = new Shape()

       Shape[] shapes = {circle,rectangle,square};
       Circle circle1 = new Circle("Circle1",10);
      // circle1.


       for(Shape shape: shapes){
           System.out.println(shape.getDisplayName() + " has area of "+shape.getArea());

       }
        circle.foo();
    }
}
