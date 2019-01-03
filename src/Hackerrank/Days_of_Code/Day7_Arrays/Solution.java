package Hackerrank.Days_of_Code.Day7_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		for (int i = 0; i < n / 2; i++) {
			int temp = arr[n - i - 1];
			arr[n - i - 1] = arr[i];
			arr[i] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		scanner.close();
	}

}
