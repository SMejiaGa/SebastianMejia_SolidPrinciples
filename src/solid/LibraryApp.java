package solid;
public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem book = new LibraryItem("Introduction to Java", ItemType.BOOK);
        LibraryItem dvd = new LibraryItem("Action Movie", ItemType.DVD);

        book.checkout();
        dvd.checkout();

        book.returnItem();
        dvd.returnItem();

        double bookLateFee = book.calculateLateFee(5);
        double dvdLateFee = dvd.calculateLateFee(3);

        System.out.println("Late fee for book: $" + bookLateFee);
        System.out.println("Late fee for DVD: $" + dvdLateFee);
    }
}
