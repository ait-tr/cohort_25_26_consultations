import java.util.Objects;

public class Planet {
  String title;
  int numberFromSun;
  public Planet(String title, int numberFromSun) {
    this.title = title;
    this.numberFromSun = numberFromSun;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Planet planet = (Planet) o;
    return numberFromSun == planet.numberFromSun && Objects.equals(title, planet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, numberFromSun);
  }
}
