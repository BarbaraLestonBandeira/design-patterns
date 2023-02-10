package creacionais.factoryMethod.vehicles;

public class BikeFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Bike();
    }
}
