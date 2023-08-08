package solid;
import solidEnums.ItemType;

public class CheckoutItem {
	public double calculateLateFee(int daysLate, LibraryItem item) {
        // Calculate late fee based on item type
        if (item.type == ItemType.BOOK) {
            return daysLate * 0.25;
        } else if (item.type == ItemType.DVD) {
            return daysLate * 0.50;
        } else {
            return 0.0;
        }
    }
  
    public void checkout(LibraryItem item) {
        if (!item.checkedOut) {
            item.checkedOut = true;
            System.out.println(item.title + " checked out.");
        }
    }

    public void returnItem(LibraryItem item) {
        if (item.checkedOut) {
            item.checkedOut = false;
            System.out.println(item.title + " returned.");
        }
    }
}
