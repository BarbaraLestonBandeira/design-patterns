package comportamentais.mediator;

public interface Mediator {

    void registerBook(Book book);
    void distributeBook(Book book, String recipient);

}
