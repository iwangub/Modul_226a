package mod226a.a;

import java.util.List;

public class PersonPrinter {

	public PersonPrinter() {

	}

	public void print(List<Person> persons) {
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
	}
}



