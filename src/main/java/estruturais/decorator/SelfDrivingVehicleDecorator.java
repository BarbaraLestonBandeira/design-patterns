package estruturais.decorator;

public class SelfDrivingVehicleDecorator extends VehicleDecorator {

    public SelfDrivingVehicleDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return vehicle.getDescription() + " com capacidade de se auto-conduzir.";
    }
}
