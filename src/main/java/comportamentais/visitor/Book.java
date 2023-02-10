package comportamentais.visitor;

public interface Book {

    void accept(BookVisitor visitor);
}
