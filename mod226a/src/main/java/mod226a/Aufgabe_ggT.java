package mod226a;

public class Aufgabe_ggT {

	public static int ggt(int a, int b) {
		while (b != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	// Berechnet den ggT mit dem iterativen Ansatz
	public static int ggtMod(int num1, int num2) {
		int rest = 0;

		while (num2 != 0) {
			rest = num1 % num2;
			num1 = num2;
			num2 = rest;
		}
		return num1;
	}

	// Berechnet den ggT mit dem rekursiven Ansatz
	public static int euclid(int a, int b) {
		if (b == 0) {
			return a;
		}
		return euclid(b, a % b);
	}

	public static void main(String[] args) {
		System.out.println("ggt: " + (ggtMod(14, 7)));
		System.out.println("ggt: " + (euclid(14, 28)));
		//System.out.println("ggt: " + (ggt(14, -28)));


		/*
		 * New myggt = new ggtMod(); System.out.println(myggt(5));
		 */

	}
}
