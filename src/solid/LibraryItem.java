package solid;

public class LibraryItem {
    String title;
    String type;
    boolean checkedOut;

    public LibraryItem(String title, String type) {
        this.title = title;
        this.type = type;
        this.checkedOut = false;
    }
}
