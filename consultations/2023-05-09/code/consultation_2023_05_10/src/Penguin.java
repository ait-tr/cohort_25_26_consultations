public class Penguin extends Animal {
  private double speedInWater;
  private double speedOnGround;
  public Penguin(int age, String name, double weight,
                 double speedInWater, double speedOnGround) {
    super(age, name, weight);
    this.speedInWater = speedInWater;
    this.speedOnGround = speedOnGround;
  }
  @Override
  public void say(){
    System.out.println("Pi-pi-pi");
  }
  public void print(){
    System.out.println("Метод принт версия 1");
  }
  public int print(int number){
    System.out.println("Метод принт версия 2");
    return 10;
  }


  @Override
  public String toString() {
    return "Penguin{" +
        "speedOnGround=" + speedOnGround +
        ", age=" + getAge() +
        ", name=" + getName()+
        ", speedInWater"+speedInWater +
        "} ";
  }
}
