package comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private List<BookObserver> observers = new ArrayList<>();

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

    public void addObserver(BookObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BookObserver observer) {
        observers.remove(observer);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void notifyObservers() {
        for (BookObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Livro: " +
                "\n\t Título: %s " +
                "\n\t Author: %s", title, author);
    }
}
