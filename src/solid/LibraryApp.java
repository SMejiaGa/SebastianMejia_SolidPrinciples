package solid;

import solidEnums.ItemType;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem book = new LibraryItem("Introduction to Java", ItemType.BOOK);
        LibraryItem dvd = new LibraryItem("Action Movie", ItemType.DVD);
        CheckoutItem check = new CheckoutItem();

        check.checkout(book);
        check.checkout(dvd);

        check.returnItem(book);
        check.returnItem(dvd);

        double bookLateFee = check.calculateLateFee(5,book);
        double dvdLateFee = check.calculateLateFee(3,dvd);

        System.out.println("Late fee for book: $" + bookLateFee);
        System.out.println("Late fee for DVD: $" + dvdLateFee);
    }
}
