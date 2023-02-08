package comportamentais.visitor;

public class FictionBook extends Book {

    private String name;
    private double price;

    public FictionBook(String name, double price) {
        super(name, price);
        this.name = name;
        this.price = price;
    }

    @Override
    public void accept(BookVisitor visitor) {
        visitor.visit(this);
    }
}
