package creacionais.factoryMethod.books;

public class NovelFactory extends BookFactory {

    @Override
    Book createBook() {
        return new Novel();
    }
}
