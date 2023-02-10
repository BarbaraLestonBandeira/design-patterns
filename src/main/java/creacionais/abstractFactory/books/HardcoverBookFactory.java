package creacionais.abstractFactory.books;

public class HardcoverBookFactory implements BookFactory {

    @Override
    public Book createBook() {
        return new Novel();
    }
}
