package mod226a;

public class Quiz {
	
	public static int count;

	public static int func1(int n) {
		int f;

		if (n <= 1) {
			f = 1;
		} else {
			f = n * func1(n - 1);
		}
		return f;
	}
	// Fakultät

	public static int func2(int n) {
		int f = 0;
		if (n <= 2) {
			f = 1;
		} else {
			f = func2(n - 1) + func2(n - 2);
		}
		return f;
	}
	// Fibonacci
	
	public static void print(int n, String a, String b, String c) {
		if (n == 1) {
			message(a, b);
		} else {
			print(n - 1, a, c, b);
			message(a, b);
			print(n - 1, c, b, a);
		}
	}
	
	// Türme von Hanoi
	private static void message(String a, String b) {
		count++;
		System.out.println("Transportiere die Scheibe von " + a + " nach " + b + count);
	}

	
	public static void main(String[] args) {
	
		
		System.out.println(func1(3));

		System.out.println(func2(3));
		
		print(10,"one", "two", "Three");
		
		
		
	}

}
