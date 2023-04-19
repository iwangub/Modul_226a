package mod226a;
//. Packages werden kleingeschrieben

// public = jeder kann es verwenden
// private = nur innerhalb dieser Klasse aufrufbar

public class Person {
	private String firstName; // Attribut
	private String lastName; // Attrubut
	

	// Konstruktor
	// Verwendung: Person iwan = new Person("Iwan", "Gubler");
	// Verwendung: Person heiri = new Person("Heiri", "Gubler");
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	// Verwendung: System.out.println(person);  -> Prints: Person [firstName=Peter, lastName=Müller]
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	// setter iwan.setLastName("Müller");
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// getter
	// Verwendung: String fName = iwan.getFirstName();
	public String getFirstName() {
		return firstName; // oder this.firstName
	}

	// Verwendung: String lName = heiri.getLastName();
	public String getLastName() {
		return lastName; // oder this.lastName
	}
	
	
}
