package comportamentais.strategy;

import java.util.List;

public class SortByAuthor implements BookSorter {

    @Override
    public void sort(List<Book> books) {
        books.sort((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
    }
}
