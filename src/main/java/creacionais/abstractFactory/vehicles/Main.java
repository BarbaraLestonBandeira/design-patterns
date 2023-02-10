package creacionais.abstractFactory.vehicles;

public class Main {

    public static void main(String[] args) {
        VehicleFactory factoryCar = new CarFactory();
        Vehicle car = factoryCar.createVehicle();
        car.drive();

        VehicleFactory factoryBike = new BikeFactory();
        Vehicle bike = factoryBike.createVehicle();
        bike.drive();
    }
}