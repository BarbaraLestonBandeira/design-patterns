package creacionais.factoryMethod.vehicles;

public class Main {
    public static void main(String[] args) {
        VehicleFactory bike2factory = new BikeFactory();
        Vehicle bike2 = bike2factory.createVehicle();
        bike2.drive();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();

    }
}
