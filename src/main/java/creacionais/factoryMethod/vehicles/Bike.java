package creacionais.factoryMethod.vehicles;

public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Factory Method: Estou a conduzir uma bicicleta!");
    }
}
