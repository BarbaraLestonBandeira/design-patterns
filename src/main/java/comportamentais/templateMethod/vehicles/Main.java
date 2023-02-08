package comportamentais.templateMethod.vehicles;

public class Main {

    public static void main(String[] args) {
        Engine gasolineEngine = new GasolineEngine();
        Transmission automaticTransmission = new AutomaticTransmission();

        Vehicle car = new Car(gasolineEngine, automaticTransmission);
        car.turnKey();

        Engine electricEngine = new ElectricEngine();
        Transmission manualTransmission = new ManualTransmission();

        Vehicle motorcycle = new Motorcycle(electricEngine, manualTransmission);
        motorcycle.turnKey();
    }
}
