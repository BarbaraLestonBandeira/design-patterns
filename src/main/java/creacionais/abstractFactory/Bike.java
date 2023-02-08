package creacionais.abstractFactory;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Abstract Factory: Estou a conduzir uma bicicleta!");
    }
}
