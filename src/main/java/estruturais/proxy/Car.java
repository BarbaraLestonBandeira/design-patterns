package estruturais.proxy;

public class Car implements Vehicle {

    private final String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "Um carro, modelo: " + model;
    }
}
