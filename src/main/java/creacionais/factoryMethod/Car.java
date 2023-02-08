package creacionais.factoryMethod;

public class Car implements Vehicle {

    @Override
    public void drive() {

        System.out.println("Factory Method: " +
                "Estou a conduzir um carro!");
    }
}
