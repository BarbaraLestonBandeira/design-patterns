package comportamentais.templateMethod.vehicles;

public class Car extends Vehicle {

    private Engine engine;
    private Transmission transmission;

    public Car(Engine engine, Transmission transmission) {
        super(engine, transmission);
        this.engine = engine;
        this.transmission = transmission;
    }
    @Override
    public void start() {
        engine.startEngine();
        transmission.shift(Gear.DRIVE);
    }

    @Override
    public void stop() {
        transmission.shift(Gear.PARK);
        engine.stopEngine();
    }
}
