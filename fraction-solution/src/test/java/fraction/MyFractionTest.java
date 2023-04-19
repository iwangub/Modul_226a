package fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyFractionTest {
	@Test
	public void testKonstruktor() {
		Fraction f1 = new MyFraction(-30,75);
		assertNotNull(f1,"Instanziertes Objekt Bruch");
		assertEquals(-2, f1.getNumerator(),"Zaehler muss 1 sein.");
		assertEquals(5, f1.getDenominator(),"Nenner muss 15 sein.");
		assertEquals("-2/5", f1.toString(),"toString() muss '1/5' liefern.");
	}
	
	@Test
	public void testAdd() {
		Fraction f1 = new MyFraction(3,4);
		Fraction f2 = new MyFraction(1,2);
		
		assertEquals("5/4",f1.add(f2).toString(),"Bruch muss 5/4 sein");
	}
	
	@Test
	public void testMul() {
		Fraction f1 = new MyFraction(3,4);
		Fraction f2 = new MyFraction(4,2);
		
		assertEquals("3/2",f1.mul(f2).toString(),"Bruch muss 3/2 sein");
	}
	
	@Test
	public void testInv() {
		Fraction f1 = new MyFraction(12,16);
		
		assertEquals("4/3",f1.inv().toString(),"Bruch muss 4/3 sein");
	}
}
