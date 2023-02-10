package comportamentais.chainOfResponsability.atm;

public class ATMRequest {

    private final int amount;

    public ATMRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
