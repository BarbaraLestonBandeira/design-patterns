package estruturais.decorator;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println("Veículo 1: " + car.getDescription());

        car = new ElectricVehicleDecorator(car);
        System.out.println("Veículo 2: " + car.getDescription());

        car = new ElectricVehicleDecorator(car);
        System.out.println("Veículo 3: " + car.getDescription());

        Vehicle bike = new Bike();
        System.out.println("Veículo 4: " + bike.getDescription());

        bike = new ElectricVehicleDecorator(bike);
        System.out.println("Veículo 5: " + bike.getDescription());

    }
}
