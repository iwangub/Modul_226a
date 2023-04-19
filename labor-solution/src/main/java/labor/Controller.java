package labor;

import java.time.LocalDate;

public class Controller {

	public static void main(String[] args) {
		Labor labor = new Labor(
				new Address("Hohlstrasse 167", "Zürich", "Schweiz"));
		labor.addEmployee(
				new Employee("Albert", "Einstein", LocalDate.of(1879, 3, 14)));
		labor.addEmployee(
				new Employee("Niels", "Bohr", LocalDate.of(1885, 10, 7)));

		DNA dnaA = new DNAProbe("ATGCGCCTGCGTCTGTACTAG", LocalDate.of(1915, 3, 3),
				new Place(12.3426, -23.76823));
		DNA dnaB = new DNAProbe("ATGCTTCGTTGTGCCTAG", LocalDate.of(1916, 12, 24),
				new Place(12.3426, -23.76823));

		labor.createReport(dnaA, dnaB);
		labor.printAllReports();
	}
}
