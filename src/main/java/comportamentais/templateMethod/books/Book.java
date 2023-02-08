package comportamentais.templateMethod.books;

public abstract class Book {

    protected String author;
    protected String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final void print() {
        System.out.println("Autor: " + author);
        System.out.println("Título: " + title);
        System.out.println("Género: " + getGenre());
    }

    abstract String getGenre();
}
