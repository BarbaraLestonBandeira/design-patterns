package estruturais.bridge;

public class RacingBike extends Bike {

    @Override
    void buildFrame() {
        System.out.println("A construir a frame da bicicleta de corrida!");
    }

    @Override
    void addWheels() {
        System.out.println("A adicionar as rodas da bicicleta de corrida!");
    }

    public void drive() {
        System.out.println("Bridge: Estou a conduzir uma bicicleta!");

    }
}
