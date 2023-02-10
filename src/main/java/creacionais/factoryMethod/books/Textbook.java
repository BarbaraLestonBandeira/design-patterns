package creacionais.factoryMethod.books;

public class Textbook implements Book {

    @Override
    public void read() {
        System.out.println("A ler um livro técnico.");
    }
}
