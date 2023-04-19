package coin;

import java.util.Scanner;

public class Check3TimesTail {
	public static void main(String[] args) {
		Coin coin = new FairCoin();
		Scanner s = new Scanner(System.in);
		System.out.println("Anzahl Iterationen: ");
		int n = Integer.valueOf(s.next());
		s.close();
		int nof3TimesTail = 0;
		for (int i=0;i<n;i++) {
			if (coin.toss() == 0 && coin.toss() == 0 && coin.toss()==0) {
				nof3TimesTail+=1;
			}
		}
		System.out.println("Anteil 3 mal Zahl "+(double)nof3TimesTail/(double)n+" mal gewürfelt.");
	}
}
