package comportamentais.visitor;

public class BookPriceVisitor implements BookVisitor {

    private double fictionBookTotalPrice;
    private double nonFictionBookTotalPrice;
    @Override
    public void visit(FictionBook fictionBook) {
        fictionBookTotalPrice += fictionBook.getPrice();
    }

    @Override
    public void visit(NonFictionBook nonFictionBook) {
        nonFictionBookTotalPrice += nonFictionBook.getPrice();
    }

    public double getFictionBookTotalPrice() {
        return fictionBookTotalPrice;
    }

    public double getNonFictionBookTotalPrice() {
        return nonFictionBookTotalPrice;
    }
}
