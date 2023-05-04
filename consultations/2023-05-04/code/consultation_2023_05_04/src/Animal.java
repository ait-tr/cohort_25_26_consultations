public class Animal {
  private String breed;
  private String name;
  private int age;

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }

  public Animal(String breed, String name, int age) {
    this.breed = breed;
    this.name = name;
    this.age = age;
  }
  public Animal(){}

  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", breed='" + breed + '\'' +
        ", age=" + age +
        '}';
  }
}
