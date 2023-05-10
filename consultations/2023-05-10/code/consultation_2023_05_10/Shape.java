public abstract class Shape {
    private String displayName;

    public Shape (String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
    // метод для подсчета площади фигуры
    public abstract double getArea();
//    public  double getArea(){
//        return 0;

    public void foo(){
        System.out.println("My name is Shape");
    }


    }


