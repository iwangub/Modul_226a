package mod226a;

public class Aufgabe04_Arrays {

	public static int gauss(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 5, 5 };
		// int[] a = new int[5];
		System.out.println(sum(a));
		System.out.println(gauss(2));
	}
}
