package xasid;
 import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(book book) {
        books.add(book);
    }

    public void removeBook(book book) {
        books.remove(book);
    }

    public List<book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';

    }
}

