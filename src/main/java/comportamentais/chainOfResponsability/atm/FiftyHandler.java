package comportamentais.chainOfResponsability.atm;

public class FiftyHandler implements ATMRequestHandler {

    private ATMRequestHandler next;

    @Override
    public void handleRequest(ATMRequest request) {
        if(request.getAmount() <= 50) {
            int numNotes = request.getAmount() / 50;
            System.out.println(numNotes + " notas de 50€ levantadas.");
            int remainder = request.getAmount() % 50;
            if(remainder != 0 && next != null) {
                next.handleRequest(new ATMRequest(remainder));
            }
        }
        else {
            if(next != null) {
                next.handleRequest(request);
            }
            else {
                System.out.println("Não é possível levantar a quantia pretendida.");
            }
        }
    }

    public void setNext(ATMRequestHandler next) {
        this.next = next;
    }
}
