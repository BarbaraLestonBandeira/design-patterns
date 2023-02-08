package comportamentais.iterator;

import java.util.List;

public class BookCollectionImpl implements BookCollection {

    private List<Book> books;

    public BookCollectionImpl(List<Book> books) {
        this.books = books;
    }

    @Override
    public BookIterator iterator() {
        return new BookIteratorImpl(books);
    }
}
