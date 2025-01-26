package problems.OnlineFoodDelivery;

class VegItem extends FoodItem implements Discountable {
    private static final double DISCOUNT_RATE = 0.2; // 10% discount

    public VegItem(String itemName, double price, int quantity) {
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
        return "VegItem discount: 20%";
    }
}