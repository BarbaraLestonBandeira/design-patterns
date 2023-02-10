package comportamentais.chainOfResponsability.atm;

public class Main {

    public static void main(String[] args) {
        FiftyHandler fiftyHandler = new FiftyHandler();
        TwentyHandler twentyHandler = new TwentyHandler();

        fiftyHandler.setNext(twentyHandler);

        fiftyHandler.handleRequest(new ATMRequest(140));
    }
}
