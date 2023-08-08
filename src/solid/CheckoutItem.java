package solid;

public class CheckoutItem {
	public double calculateLateFee(int daysLate, double customFee) {
        // Calculate late fee based on item type
        return daysLate * customFee;
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
