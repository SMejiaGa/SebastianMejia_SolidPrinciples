package solidInterfaces;
import solid.LibraryItem;

public interface Inventory {
	void checkout(LibraryItem item);
	void returnItem(LibraryItem item);
}
