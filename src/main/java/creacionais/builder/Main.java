package creacionais.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setMake("Audi")
                .setModel("")
                .setYear(1998)
                .setColor("Vermelho")
                .build();

        System.out.println(car);
    }
}
