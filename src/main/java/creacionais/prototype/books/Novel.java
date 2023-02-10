package creacionais.prototype.books;

public class Novel implements Book {

    @Override
    public void read() {
        System.out.println("A ler um romance.");
    }

    @Override
    public Book clone() {
        return new Novel();
    }
}
