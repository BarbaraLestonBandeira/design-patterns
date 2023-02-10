package creacionais.factoryMethod.books;

public class TextBookFactory extends BookFactory {

    @Override
    Book createBook() {
        return new Textbook();
    }
}
