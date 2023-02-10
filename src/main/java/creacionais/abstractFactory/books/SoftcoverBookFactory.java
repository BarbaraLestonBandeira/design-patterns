package creacionais.abstractFactory.books;

public class SoftcoverBookFactory implements BookFactory {

    @Override
    public Book createBook() {
        return new TextBook();
    }
}
