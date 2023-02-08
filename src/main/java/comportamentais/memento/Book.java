package comportamentais.memento;

public class Book {

    private String title;
    private String author;
    private String state;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BookMemento saveStateToMemento() {
        return new BookMemento(title, author, state);
    }

    public void getStateFromMemento(BookMemento memento) {
        title = memento.getTitle();
        author = memento.getAuthor();
        state = memento.getState();
    }

    public static class BookMemento {
        private final String title;
        private final String author;
        private final String state;

        public BookMemento(String title, String author, String state) {
            this.title = title;
            this.author = author;
            this.state = state;
        }
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getState() {
            return state;
        }
    }
}