package comportamentais.templateMethod.books;

public class MysteryBook extends Book {

    private String author;
    private String title;

    public MysteryBook(String author, String title) {
        super(author, title);
       /* this.author = author;
        this.title = title;*/
    }

    @Override
    String getGenre() {
        return "Mistério";
    }
}
