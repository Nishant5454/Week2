package problems.Ecommerce;
/*
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
 */
abstract class Product {
    private String productId;
    private String name;
    private int price;
    Product(String productId,String name,int price){
        this.productId=productId;
        this.name=name;
        this.price=price;

    }
    abstract public double calculateDiscount();
    interface Taxable{//Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
        public double calculateTax(int value);
        public void getTaxDetails();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
/*
Description: Develop a simplified e-commerce platform:



Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.

 */