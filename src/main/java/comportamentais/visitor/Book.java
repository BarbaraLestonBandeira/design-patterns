package comportamentais.visitor;

public abstract class Book {

    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void accept(BookVisitor visitor);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
