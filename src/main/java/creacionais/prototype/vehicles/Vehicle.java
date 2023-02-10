package creacionais.prototype.vehicles;

public interface Vehicle extends Cloneable {

    Vehicle clone();
    void drive();
}
