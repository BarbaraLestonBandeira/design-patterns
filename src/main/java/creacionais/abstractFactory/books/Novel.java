package creacionais.abstractFactory.books;

public class Novel implements Book {

    @Override
    public void read() {
        System.out.println("A ler um romance.");
    }
}
