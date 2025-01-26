package problems.RideHandling;

class RideManager {
    public void processRide(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        double fare = vehicle.calculateFare(distance);

        if (vehicle instanceof GPS) {
            GPS gps = (GPS) vehicle;
            System.out.println(gps.getCurrentLocation());
        }

        System.out.println("Total Fare: " + fare);
    }
}
