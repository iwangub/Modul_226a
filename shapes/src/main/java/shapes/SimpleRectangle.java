package shapes;

public class SimpleRectangle implements Rectangle {

	private double width;
	private double length;

	public SimpleRectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getArea() {
		return length * width;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

}








