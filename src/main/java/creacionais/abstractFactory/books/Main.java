package creacionais.abstractFactory.books;

public class Main {
    public static void main(String[] args) {
        BookFactory hardcoverBookFactory = new HardcoverBookFactory();
        Book hardcoverBook = hardcoverBookFactory.createBook();
        hardcoverBook.read();

        BookFactory softcoverBookFactory = new SoftcoverBookFactory();
        Book softcoverBook = softcoverBookFactory.createBook();
        softcoverBook.read();
    }
}
