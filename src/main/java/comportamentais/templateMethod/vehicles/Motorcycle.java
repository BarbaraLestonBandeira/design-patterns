package comportamentais.templateMethod.vehicles;

public class Motorcycle extends Vehicle {

    private Engine engine;
    private Transmission transmission;

    public Motorcycle(Engine engine, Transmission transmission) {
        super(engine, transmission);
        this.engine = engine;
        this.transmission = transmission;
    }
    @Override
    public void start() {
        engine.startEngine();
    }

    @Override
    public void stop() {
        engine.stopEngine();
    }
}
