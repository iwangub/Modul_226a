package mod226a.c;

public class ETHPerson implements Person {

	private String firstName;
	private String lastName;

	public ETHPerson(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "ETHPerson [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
