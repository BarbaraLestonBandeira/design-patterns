package comportamentais.command;

public class Car implements Command {

    private Receiver receiver;

    public Car(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.moveCar();
    }
}
