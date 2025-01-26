package problems.OnlineFoodDelivery;

 class NonVegItem extends FoodItem implements Discountable {
    private static final double DISCOUNT_RATE = 0.2; // 20% discount

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice - (totalPrice * DISCOUNT_RATE);
    }

    @Override
    public String getDiscountDetails() {
        return "NonVegItem discount: 20%";
    }
}
