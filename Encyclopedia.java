package LabProgram217;

public class Encyclopedia extends Book {
	// TODO: Declare private fields
	private String edition;
	private int page;

	// TODO: Define mutator methods -
	// setEdition(), setNumPages()
	public void setEdition(String edition) {
		this.edition = edition;
	}

	public void setNumPages(int page) {
		this.page = page;
	}

	// TODO: Define accessor methods -
	// getEdition(), getNumPages()
	public String getEdition() {
		return edition;
	}

	public int getNumPages() {
		return page;
	}

	// TODO: Define a printInfo() method that overrides
	// the printInfo in Book class
	public void printInfo() {
		super.printInfo();
		System.out.println("   Edition: " + edition);
		System.out.println("   Number of Pages: " + page);
	}
}