package problems.OnlineFoodDelivery;

        public class Main{
            public static void main(String[] args) {
                FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
                FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1);

                OrderProcessor orderProcessor = new OrderProcessor();

                System.out.println("Processing VegItem Order:");
                orderProcessor.processOrder(vegItem);

                System.out.println("\nProcessing NonVegItem Order:");
                orderProcessor.processOrder(nonVegItem);
            }
        }
/*
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

 */
