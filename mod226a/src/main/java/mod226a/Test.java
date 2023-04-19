package mod226a;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		// int[] array = { 5, 3, 8, 4, 2 };
		int[] array = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(array));
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				System.out.println(Arrays.toString(array));

			}

			System.out.println(Arrays.toString(array));
		}

	}

}
