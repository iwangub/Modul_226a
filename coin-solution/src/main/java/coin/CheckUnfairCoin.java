package coin;

import java.util.Scanner;

public class CheckUnfairCoin {

	public static void main(String[] args) {
		System.out.println("Wahrscheinlichkeit fuer Zahl: ");
		Scanner s = new Scanner(System.in);
		double prob = Double.valueOf(s.next());
		System.out.println("Anzahl Iterationen: ");
		int n = Integer.valueOf(s.next());
		s.close();
		Coin coin = new UnfairCoin(prob);
		int nofTail = 0;
		for (int i = 0; i < n; i++) {
			if (coin.toss() == 0) {
				nofTail += 1;
			}
		}
		System.out.println("Anteil Zahl: " + (double)nofTail/(double)n);
	}
}
