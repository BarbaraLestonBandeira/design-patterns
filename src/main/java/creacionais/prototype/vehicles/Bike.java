package creacionais.prototype.vehicles;

public class Bike implements Vehicle {

    @Override
    public Vehicle clone() {
        try {
            return (Bike) super.clone();
        }
        catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void drive() {
        System.out.println("Protype: Estou a conduzir uma bicicleta!");
    }
}
