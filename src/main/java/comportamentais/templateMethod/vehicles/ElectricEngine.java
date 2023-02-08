package comportamentais.templateMethod.vehicles;

public class ElectricEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping electric engine.");
    }
}
