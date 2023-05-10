public class Circle extends Shape{

    private double PI = 3.14;
    private double radius;

    public Circle (String displayName, double radius){
        super(displayName);
        this.radius = radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public void foo(){
        System.out.println("I am a circle");
    }
}
