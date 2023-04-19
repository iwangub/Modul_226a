package mod226a;

public class Aufgabe02_boolean {

	public static boolean isEven(int n) {
		return n % 2 ==0;
	}

	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}

	public static void main(String[] args) {
		System.out.println("Gerade Zahl: " +(isEven(2)));
		System.out.println("Ungerade Zahl: " +(isOdd(2)));
	}
}


