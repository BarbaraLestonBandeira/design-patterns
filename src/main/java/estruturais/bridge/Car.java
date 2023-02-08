package estruturais.bridge;

import estruturais.adapter.Vehicle;

public abstract class Car implements Vehicle {

    abstract void buildFrame();
    abstract void addWheels();

    public void drive() {
        System.out.println("Bridge: Estou a conduzir um carro!");
    }
}
