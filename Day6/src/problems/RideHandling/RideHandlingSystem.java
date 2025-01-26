package problems.RideHandling;

public class RideHandlingSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Nishant", 15);
        Vehicle bike = new Bike("B002", "Saurb", 8);
        Vehicle auto = new Auto("A003", "Pankaj", 10);

        // Updating GPS locations
        ((GPS) car).updateLocation("Piplani");
        ((GPS) bike).updateLocation("Indrapuri");
        ((GPS) auto).updateLocation("MpNagar");

        RideManager rideManager = new RideManager();

        System.out.println("Processing Car Ride:");
        rideManager.processRide(car, 10);

        System.out.println("\nProcessing Bike Ride:");
        rideManager.processRide(bike, 15);

        System.out.println("\nProcessing Auto Ride:");
        rideManager.processRide(auto, 12);
    }
}
