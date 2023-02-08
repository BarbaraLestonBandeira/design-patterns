package comportamentais.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("To Kill a Mockingbird",
                "Harper Lee");
        Book book2 = new Book("Pride and Prejudice",
                "Jane Austen");
        Book book3 = new Book("The Great Gatsby",
                "F. Scott Fitzgerald");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Bookshelf bookShelf = new Bookshelf(books);

        bookShelf.setBookSorter(new SortByTitle());
        bookShelf.sortBooks();
        System.out.println("Sorted by Title:");
        bookShelf.displayBooks();
        System.out.println("---");
        bookShelf.setBookSorter(new SortByAuthor());
        bookShelf.sortBooks();
        System.out.println("Sorted by Author:");
        bookShelf.displayBooks();

    }
}
