package Hackerrank.Days_of_Code.Day10_Binary_Numbers;

import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        convertDecToBinary(n);
        
        scanner.close();
    }
    
    private static int convertDecToBinary(int num) {
    	while (num > 0) {
    		int remainder = num % 2;
    		num = num/2;
    		System.out.println(remainder);
    	}
    	return 0;
    }
}
