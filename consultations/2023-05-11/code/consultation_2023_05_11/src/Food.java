import java.util.Objects;

public class Food {
  String title;
  double calories;

  Boolean isHealthy = true;

  public Food(String title, double calories) {
    this.title = title;
    this.calories = calories;
  }

  @Override
  public String toString() {
    return "Food{" +
        "title='" + title + '\'' +
        ", calories=" + calories +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Food food = (Food) o;
    return Double.compare(food.calories, calories) == 0 && Objects.equals(title, food.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, calories);
  }
}
