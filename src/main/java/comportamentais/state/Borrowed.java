package comportamentais.state;

public class Borrowed implements BookState {

    @Override
    public void borrowBook(Book book) {
        System.out.println("O livro já foi emprestado.");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Livro devolvido.");
        book.setState(new Available());
    }
}
