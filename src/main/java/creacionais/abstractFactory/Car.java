package creacionais.abstractFactory;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Abstract Factory: Estou a conduzir um carro!");
    }
}
