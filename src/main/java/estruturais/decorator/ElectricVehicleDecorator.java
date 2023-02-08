package estruturais.decorator;

public class ElectricVehicleDecorator extends VehicleDecorator {


    public ElectricVehicleDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return vehicle.getDescription() + " alimentado a electricidade.";
    }
}
