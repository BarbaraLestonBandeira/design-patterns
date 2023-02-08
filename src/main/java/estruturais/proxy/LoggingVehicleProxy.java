package estruturais.proxy;

public class LoggingVehicleProxy implements Vehicle {

    private final Vehicle vehicle;

    public LoggingVehicleProxy(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String getDescription() {
        System.out.println("Log: A recuperar a descrição do objecto da classe " + vehicle.getClass().getSimpleName());
        return vehicle.getDescription();
    }
}
