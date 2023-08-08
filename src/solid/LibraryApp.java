package solid;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem book = new LibraryItem("Introduction to Java", "BOOK");
        LibraryItem dvd = new LibraryItem("Action Movie", "DVD");
        LibraryItem disc = new LibraryItem("Luis Miguel Disc", "DISC");
        LibraryItem Vinyl = new LibraryItem("Old Vinyl", "VINYL");
        CheckoutItem check = new CheckoutItem();

        check.checkout(book);
        check.checkout(dvd);
        check.checkout(disc);
        check.checkout(Vinyl);

        check.returnItem(book);
        check.returnItem(dvd);
        check.returnItem(disc);
        check.returnItem(Vinyl);

        double bookLateFee = check.calculateLateFee(5,book);
        double dvdLateFee = check.calculateLateFee(3,dvd);
        double discLateFee = check.calculateLateFee(7,disc);
        double vinylLateFee = check.calculateLateFee(10,Vinyl);

        System.out.println("Late fee for book: $" + bookLateFee);
        System.out.println("Late fee for DVD: $" + dvdLateFee);
        System.out.println("Late fee for DISC: $" + discLateFee);
        System.out.println("Late fee for Vinyl: $" + vinylLateFee);
    }
}
