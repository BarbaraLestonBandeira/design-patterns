package comportamentais.memento;

public class Main {

    public static void main(String[] args) {

        //criação de um livro
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("State: " + book.getState());

        //alteração do estado inicial do livro
        book.setState("O livro está em excelente estado!");
        System.out.println("Estado: " + book.getState());

        //gravar o estado inicial num Memenro
        Book.BookMemento bookMemento = book.saveStateToMemento();

        //alterar o estado inicial do livro
        book.setState("O livro está usado e em boas condições.");
        System.out.println("Estado: " + book.getState());

        //recuperar o estado inicial do livro a partir do Memento
        book.getStateFromMemento(bookMemento);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("State: " + book.getState());

    }
}
