package solid;
import solidEnums.ItemType;

class LibraryItem {
    String title;
    ItemType type;
    boolean checkedOut;

    public LibraryItem(String title, ItemType type) {
        this.title = title;
        this.type = type;
        this.checkedOut = false;
    }
}
