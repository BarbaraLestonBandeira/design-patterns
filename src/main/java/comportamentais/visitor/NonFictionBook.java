package comportamentais.visitor;

public class NonFictionBook extends Book {

    private String name;
    private double price;

    public NonFictionBook(String name, double price) {
        super(name, price);
        this.name = name;
        this.price = price;
    }
    @Override
    public void accept(BookVisitor visitor) {
        visitor.visit(this);
    }
}
