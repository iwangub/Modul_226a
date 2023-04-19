package labor;

public class Report {
	private int id;
	private Employee employee;
	private DNA firstDNA;
	private DNA secondDNA;
	private boolean closed;
	private int result;
	private String comment;

	public Report(int id, Employee employee, DNA firstDNA, DNA secondDNA) {
		this.id = id;
		this.employee = employee;
		this.firstDNA = firstDNA;
		this.secondDNA = secondDNA;
		closed = false;
	}
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		if (!closed) {
			this.result = result;
		}
	}

	public int getId() {
		return id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public DNA getFirstDNA() {
		return firstDNA;
	}

	public DNA getSecondDNA() {
		return secondDNA;
	}

	public void closeReport() {
		closed = true;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setComment(String comment) {
		if (!closed) {
			this.comment = comment;
		}
	}

	public String getComment() {
		return comment;
	}
	
	public void print() {
		System.out.println("Report: "+id);
		if (!isClosed()) {
			System.out.println("Noch in Bearbeitung");
			return;
		}
		System.out.println("x = "+firstDNA.getSequence());
		System.out.println("y = "+secondDNA.getSequence());
		System.out.println("Evolutinary distance = "+result);
		System.out.println(comment);
	}
}
