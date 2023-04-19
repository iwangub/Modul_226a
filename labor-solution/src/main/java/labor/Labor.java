package labor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Labor {
	private List<Employee> employees;
	private Map<Integer,Report> library;
	private Address address;
	private int currentKeyReport;

	public Labor(Address address) {
		if (address == null) {
			throw new NullPointerException("Address is NULL!");
		}
		this.address = address;
		employees = new ArrayList<Employee>();
		library = new HashMap<Integer,Report>();
		currentKeyReport = 1;
	}
	
	public Labor(String street, String city, String country) {
		this.address = new Address(street,city,country); 
		employees = new ArrayList<Employee>();
		library = new HashMap<Integer,Report>();
		currentKeyReport = 1;
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public Report createReport(DNA firstDNA, DNA secondDNA) {
		Random r = new Random();
		Employee employee = employees.get(r.nextInt(0,employees.size()));
		int key = currentKeyReport;
		currentKeyReport++;
		Report report = new Report(key,employee,firstDNA,secondDNA);
		library.put(key,report);
		return employee.executeOrder(report);
	}
	
	public void printAllReports() {
		System.out.println("Labor: "
				+address.getCity()+","
				+address.getStreet());
	
		for(Report r: library.values()) {
			System.out.println();
			r.print();
		}
	}
}
