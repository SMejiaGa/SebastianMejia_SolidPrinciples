package solid;
class LibraryItem {
    String title;
    ItemType type;
    boolean checkedOut;

    public LibraryItem(String title, ItemType type) {
        this.title = title;
        this.type = type;
        this.checkedOut = false;
    }

    public double calculateLateFee(int daysLate) {
        // Calculate late fee based on item type
        if (type == ItemType.BOOK) {
            return daysLate * 0.25;
        } else if (type == ItemType.DVD) {
            return daysLate * 0.50;
        } else {
            return 0.0;
        }
    }
    aaaaaaaaaaaaaa
    public void checkout() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(title + " checked out.");
        }
    }

    public void returnItem() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(title + " returned.");
        }
    }
}

enum ItemType {
    BOOK, DVD
}