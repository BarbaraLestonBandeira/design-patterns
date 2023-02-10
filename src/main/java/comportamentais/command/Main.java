package comportamentais.command;

public class Main {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command carCommand = new Car(receiver);
        Command bikeCommand = new Bike(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(carCommand);
        invoker.executeCommand();

        invoker.setCommand(bikeCommand);
        invoker.executeCommand();
    }
}
