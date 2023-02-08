package comportamentais.command;

public class Bike implements Command {

    private Receiver receiver;

    public Bike(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.moveBike();
    }
}
