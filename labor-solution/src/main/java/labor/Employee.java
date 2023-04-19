package labor;

import java.time.LocalDate;

public class Employee {
	private String firstName;
	private String lastName;
	private LocalDate dob;

	public Employee(String firstName, String lastName, LocalDate dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Report executeOrder(Report report) {
		DNA x = report.getFirstDNA();
		DNA y = report.getSecondDNA();
		int distance = x.evolDistance(y);
		report.setResult(distance);
		report.setComment("Report abgeschlossen: "
				+firstName
				+", "
				+lastName);
		report.closeReport();
		return report;
	}

	@Override
	public String toString() {
		return "" + firstName + ", " + lastName + ", " + dob;
	}
}
