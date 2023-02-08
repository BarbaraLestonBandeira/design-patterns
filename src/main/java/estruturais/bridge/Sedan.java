package estruturais.bridge;

public class Sedan extends Car {

    @Override
    void buildFrame() {
        System.out.println("A construir a frame do Sedan!");
    }

    @Override
    void addWheels() {
        System.out.println("A adicionar as rodas ao Sedan!");
    }
}
