package comportamentais.templateMethod.vehicles;

public class GasolineEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Starting gasoline engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping gasoline engine");
    }
}
