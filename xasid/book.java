package xasid;

public class book {
    private String title;
    private String author;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book" +
                "title='" + title +
                "author='" + author
                ;
    }
}


