package estruturais.composite;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("A ligar o motor do carro!");
    }
}
