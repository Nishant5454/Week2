package problems.OnlineFoodDelivery;

class OrderProcessor {
    public void processOrder(FoodItem foodItem) {
        System.out.println(foodItem.getItemDetails());
        double totalPrice = foodItem.calculateTotalPrice();

        if (foodItem instanceof Discountable) {
            Discountable discountable = (Discountable) foodItem;
            System.out.println(discountable.getDiscountDetails());
            totalPrice = discountable.applyDiscount(totalPrice);
        }

        System.out.println("Final Price: " + totalPrice);
    }
}