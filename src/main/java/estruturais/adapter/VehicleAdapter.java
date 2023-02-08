package estruturais.adapter;

public class VehicleAdapter implements Vehicle {

    private LegacyVehicle legacyVehicle;

    public VehicleAdapter(LegacyVehicle legacyVehicle) {
        this.legacyVehicle = legacyVehicle;
    }

    @Override
    public void drive() {
        legacyVehicle.moveForward();
    }
}
