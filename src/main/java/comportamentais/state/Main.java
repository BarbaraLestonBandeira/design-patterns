package comportamentais.state;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();

        book.borrowBook();
        book.borrowBook();
        book.returnBook();
        book.returnBook();
    }
}
