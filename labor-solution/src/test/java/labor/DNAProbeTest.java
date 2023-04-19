package labor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

// Einige einfache Tests fuer die Validierung einer DNA Sequenz
public class DNAProbeTest {	
	@Test
	public void testSequenceValidation() {
		assertEquals(true,
				DNAProbe.isValidSequence("ATGTAA"),
				"Die DNA Sequenz ATGTAA ist erlaubt.");
		assertEquals(true,
				DNAProbe.isValidSequence("ATGTAG"),
				"Die DNA Sequenz ATGTAG ist erlaubt.");
		assertEquals(true,
				DNAProbe.isValidSequence("ATGTGA"),
				"Die DNA Sequenz ATGTGA ist erlaubt.");
		assertNotEquals(true,
				DNAProbe.isValidSequence("ATTTAA"),
				"Die DNA Sequenz muss mit ATG beginnen.");
		assertNotEquals(true,
				DNAProbe.isValidSequence("ATGGGTTAT"),
				"Die DNA Sequenz muss mit TAA, TAG oder TGA enden.");
		assertNotEquals(true,
				DNAProbe.isValidSequence("ATGAGATTTAA"),
				"Die Laenge der DNA Sequenz muss durch drei "
				+ "teilbar sein.");
		assertNotEquals(true,
				DNAProbe.isValidSequence("ATGGAGTGAAATTAA"),
				"Die DNA Sequenz darf keine STOP Triplets "
				+ "im innern der Sequenz enthalten.");
	}
	
	@Test
	public void testEvolDistance() {
		DNA x = new DNAProbe("ATGCGCCTGCGTCTGTACTAG",LocalDate.of(1915, 3, 3),
				new Place(12.3426,-23.76823));
		DNA y = new DNAProbe("ATGCTTCGTTGTGCCTAG",LocalDate.of(1916, 12, 24),
				new Place(12.3426,-23.76823));
		
		assertEquals(16,
				x.evolDistance(y),
				"Die evolutionäre Distanz beträgt 16");
		
		DNA a = new DNAProbe("ATGAACG",LocalDate.of(1915, 3, 3),
				new Place(12.3426,-23.76823),false);
		DNA b = new DNAProbe("TCAAT",LocalDate.of(1916, 12, 24),
				new Place(12.3426,-23.76823),false);
		
		assertEquals(10,
				a.evolDistance(b),
				"Die evolutionäre Distanz beträgt 10");
		
	}
}
