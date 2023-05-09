public class Duck extends Animal{
  double speedOfFlight;
  public Duck(int age, String name, double weight, double speedOfFlight) {
    super(age, name, weight);
    this.speedOfFlight = speedOfFlight;
  }
  @Override
  public void say(){
    System.out.println("Quack-quack-quack " + getName());
    System.out.println("Всего животных: " + getNumberOfAnimal());
  }
}
