package estruturais.adapter;

public class Main {

    public static void main(String[] args) {
        LegacyVehicle legacyVehicle = new LegacyVehicle();

        Vehicle vehicle = new VehicleAdapter(legacyVehicle);

        vehicle.drive();
    }
}
