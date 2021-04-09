
public class Main {
	Student[] borrowers;

	public static void main(String[] args) {

		Student student = new Student(93003, "Smith");
		// Loan loan = new Loan(212000, "The Stars"))
		student.addLoan(new Loan(212000, "The Stars"));

		Student temp;
		Student[] borrowers = new Student[100000];
		temp = new Student(93001, "Jones");
		temp.addLoan(new Loan(210001, "The Sky"));
		borrowers[93001] = temp;

		temp = new Student(3012, "Zang");
		temp.addLoan(new Loan(210121, "The Animals"));
		borrowers[3012] = temp;

		borrowers[93001].addLoan(new Loan(210002, "The Spooks"));

		temp = new Student(93002, "Nguyen");
		temp.addLoan(new Loan(210011, "The Ocean"));
		borrowers[93002] = temp;

		System.out.println(borrowers[93001].getStudentName());
		System.out.println(borrowers[93001].getLoan(1).getBookTitle()); // getloan is supposed to show the books
																		// borrowed, it serves as the index for the
																		// books
		System.out.println(borrowers[3012].getLoan(0).getBookTitle()); // 3012 is student called Zang, zang only
																		// borrowed 1 book at index 0 called "The
																		// Animals", which will be outputted.

	}

	public void showDetails(int studentID) {
		Student student = borrowers[studentID];
		System.out.println("Name of the student is: " + student.getStudentName() + ":");
		for (int i = 0; i < student.getBooksBorrowed().length; i++) {
			if (student.getLoan(i) != null) {
				System.out.println("The title of the book is: " + student.getLoan(i).getBookTitle()
						+ ", the date borrowed is " + student.getLoan(i).getDate());
			}

		}

	}

}
