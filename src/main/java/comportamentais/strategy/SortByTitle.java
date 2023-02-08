package comportamentais.strategy;

import java.util.List;

public class SortByTitle implements BookSorter {

    @Override
    public void sort(List<Book> books) {
        books.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
    }
}
