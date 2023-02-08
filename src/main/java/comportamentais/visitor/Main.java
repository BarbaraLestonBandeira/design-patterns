package comportamentais.visitor;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[] {
                new FictionBook("The Great Gatsby", 19.99),
                new NonFictionBook("The Origin of Species", 29.99),
                new FictionBook("Pride and Prejudice", 14.99),
                new NonFictionBook("The Structure of Scientific Revolutions", 39.99)
        };

        BookDisplayVisitor displayVisitor = new BookDisplayVisitor();
        BookPriceVisitor priceVisitor = new BookPriceVisitor();

        for (Book book : books) {
            book.accept(displayVisitor);
            book.accept(priceVisitor);
        }

        System.out.println(String.format("Preço total de livros de Ficção: $%.2f", priceVisitor.getFictionBookTotalPrice()));
        System.out.println(String.format("Preço total de livros de Não-Ficção: $%.2f", priceVisitor.getNonFictionBookTotalPrice()));
    }
}
