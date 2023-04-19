package mod226a.c;

public class WISSPerson implements Person {

	private String firstName;
	private String lastName;

	public WISSPerson(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public String toString() {
		return "WISSPerson [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
