package estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class VehicleComposite implements Vehicle {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    @Override
    public void startEngine() {
        for(Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
