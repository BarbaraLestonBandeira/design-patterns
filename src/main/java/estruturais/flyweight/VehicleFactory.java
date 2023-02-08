package estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private Map<String, Vehicle> vehicles = new HashMap<>();

    public Vehicle getVehicle(String model) {
        Vehicle vehicle = vehicles.get(model);

        if(vehicle == null) {

            if(model.startsWith("car")) {
                vehicle = new Car(model);
            }
            else if(model.startsWith("bike")) {
                vehicle = new Bike(model);
            }

            vehicles.put(model, vehicle);
        }

        return vehicle;
    }
}
