package fraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Demonstriert das Sortieren von zufällig generierten Bruechen, 
 * welche das Interface <code>Comparable</code> implementieren.
 * <p>
 * Bonus Aufgabe aus dem Projekt fraction.
 * 
 * @author Aleksandar Travanov
 */
public class FractionSortDemo {
	public static void main(String[] args) {	
		// wir generieren hunder zufällige Brueche
		// und speichern diese in einer Liste.
		int n = 100; 
		List<Fraction> list = new ArrayList<Fraction>();
		Random random = new Random();
		for(int i=0;i<n;i++) {
			int a = random.nextInt(1,101);
			int b = random.nextInt(1,101);
			list.add(new MyFraction(a,b));
		}
		// nun sortieren wir unsere Brueche
		// und geben sie aus.
		Collections.sort(list);
		for(Fraction f: list) {
			System.out.println(f);
		}
	}
}
