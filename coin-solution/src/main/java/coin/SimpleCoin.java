package coin;

/**
 * Einfache Implementierung einer fairen Muenze auf Basis eines 4-Bit
 * LFSR-Algorithmus (LFSR = Linear Feeback Shift Register).
 * 
 * @author Aleksandar Travanov
 * @version 1.0.0
 *
 */
public class SimpleCoin implements Coin {
	/**
	 * Interner LFSR Status. Beinhaltet den aktuellen Zustand des Linearen Feeback
	 * Shift Registers.
	 */
	private boolean[] state;

	/**
	 * Konstruiert eine neue Instanz einer Muenze. Das interne Register wird initial
	 * auf <code>1001</code> gesetzt.
	 */
	public SimpleCoin() {
		state = new boolean[] { true, false, false, true };
	}

	/**
	 * Simuliert einen Muenzwurf. Die Methode <code>toss()</code> retourniert
	 * entweder 1 fuer Kopf und 0 fuer Zahl. Bei unseren einfachen Implementierung
	 * mit einem 4-Bit Shift Register wiederholt sich die zufaellige 0-1 Folge nach
	 * 15 Wuerfen.
	 * 
	 * @return int 1 fuer Kopf, 0 fuer Zahl.
	 */
	@Override
	public int toss() {
		int n = state.length;
		boolean cur = state[n - 1];

		boolean next = state[n - 1] ^ state[n - 2];
		for (int i = n - 1; i > 0; i--) {
			state[i] = state[i - 1];
		}
		state[0] = next;
		return (cur) ? 1 : 0;
	}

	/**
	 * Liefert den aktuellen Zustand des internen LFSR als Output.
	 */
	@Override
	public String toString() {
		String res = "";
		for (boolean i : state) {
			res = res + ((i) ? 1 : 0);
		}
		return res;
	}
}
