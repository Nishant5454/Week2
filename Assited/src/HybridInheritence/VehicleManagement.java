
/*
Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:



Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
*/
package HybridInheritence;



//Define a superclass Vehicle with attributes like maxSpeed and model.
class Vehicle{
    int maxSpeed;
    String model;
}
//Create an interface Refuelable with a method refuel().
interface Refuelable{
    void refuel();
}

//Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
class PetrolVehicle implements Refuelable {
    @Override
    public void refuel() {
        System.out.println("Refuels");
    }
}
class ElectricVehicle extends Vehicle{
    void charge(){
        System.out.println("Charging");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        PetrolVehicle p = new PetrolVehicle();
        p.refuel();
        ElectricVehicle e = new ElectricVehicle();
        e.charge();
    }
}
