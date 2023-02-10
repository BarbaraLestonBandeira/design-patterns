package creacionais.prototype.books;

public class Main {

    public static void main(String[] args) {
        BookStore bookStore = new BookStore(
                new Novel(),
                new TextBook()
        );

        Book novel = bookStore.createNovel();
        novel.read();

        Book textBook = bookStore.createTextBook();
        textBook.read();
    }
}
