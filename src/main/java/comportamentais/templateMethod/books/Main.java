package comportamentais.templateMethod.books;

public class Main {

    public static void main(String[] args) {
        Book mysteryBook = new MysteryBook("Agatha Christie",
                "Murder on the Orient Express");
        Book fantasyBook = new FantasyBook("J.R.R. Tolkien",
                "The Lord of The Rings");

        mysteryBook.print();
        System.out.println();
        fantasyBook.print();
    }
}
