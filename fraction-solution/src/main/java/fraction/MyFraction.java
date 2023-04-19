package fraction;

/**
 * Einfache Implementierung eines Bruchs bestehend aus Zaehler und Nenner.
 * 
 * @author Aleksandar Travanov
 *
 */
public final class MyFraction implements Fraction {
	/**
	 * Zaehler des Bruchs.
	 */
	private final int numerator;
	/**
	 * Nenner des Bruchs.
	 */
	private final int denominator;

	/**
	 * Konstuktor des Bruchs. Nenner darf nicht 0 sein.
	 * @param numerator Zaehler
	 * @param denominator Nenner
	 * 
	 * @exception IllegalArgumentException Falls Nenner 0 ist.
	 */
	public MyFraction(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator is 0!");
		}
		int c = gcd(numerator, denominator);
		
		this.numerator = numerator / c;
		this.denominator = denominator / c;
	}

	@Override
	public int compareTo(Fraction o) {
		int a = numerator;
		int b = denominator;
		int c = o.getNumerator();
		int d = o.getDenominator();
		
		return a*d-c*b;
	}

	@Override
	public Fraction add(Fraction f) {
		int a = numerator;
		int b = denominator;
		int c = f.getNumerator();
		int d = f.getDenominator();
		
		return new MyFraction(a*d+c*b,b*d);
	}

	@Override
	public Fraction mul(Fraction f) {
		int a = numerator;
		int b = denominator;
		int c = f.getNumerator();
		int d = f.getDenominator();
		
		return new MyFraction(a*c,b*d);
	}

	@Override
	public Fraction inv() {
		return new MyFraction(denominator, numerator);
	}

	@Override
	public int getNumerator() {
		return numerator;
	}

	@Override
	public int getDenominator() {
		// TODO Auto-generated method stub
		return denominator;
	}
	
	@Override
	public String toString() {
		if (numerator == 0) {
			return ""+0;
		}
		String r = denominator!=1?Math.abs(numerator)+
				"/"+Math.abs(denominator):""+Math.abs(numerator);
		if ((denominator < 0) ^ (numerator < 0)) {
			return "-"+r;
		}
		return r;
	}

	/**
	 * Private Methode zur Berechnung des grössten gemeinsamen Teilers.
	 * 
	 * @param a erstes Argument des ggt
	 * @param b zweites Argument des ggt.
	 * @return Grösster gemeinsamer Teiler
	 */
	private int gcd(int a, int b){
		int c = 0;
		while(b!=0) {
			c = a%b;
			a = b;
			b = c;
		}
		return a;
	}
}
