package solidInterfaces;

public interface Inventory {
	boolean checkout(String title, boolean isChecked);
	boolean returnItem(String title, boolean isChecked);
}
