package comportamentais.state;

public class Available implements BookState {

    @Override
    public void borrowBook(Book book) {
        System.out.println("Livro emprestado.");
        book.setState(new Borrowed());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("O livro está novamente disponível.");
    }
}
