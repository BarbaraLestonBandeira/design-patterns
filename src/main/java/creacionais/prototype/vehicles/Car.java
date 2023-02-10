package creacionais.prototype.vehicles;

public class Car implements Vehicle {

    @Override
    public Vehicle clone() {
        try {
            return (Car) super.clone();
        }
        catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void drive() {
        System.out.println("Protype: Estou a conduzir um carro!");
    }
}
