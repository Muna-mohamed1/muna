package xasid;


public class main4 {
    public static void main(String[] args) {
        book book1=new book("birds","Jorge");
        book book2=new book("blind love","ahmed rashir");

        Library library= new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("library contais:" +library);

        library.removeBook(book1);
        System.out.println("library after removing:" +book1);

        System.out.println("independent book:" + book1);
    }

}
