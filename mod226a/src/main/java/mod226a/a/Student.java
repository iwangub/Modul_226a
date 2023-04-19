package mod226a.a;

public class Student extends Person {

	private int studId;

	public Student(String firstName, String lastName, int studId) {
		super(firstName, lastName);
		this.studId = studId;
	}

	public int getStudId() {
		return studId;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ "]";
	}
}
