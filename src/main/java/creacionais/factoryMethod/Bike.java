package creacionais.factoryMethod;

public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Factory Method: Estou a conduzir uma bicicleta!");
    }
}
