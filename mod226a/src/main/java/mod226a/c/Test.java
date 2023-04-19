package mod226a.c;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Person aleks = new ETHPerson("Aleks", "Travanov");
		Person peter = new WISSPerson("peter", "Müller");
		List<Person> persons = new ArrayList<Person>();

		persons.add(aleks);
		persons.add(peter);
		
	}

}
