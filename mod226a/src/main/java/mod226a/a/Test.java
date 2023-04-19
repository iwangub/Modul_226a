package mod226a.a;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person("Peter", "Müller");
		Person person2 = new Person("Hans", "Ruppert");
		
		Student student1 = new Student("iwan", "Gubler", 1);
		
		List<Person> friends = new ArrayList<Person>(); // List INTERFACE | ArrayList Klasse

		friends.add(person1);
		friends.add(person2);
		friends.add(student1);
		
		Student unknown = new Student(null, null, 1);
		System.out.println(unknown);
		
		PersonPrinter printer = new PersonPrinter();
		
		printer.print(friends);	
	}
}


