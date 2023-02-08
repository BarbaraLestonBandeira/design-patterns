package comportamentais.templateMethod.vehicles;

public class AutomaticTransmission implements Transmission {

    @Override
    public void shift(Gear gear) {
        System.out.println("Shifting to " + gear + " gear.");
    }
}
