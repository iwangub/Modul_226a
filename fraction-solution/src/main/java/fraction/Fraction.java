package fraction;

/**
 * Interface für einen Bruch.
 * 
 * @author Aleksandar Travanov
 * @version 1.0.0
 *
 */
public interface Fraction extends Comparable<Fraction> {
	/**
	 * Retourniert die Summe beider Brueche.
	 * 
	 * @param f Bruch, welcher addiert wird.
	 * @return Summe
	 */
	public Fraction add(Fraction f);
	
	/**
	 * Retourniert das Produkt beider Brueche.
	 * @param f
	 * @return
	 */
	public Fraction mul(Fraction f);
	/**
	 * Retourniert die Inverse des Bruchs.
	 * 
	 * @return Inverse
	 */
	public Fraction inv();
	/**
	 * Retourniert den Zaehler des Bruchs.
	 * @return Zaehler des Bruchs.
	 */
	public int getNumerator();
	
	/**
	 * Retourniert den Nenner des Bruchs.
	 * 
	 * @return Nenner des Bruchs
	 */
	public int getDenominator();
}
