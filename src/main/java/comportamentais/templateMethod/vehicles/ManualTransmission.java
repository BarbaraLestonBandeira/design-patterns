package comportamentais.templateMethod.vehicles;

public class ManualTransmission implements Transmission {

    @Override
    public void shift(Gear gear) {
        System.out.println("Shifting to " + gear + " gear.");
    }
}
