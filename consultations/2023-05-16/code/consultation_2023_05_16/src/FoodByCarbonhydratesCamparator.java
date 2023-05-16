import java.util.Comparator;

public class FoodByCarbonhydratesCamparator implements Comparator<Food> {

  @Override
  public int compare(Food o1, Food o2) {
    return Integer.compare(o1.carbonhydrates, o2.carbonhydrates);
  }
}
