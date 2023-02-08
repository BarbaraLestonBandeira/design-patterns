package comportamentais.visitor;

public interface BookVisitor {

    void visit(FictionBook fictionBook);
    void visit(NonFictionBook nonFictionBook);

}
