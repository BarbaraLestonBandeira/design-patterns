package estruturais.bridge;

public class Suv extends Car {

    @Override
    void buildFrame() {
        System.out.println("A construir a frame da SUV!");
    }

    @Override
    void addWheels() {
        System.out.println("A adicionar as rodas à SUV!");
    }
}
