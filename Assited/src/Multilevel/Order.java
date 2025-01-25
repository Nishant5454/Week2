package Multilevel;//package name for the classes
class InitialOrder{//super class having order_ID and order_Date
    String order_ID;
    String order_Date;
    InitialOrder(String order_ID,String order_Date){
        this.order_ID=order_ID;
        this.order_Date=order_Date;
    }
    public void getOrder_Status(){//method for getting the order status
        System.out.println("Details of Order");
        System.out.println("Order_ID is "+this.order_ID);
        System.out.println("Order Date is "+this.order_Date);
    }

}
class ShippedOrder extends InitialOrder{//subclass for ShippedOrder having trackingNumber
    String trackingNumber;
    ShippedOrder(String order_ID,String order_Date,String trackingNumber){
        super(order_ID,order_Date);
        this.trackingNumber=trackingNumber;
    }

    public void getOrder_Status(){//method for getting the order status
        super.getOrder_Status();
        System.out.println("Kindly track Your order having tracking number "+this.trackingNumber);
    }


}
class DeliveredOrder extends ShippedOrder{//subclass for DeliveredOrder having deliveryDate
    String deliveryDate;
    DeliveredOrder(String order_ID,String order_Date,String trackingNumber,String deliveryDate){//constructor for DeliveredOrder
        super(order_ID,order_Date,trackingNumber);//calling the constructor of the super class
        this.deliveryDate=deliveryDate;//initializing the instance variable
    }
    @Override
    public void getOrder_Status(){  //method for getting the order status
        super.getOrder_Status();
        System.out.println("Your order will be Delivered by "+this.deliveryDate);
    }

}

public class Order {//main class for testing the classes
    public static void main(String[] args) {//main method for testing the classes
        DeliveredOrder deliveredOrder = new DeliveredOrder("OD238383", "22 JAN 2024", "128484848", "24 JAN 2024");
        deliveredOrder.getOrder_Status();
    }
}
/*
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.

 */
