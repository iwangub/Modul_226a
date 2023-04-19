package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SimpleRectangleTest {
	@Test
	public void testKonstruktor() {
		Rectangle rectangle = new SimpleRectangle(5.0, 9.0);
		assertNotNull(rectangle, "Instanziertes Objekt Rectangle");
		assertEquals(5.0, rectangle.getWidth(), "Breite ist 5.0");
		assertEquals(9.0, rectangle.getLength(), "Laenge ist 9.0");
	}

	@Test
	public void testFlaeche() {
		Rectangle rectangle = new SimpleRectangle(5.0, 9.0);
		double area = rectangle.getArea();
		assertEquals(45.0, area, "Die Flaeche eines 5*9 Rechtecks ist 45");
	}
}


