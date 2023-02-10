package comportamentais.chainOfResponsability.vehicles;

public abstract class Vehicle {

    protected Vehicle nextVehicle;

    public void setNextVehicle(Vehicle vehicle) {
        nextVehicle = vehicle;
    }

    public abstract void handleRequest(String request);

}
