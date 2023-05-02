public enum Dessert {
    PUDDING(150, 4), BROWNY(200, 5),
    CHEESECAKE(220, 5), TIRAMISU(250, 10);
    final int weight;
    final int price;
    Dessert(int weight, int price){
        this.weight = weight;
        this.price = price;
    }
    public String getName(){
        switch (this){
            case PUDDING: return "pudding";
            case BROWNY: return "browny";
            case TIRAMISU: return "teramisu";
            default: return "cheesecake";
        }
    }
}
