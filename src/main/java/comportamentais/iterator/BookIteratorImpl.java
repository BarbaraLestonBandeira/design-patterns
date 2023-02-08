package comportamentais.iterator;

import java.util.List;

public class BookIteratorImpl implements BookIterator {

    private List<Book> books;
    private int index;

    public BookIteratorImpl(List<Book> books) {
        this.books = books;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        return books.get(index++);
    }
}
