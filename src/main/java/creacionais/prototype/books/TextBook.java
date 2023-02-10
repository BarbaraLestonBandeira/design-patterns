package creacionais.prototype.books;

public class TextBook implements Book {

    @Override
    public void read() {
        System.out.println("A ler um livro técnico.");
    }

    @Override
    public Book clone() {
       return new TextBook();
    }
}
