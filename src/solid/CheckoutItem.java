package solid;
import solidInterfaces.Inventory;
import solidInterfaces.LibraryItem;

public class CheckoutItem implements Inventory {
	public LibraryItem localItem;
	public CheckoutItem(LibraryItem localItem) {
		this.localItem = localItem;
	}

	public double calculateLateFee(int daysLate, double customFee) {
        // Calculate late fee based on custom fee
        return daysLate * customFee;
    }
    
	@Override
	public boolean checkout(String title, boolean isChecked) {
		 if (!isChecked) {
	            System.out.println(title + " checked out.");
				   return  true;
	        }
		 return false;
	}

	@Override
	public boolean returnItem(String title, boolean isChecked) {
		  if (isChecked) {
	            System.out.println(title + " returned.");
	            return false;
	        }
		  return true;
	}
}
