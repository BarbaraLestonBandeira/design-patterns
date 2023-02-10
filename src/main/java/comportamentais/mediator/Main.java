package comportamentais.mediator;

public class Main {

    public static void main(String[] args) {
        Mediator bookDistributor = new BookDistributor();
        Book livro1 = new Book("O Grande Gatsby ", bookDistributor);
        Book livro2 = new Book("A Guerra dos Tronos ", bookDistributor);

        bookDistributor.distributeBook(livro1, "João Silva");
        bookDistributor.distributeBook(livro2, "Joana Silva");
    }
}
