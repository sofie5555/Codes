import java.util.Date;

public class Loan {

	private int bookID;
	private String bookTitle;
	private Date date;
	static int numBooksLoaned;

	public Loan(int bookID, String bookTitle) {
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.date = new Date();
		numBooksLoaned = numBooksLoaned + 1;

	}

	public int getBookID() {
		return this.bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;

	}

	public String getBookTitle() {
		return this.bookTitle;
	}

	public void setBookTitle() {
		this.bookTitle = bookTitle;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate() {
		this.date = new Date();
	}

	public String showDetailss(int studentID) {
		return "Book ID: " + bookID + "Book Title: " + bookTitle + "Date: " + date;
	}
}
