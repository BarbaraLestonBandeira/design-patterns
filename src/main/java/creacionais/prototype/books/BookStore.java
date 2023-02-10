package creacionais.prototype.books;

public class BookStore {

    private Book novelPrototype;
    private Book textBookPrototype;

    public BookStore(Book novelPrototype, Book textBookPrototype) {
        this.novelPrototype = novelPrototype;
        this.textBookPrototype = textBookPrototype;
    }

    public Book createNovel() {
        return novelPrototype.clone();
    }

    public Book createTextBook() {
        return textBookPrototype.clone();
    }
}
