package comportamentais.strategy;

import java.util.List;

public class Bookshelf {

    private List<Book> books;
    private BookSorter bookSorter;

    public Bookshelf(List<Book> books) {
        this.books = books;
    }

    public void setBookSorter(BookSorter bookSorter) {
        this.bookSorter = bookSorter;
    }

    public void sortBooks() {
        bookSorter.sort(books);
    }

    public void displayBooks(){
        for(Book book : books) {
            System.out.println(book.getTitle() +
                    " por " + book.getAuthor());
        }
    }
}
