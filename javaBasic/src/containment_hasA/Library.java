package containment_hasA;

public class Library {
	private int Books; private String incharge;


	public int getBooks() {
		return Books;
	}


	public void setBooks(int books) {
		Books = books;
	}


	public String getIncharge() {
		return incharge;
	}


	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
	
	public String toString() {
		return incharge+"\n "+Books;
	}

}
