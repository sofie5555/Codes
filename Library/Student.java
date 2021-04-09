
public class Student {
	private int studentID;
	private String studentName;
	private Loan[] booksBorrowed = new Loan[10]; // int[] booskBorrowed = new int[10];
	private int numBooks = 0;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public int getStudentID() {
		return this.studentID;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public Loan getLoan(int i) {
		return booksBorrowed[i];

	}

	public void addLoan(Loan loan) {
		booksBorrowed[numBooks] = loan;
		numBooks = numBooks + 1;
	}

	public int getNumBooks() {
		return numBooks;
	}

	public Loan[] getBooksBorrowed() {
		return booksBorrowed;

	}
}
