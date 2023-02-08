package comportamentais.visitor;

public class BookDisplayVisitor implements BookVisitor {
    @Override
    public void visit(FictionBook fictionBook) {
        System.out.println("Displaying Fiction book: " + fictionBook.getName());
    }

    @Override
    public void visit(NonFictionBook nonFictionBook) {
        System.out.println("Displaying Non-Fiction Book: " + nonFictionBook.getName());
    }
}
