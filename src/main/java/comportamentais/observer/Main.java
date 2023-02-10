package comportamentais.observer;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("O Grande Gatsby",
                "F. Scott Fitzgerald");
        Book book2 = new Book("Game of Thrones", "George R.R. Martin");

        System.out.println("Antes da alteração: \n" + book1);

        Library biblioteca = new Library();

        book1.notifyObservers();
        //book1.addObserver(biblioteca);
        //book1.setTitle("Orgulho e Preconceito");
        System.out.println("Depois da alteração: \n" + book1);
    }
}
