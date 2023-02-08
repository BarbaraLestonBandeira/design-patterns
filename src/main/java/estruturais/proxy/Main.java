package estruturais.proxy;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car("modelo1");

        Vehicle proxyCar = new LoggingVehicleProxy(car);

        System.out.println(proxyCar.getDescription());
    }
}
