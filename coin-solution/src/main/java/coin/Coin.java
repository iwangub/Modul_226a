package coin;

/**
 * Interface einer Muenze, welche aus den beiden Seiten Kopf (=1) und Zahl (=0) 
 * besteht. Der Muenzwurf wird mit der Methode <code>toss()</code> simuliert. 
 *
 * @author Aleksandar Travanov
 * @version 1.0.0
 *
 */
public interface Coin {
	/**
	 * Simuliert einen Muenzwurf. Die Methode <code>toss()</code> retourniert
	 * entweder 1 fuer Kopf und 0 fuer Zahl.
	 * @return int 1 fuer Kopf, 0 fuer Zahl.
	 */
	public int toss();
}
