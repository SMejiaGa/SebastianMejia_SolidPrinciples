package solidModels;

import solidInterfaces.LibraryItem;

public class LibraryDisc implements LibraryItem {
	public String title = "";
	public String type = "";
	public boolean checkedOut;

	public LibraryDisc(String title, String type, boolean checkedOut) {
		this.title = title;
		this.type = type;
		this.checkedOut = checkedOut;
	}

	@Override
	public String checkTitle() {
		return title;
	}

	@Override
	public boolean checkAvailable() {
		return checkedOut;
	}
	
	@Override
	public void setAvailable(boolean newAvailable) {
		checkedOut = newAvailable;
	}

}
