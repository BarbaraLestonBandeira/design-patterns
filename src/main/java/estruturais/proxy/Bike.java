package estruturais.proxy;

public class Bike implements Vehicle {

    private final String model;

    public Bike(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "Uma bicicleta, modelo: " + model;
    }
}
