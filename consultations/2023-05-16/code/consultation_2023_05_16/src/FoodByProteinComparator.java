import java.util.Comparator;

public class FoodByProteinComparator implements Comparator<Food> {
  @Override
  public int compare(Food o1, Food o2) {
    return Integer.compare(o1.proteins, o2.proteins);
  }
}
