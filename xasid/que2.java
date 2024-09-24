package xasid;

public class que2 {
    static int bookId;
    static String AuthorName;
    String Bookshop;

    static {
        bookId = 21;
        AuthorName = "Farax";

        System.out.println("bookId from SIB" + bookId);
        System.out.println("AuthorName from SIB" + AuthorName);
    }

    public que2(String bookshop) {
        this.Bookshop = bookshop;
        System.out.println("bookshop from constructor:" + bookshop);
    }

    public String getBookshop() {
        return Bookshop;
    }


    public static String getAuthorName() {
        return AuthorName;
    }

    public static int getBookId() {
        return bookId;
    }


    }








