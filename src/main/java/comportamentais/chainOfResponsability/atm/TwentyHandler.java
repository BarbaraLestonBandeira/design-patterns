package comportamentais.chainOfResponsability.atm;

public class TwentyHandler implements ATMRequestHandler {

    private ATMRequestHandler next;

    @Override
    public void handleRequest(ATMRequest request) {
        if (request.getAmount() >= 20) {
            int numNotes = request.getAmount() / 20;
            System.out.println(numNotes + " notas de 20€ levantadas");
            int remainder = request.getAmount() % 20;
            if (remainder != 0 && next != null) {
                next.handleRequest(new ATMRequest(remainder));
            }
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("Não é possível levantar a quantia pretendida.");
            }
        }
    }

    public void setNext(ATMRequestHandler next) {
        this.next = next;
    }

}
