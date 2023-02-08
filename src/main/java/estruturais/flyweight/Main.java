package estruturais.flyweight;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car1 = factory.getVehicle("car1");
        Vehicle car2 = factory.getVehicle("car2");
        Vehicle car3 = factory.getVehicle("car2");

        Vehicle bike1 = factory.getVehicle("bike1");

        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());
        System.out.println(car3.getDescription());

        System.out.println(bike1.getDescription());
    }
}
