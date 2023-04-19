package coin;

import java.util.Random;

/**
 * Einfache Implementierung einer fairen Muenze unter Verwendung von
 * <code>java.util.Random</code>.
 * 
 * @author Aleksandar Travanov
 * @version 1.0.0
 *
 */
public class FairCoin implements Coin {
	/**
	 * Interner Zufallsgenerator fuer den Muenzwurf.
	 */
	private Random random;
	
	/**
	 * Konstruiert eine neue Instanz einer Muenze. Es wird ein neuer Zufallsgenerator
	 * initialisiert.
	 */
	public FairCoin() {
		random = new Random();
	}

	@Override
	public int toss() {
		return random.nextInt(0,2);
	}
}
