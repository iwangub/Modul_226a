package shapes;

public class SimpleCircle implements Circle {

	private double radius;

	public SimpleCircle(double radius) {
		
		if(radius <= 0) {
			throw new IllegalArgumentException("Radius muss grösser als 0 sein");
		}
		this.radius = radius;
	}

	public double getArea() {
		return (radius * radius) * Math.PI;
	}

	public double getRadius() {
		return radius;
	}
}







