package problems.Vechicle;

import java.util.ArrayList;

public class Main {
            public static void main(String[] args) {
                // Create an ArrayList to store vehicles
                ArrayList<Vehicle> vehicles = new ArrayList<>();

                // Add vehicles to the list
                Car car = new Car("BR01CX3222", "Four-Wheeler", 200, 234656, 264656, 9);
                vehicles.add(car);

                Bike bike = new Bike("BR31CV4564", "Two-Wheeler", 34, 85858, 3854, 6);
                vehicles.add(bike);

                Truck truck = new Truck("BR45CV4564", "Twelve-Wheeler", 4, 8588, 3854, 16);
                vehicles.add(truck);

                // Iterate through the ArrayList and print details
                for (Vehicle vehicle : vehicles) {
                    int rentalCost = vehicle.calculateRentalcost(9);
                    System.out.println("The rental cost of " + vehicle.getType() + " (" + vehicle.getVechicleNumber() + ") is ₹" + rentalCost);
                    vehicle.calculateInsurance();
                }
            }
        }






/*
Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

 */