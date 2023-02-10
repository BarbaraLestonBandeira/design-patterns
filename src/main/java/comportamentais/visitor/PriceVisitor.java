package comportamentais.visitor;

public class PriceVisitor implements BookVisitor {

    private double totalPrice;

    public PriceVisitor() {
        totalPrice = 0;
    }

    @Override
    public void visit(FictionBook fictionBook) {
        totalPrice += fictionBook.getPrice();
    }

    @Override
    public void visit(NonFictionBook nonFictionBook) {
        totalPrice += nonFictionBook.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
