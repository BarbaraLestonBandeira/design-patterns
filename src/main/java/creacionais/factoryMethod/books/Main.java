package creacionais.factoryMethod.books;

public class Main {
    public static void main(String[] args) {
        //instanciação de uma NovelFactory
        BookFactory novelFactory = new NovelFactory();
        //instanciação de um Book do tipo Novel
        Book novel = novelFactory.createBook();
        //método da interface, que é diferente para cada tipo de Book
        novel.read();

        //instanciação de uma TextBookFactory
        BookFactory textbookFactory = new TextBookFactory();
        //instanciação de um Book do tipo TextBook
        Book textbook = textbookFactory.createBook();
        //método da interface, que é diferente para cada tipo de Book
        textbook.read();

    }
}
