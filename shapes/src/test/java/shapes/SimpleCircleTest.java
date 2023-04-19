package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SimpleCircleTest {
	@Test
	public void testKonstruktor() {
		Circle circle = new SimpleCircle(5.0);
		assertNotNull(circle, "Instanziertes Objekt Circle");
		assertEquals(5.0, circle.getRadius(), "Der Radius ist: xxx");
		// assertEquals(9.0, circle.getLength(), "Laenge ist 9.0");
	}

	@Test
	public void testFlaeche() {
		Circle circle = new SimpleCircle(5.0);
		double area = circle.getArea();
		assertEquals(78.539816339744830961566084581988, area, "Die Flaeche des Kreises ist Korrekt");
		// oder direkt die Formel einsetzen
		assertEquals(Math.PI * 5.0 * 5.0, area, "Die Flaeche des Kreises ist Korrekt");
	}
}
