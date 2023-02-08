package comportamentais.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Livro 1"));
        books.add(new Book("Livro 2"));
        books.add(new Book("Livro 3"));

        BookCollection collection = new BookCollectionImpl(books);

        BookIterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
    }
}
