import java.util.ArrayList;

class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book ISBN) {
        this.books.remove(ISBN);
    }

    public Book[] searchBook(Book title) {
        return this.books;
    }

    public Book[] displayBook() {
        return this.books;
    }
}