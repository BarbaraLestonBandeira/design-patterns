package comportamentais.mediator;

import java.util.ArrayList;
import java.util.List;

public class BookDistributor implements Mediator {

    private List<Book> books;

    BookDistributor() {
        books = new ArrayList<>();
    }

    @Override
    public void registerBook(Book book) {
        books.add(book);
    }

    @Override
    public void distributeBook(Book book, String recipient) {

        for(Book b : books) {
            if(b.getTitle().equals(book.getTitle())) {
                System.out.println("A distribuir " + book.getTitle() + "para " + recipient);
                books.remove(b);
                break;
            }
        }

    }
}
