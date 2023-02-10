package creacionais.prototype.vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicle carPrototype = new Car();
        Vehicle car = carPrototype.clone();
        car.drive();

        Vehicle bikePrototype = new Bike();
        Vehicle bike = bikePrototype.clone();
        bike.drive();
    }
}
