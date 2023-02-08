package estruturais.bridge;

public class Main {

    public static void main(String[] args) {
        Bike mountainBike = new MountainBike();
        Bike racingBike = new RacingBike();

        Car sedan = new Sedan();
        Car suv = new Suv();

        mountainBike.buildFrame();
        mountainBike.addWheels();
        mountainBike.drive();

        racingBike.buildFrame();
        racingBike.addWheels();
        racingBike.drive();

        sedan.buildFrame();
        sedan.addWheels();
        sedan.drive();

        suv.buildFrame();
        suv.addWheels();
        suv.drive();
    }
}
