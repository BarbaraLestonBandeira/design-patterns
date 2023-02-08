package estruturais.facade;

public class VehicleFacade {

    private Car car = new Car();
    private Bike bike = new Bike();

    String getVehicleDescription() {
        return car.getDescription() + " and " + bike.getDescription();
    }

}
