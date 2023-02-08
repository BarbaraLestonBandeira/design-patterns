package comportamentais.templateMethod.vehicles;

public abstract class Vehicle {

    private Engine engine;
    private Transmission transmission;

    public Vehicle(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public abstract void start();
    public abstract void stop();

    public void turnKey() {
        start();
        stop();
    }
}
