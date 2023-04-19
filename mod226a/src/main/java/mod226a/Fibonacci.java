package mod226a;

public class Fibonacci {
	static int fibo(int n) {
		int res = 0;

		if (n == 1 || n == 2) {
			return 1;
		}
		res = (fibo(n - 1) + fibo(n - 2));
		return res;
	}
	
	

	public static int add(int n, int m) {
		int res = n + m;
		return res;
	}

	public static void add1(int [] a) {
		a[2] = a[0] + a[1];
	}
	
	public static int sub(int n, int m) {
		int res = n - m;
		return res;
	}

	public static int mul(int n, int m) {
		int res = n * m;
		return res;
	}

	public static int div(int n, int m) {
		int res = n / m;
		return res;
	}

	public static int mod(int n, int m) {
		return n & m;
	}

	public static int add1(int n, int m, int res1) {
		res1 = n + m;
		return res1;
	}

	public static void main(String[] args) {
		
		/*
		int[] a = {1,2,3,4,5};
		int[] x = {1,2,0};
		add1(x);
		System.out.println(x[2]);
		*/
		System.out.println(fibo(3));
		
		/*
		System.out.println(add(3, 4));
		System.out.println(sub(3, 4));
		System.out.println(mul(3, 4));
		System.out.println(div(3, 4));
		System.out.println(mod(3, 4));
		System.out.println(add1(3, 4, 0));*/
	}
}