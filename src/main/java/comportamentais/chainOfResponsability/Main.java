package comportamentais.chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        Bus bus = new Bus();
        Helicopter helicopter = new Helicopter();

        car.setNextVehicle(bus);

        car.handleRequest("Car");
        car.handleRequest("Bus");

        car.setNextVehicle(bike);

        car.handleRequest("Bike");
        car.handleRequest("Helicopter");

    }
}
