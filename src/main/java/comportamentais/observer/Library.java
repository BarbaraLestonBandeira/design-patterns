package comportamentais.observer;

public class Library implements BookObserver {


    @Override
    public void update(Book book) {
        System.out.println("A biblioteca recebeu uma " +
                "actualização ao livro: " + book.getTitle() +
                " escrito por: " + book.getAuthor());
    }
}
