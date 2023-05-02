// три размера для кофе: small, medium, big
// стоимость кофе: 3, 4, 6
enum CoffeeSize {
    SMALL(3), MEDIUM(4), BIG(6);
    final int price;
    CoffeeSize(int price) {
        this.price = price;
    }
    // "big coffee" | "medium coffee" | "small coffee"
    public int getPrice(){
        return price; //         return this.price;
    }
    public String getFullEngName() {
        if (this == CoffeeSize.SMALL) {
            return "small coffee";
        } else if (this == CoffeeSize.MEDIUM) {
            return "medium coffee";
        } else {
            return "big coffee";
        }
    }

    public String getFullRusName() {
        switch (this) {
            case SMALL:
                return "маленький капучино";
            case BIG:
                return "большой капучино";
            default:
                return "средний капучино";
        }
    }
}