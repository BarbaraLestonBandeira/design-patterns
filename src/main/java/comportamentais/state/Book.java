package comportamentais.state;

public class Book {

    private BookState state;

    public Book() {
        state = new Available();
    }

    public void borrowBook() {
        state.borrowBook(this);
    }

    public void returnBook(){
        state.returnBook(this);
    }

    public void setState(BookState state) {
        this.state = state;
    }


}
