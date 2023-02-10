package comportamentais.visitor;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private List<Book> books;

    public BookStore(){
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public double calculatePrice() {
        PriceVisitor priceVisitor = new PriceVisitor();
        for(Book book: books) {
            book.accept(priceVisitor);
        }
        return priceVisitor.getTotalPrice();
    }
}
