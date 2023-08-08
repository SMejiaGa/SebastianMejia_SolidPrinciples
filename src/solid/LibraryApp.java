package solid;

import solidInterfaces.LibraryItem;
import solidModels.LibraryBook;
import solidModels.LibraryDVD;
import solidModels.LibraryDisc;
import solidModels.LibraryVinyl;

public class LibraryApp {
    public static void main(String[] args) {
    	LibraryItem book = new LibraryBook("Introduction to Java", "BOOK", false);
        LibraryItem dvd = new LibraryDVD("Action Movie", "DVD",false);
        LibraryItem disc = new LibraryDisc("Luis Miguel Disc", "DISC",false);
        LibraryItem vinyl = new LibraryVinyl("Old Vinyl", "VINYL",false);
        
        CheckoutItem checkbook = new CheckoutItem(book);
        CheckoutItem checkdvd = new CheckoutItem(dvd);
        CheckoutItem checkdisc = new CheckoutItem(disc);
        CheckoutItem checkVinyl = new CheckoutItem(vinyl);

        book.setAvailable(checkbook.checkout(book.checkTitle(), book.checkAvailable()));
        book.setAvailable(checkdvd.checkout(dvd.checkTitle(), dvd.checkAvailable()));
        book.setAvailable(checkdisc.checkout(disc.checkTitle(), disc.checkAvailable()));
        book.setAvailable(checkVinyl.checkout(vinyl.checkTitle(), vinyl.checkAvailable()));

        book.setAvailable(checkbook.returnItem(book.checkTitle(), book.checkAvailable()));
        book.setAvailable(checkdvd.returnItem(dvd.checkTitle(), dvd.checkAvailable()));
        book.setAvailable(checkdisc.returnItem(disc.checkTitle(), disc.checkAvailable()));
        book.setAvailable(checkVinyl.returnItem(vinyl.checkTitle(), vinyl.checkAvailable()));

        double bookLateFee = checkbook.calculateLateFee(5,0.5);
        double dvdLateFee = checkdvd.calculateLateFee(3,0.25);
        double discLateFee = checkdisc.calculateLateFee(7,2);
        double vinylLateFee = checkVinyl.calculateLateFee(10,1.5);

        System.out.println("Late fee for book: $" + bookLateFee);
        System.out.println("Late fee for DVD: $" + dvdLateFee);
        System.out.println("Late fee for DISC: $" + discLateFee);
        System.out.println("Late fee for Vinyl: $" + vinylLateFee);
    }
}
