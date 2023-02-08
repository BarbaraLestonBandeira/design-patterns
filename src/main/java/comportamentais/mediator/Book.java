package comportamentais.mediator;

public class Book {

    private String title;
    private Mediator mediator;

    Book(String title, Mediator mediator) {
        this.title = title;
        this.mediator = mediator;
        mediator.registerBook(this);
    }

    public String getTitle() {
        return title;
    }
}
