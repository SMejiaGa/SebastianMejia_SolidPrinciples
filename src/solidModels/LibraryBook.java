package solidModels;

import solidInterfaces.LibraryItem;

public class LibraryBook implements LibraryItem {
	public String title = "";
	public String type = "";
	public boolean checkedOut;

	public LibraryBook(String title, String type, boolean checkedOut) {
		this.title = title;
		this.type = type;
		this.checkedOut = checkedOut;
	}

	public String checkTitle() {
		return title;
	}

	public boolean checkAvailable() {
		return checkedOut;
	}

	@Override
	public void setAvailable(boolean newAvailable) {
		checkedOut = newAvailable;
	}

}
