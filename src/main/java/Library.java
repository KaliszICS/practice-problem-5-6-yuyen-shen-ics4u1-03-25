import java.util.ArrayList;

class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if ((books.get(i).getISBN()).equals(ISBN)){
                books.remove(i);
                break;
            }
        }
    }

    public Book[] searchBook(String title) {
        ArrayList<Book> same = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                same.add(book);
            }
        }
        return same.toArray(new Book[books.size()]);
    }

    public Book[] displayBooks() {
        return this.books.toArray(new Book[books.size()]);
    }
}