package comportamentais.observer;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("O Grande Gatsby",
                "F. Scott Fitzgerald");

        System.out.println("Antes da alteração: \n" + book);

        Library biblioteca = new Library();

        book.addObserver(biblioteca);
        book.setTitle("Orgulho e Preconceito");
        System.out.println("Depois da alteração: \n" + book);
    }
}
