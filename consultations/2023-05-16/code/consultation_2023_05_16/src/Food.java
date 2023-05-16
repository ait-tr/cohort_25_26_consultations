public class Food implements Comparable<Food> {
  String title;
  int fat;            // сколько жиров на 100 грамм
  int carbonhydrates; // углеводы
  int proteins;       // протеины

  public Food(String title, int fat, int carbonhydrates, int proteins) {
    this.title = title;
    this.fat = fat;
    this.carbonhydrates = carbonhydrates;
    this.proteins = proteins;
  }

  @Override
  public String toString() {
    return "Food{" +
        "title='" + title + '\'' +
        ", fat=" + fat +
        ", carbonhydrates=" + carbonhydrates +
        ", proteins=" + proteins +
        '}';
  }

  @Override
  public int compareTo(Food o) {
    // у Double и других есть метод для сравнения
    return Integer.compare(this.fat, o.fat);
  }
}
