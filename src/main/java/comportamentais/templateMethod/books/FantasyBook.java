package comportamentais.templateMethod.books;

public class FantasyBook extends Book {

    private String author;
    private String title;

    public FantasyBook(String author, String title) {
        super(author, title);
    }

    @Override
    String getGenre() {
        return "Fantasia";
    }
}
