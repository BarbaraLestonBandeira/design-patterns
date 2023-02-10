package comportamentais.visitor;

public class Main {

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        bookStore.addBook(new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99));
        bookStore.addBook(new NonFictionBook("Introduction to Algorithms", "Thomas H. Cormen", 40.99));
        bookStore.addBook(new FictionBook("Pride and Prejudice", "Jane Austen", 12.99));

        System.out.println("Preço total: " + bookStore.calculatePrice());;
    }
}
