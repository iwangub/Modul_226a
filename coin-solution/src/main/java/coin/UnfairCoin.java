package coin;

import java.util.Random;

/**
 * Implementierung einer unfairen Muenze.
 * 
 * @author Aleksandar Travanov
 *
 */
public class UnfairCoin implements Coin {
	/**
	 * Interner Zufallsgenerator fuer den Muenzwurf.
	 */
	private Random random;

	/**
	 * Wahrscheinlichkeit fuer Zahl. Beispiel: 0.9 bedeutet einer Wahrscheinlicheit
	 * von 90% Zahl zu wuerfeln.
	 */
	private double probTail;

	/**
	 * Konstruiert eine neue Instanz einer unfairen Muenze. Der Parameter
	 * <code>probTail</code> gibt die Wkeit an, mit welcher Zahl gewürfelt wird. Der
	 * Wert muss sich zwischen 1.0 (100 Prozent Wkeit für Zahl) und 0.0 (0 Prozent
	 * Wkeit für Zahl).
	 * 
	 * @param probTail double Wkeit. Zahl zu würfeln.
	 * @exception IllegalArgumentException falls pobTail nicht zwischen 0.0 und 1.0
	 *                                     (inklusive).
	 */
	public UnfairCoin(double probTail) {
		if (probTail < 0.0 || probTail > 1.0) {
			throw new IllegalArgumentException("Probability Tail must be between 0.0 and 1.0");
		}
		this.probTail = probTail;
		random = new Random();
	}

	@Override
	public int toss() {
		return (random.nextDouble() <= probTail) ? 0 : 1;

	}
}
