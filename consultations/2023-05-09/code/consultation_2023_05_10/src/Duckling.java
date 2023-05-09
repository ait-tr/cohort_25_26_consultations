public class Duckling extends Duck{
  public Duckling(int age, String name, double weight, double speedOfFlight) {
    super(age, name, weight, speedOfFlight);
  }
  @Override
  public void say(){
    System.out.println("Утенок у телефона");
  }
}
