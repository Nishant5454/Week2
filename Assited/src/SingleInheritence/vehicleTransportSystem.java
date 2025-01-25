class Vehicle{
    String maxSpeed;
    String fuelType;
    Vehicle(String maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public void displayInfo(){
       // System.out.println("Vehicle");
        System.out.println("maxSpeed is "+this.maxSpeed);
        System.out.println("fuelType is "+this.fuelType);
    }
}
class Car extends Vehicle{
    String brand_name;
    Car(String maxSpeed,String fuelType,String brand_name){
        super(maxSpeed,fuelType);
        this.brand_name=brand_name;
    } @Override
    public void displayInfo(){
        System.out.println("Car Details :");
        System.out.println(this.brand_name);
        super.displayInfo();


    }

}
class Truck extends Vehicle{
    String wheels;
    Truck(String maxSpeed,String fuelType,String wheels){
        super(maxSpeed,fuelType);
        this.wheels=wheels;
    }@Override
    public void displayInfo(){
        System.out.println("Truck Details are: ");
        super.displayInfo();
        System.out.println("No of Wheels is "+this.wheels);
    }
}
class Motorcycle extends Vehicle {
    String cc;

    Motorcycle(String maxSpeed, String fuelType, String cc) {
        super(maxSpeed, fuelType);
        this.cc = cc;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Details are: ");
        super.displayInfo();
        System.out.println("No of cc is " + this.cc);
    }
}
public class vehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("150kmp/h", "Diesel", "Kia Seltos");
        Vehicle Truck = new Truck("70kmp/h", "Petrol", "12");
        Vehicle Motorcycle = new Motorcycle("90kmp/h", "Diesel", "150");
        Vehicle[] vt = {car, Truck, Motorcycle};
        for(Vehicle vp:vt){
            vp.displayInfo();
        }

    }
}
/*
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.

 */