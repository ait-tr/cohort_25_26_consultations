public class Main {
  public static void main(String[] args) {
    String[] fruits = new String[]{
        "apple",  "kiwi", "mango", "orange"
    };
    // n
    // orange
    int x =  10;      // 0
    Integer y = 10;   // null
    boolean k = true; // false
    Boolean m = true; // null
    String str = "Anna ".trim().toLowerCase().substring(1);
    System.out.println(str);
  }
  // O(1) - константная сложность
  public static boolean orangeIsFirst(String[] fruits){
    if("orange".equals(fruits[0])){
      return true;
    }
    return false;
  }
  // линейная сложность O(n)
  public static boolean anyOrange(String[] fruits){
    for (String fruit:fruits){
      if(fruit.equals("orange")){
        return true;
      }
    }
    return false;
  }
  //
}