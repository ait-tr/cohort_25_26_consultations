public class Animal {
  private int age;
  private String name;
  private double weight;

  private static int numberOfAnimal;

  public int getNumberOfAnimal(){
    return numberOfAnimal;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void say(){
    System.out.println("Voice");
  }
  public Animal(int age, String name, double weight) {
    this.age = age;
    this.name = name;
    this.weight = weight;
    numberOfAnimal++;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "age=" + age +
        ", name='" + name + '\'' +
        ", weight=" + weight +
        '}';
  }
}
