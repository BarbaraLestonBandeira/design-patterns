package estruturais.decorator;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println("Veiculo 1: " + car.getDescription());

        car = new ElectricVehicleDecorator(car);
        System.out.println("Veiculo 2: " + car.getDescription());

        car = new ElectricVehicleDecorator(car);
        System.out.println("Veiculo 3: " + car.getDescription());

        Vehicle bike = new Bike();
        System.out.println("Veiculo 4: " + bike.getDescription());

        bike = new ElectricVehicleDecorator(bike);
        System.out.println("Veiculo 5: " + bike.getDescription());

    }
}
