package estruturais.bridge;

public class MountainBike extends Bike {

    @Override
    void buildFrame() {
        System.out.println("A preparar a frame da bicicleta de montanha!");
    }

    @Override
    void addWheels() {
        System.out.println("A acrescentar as rodas da bicicleta de montanha!");
    }

    public void drive() {
        System.out.println("Bridge: Estou a conduzir uma bicicleta!");

    }
}
