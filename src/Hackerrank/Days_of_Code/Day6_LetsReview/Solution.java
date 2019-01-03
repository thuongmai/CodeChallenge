package Hackerrank.Days_of_Code.Day6_LetsReview;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner (System.in);
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			String str = scanner.next();
			String evenStr = "";
			String oddStr = "";
			
			for (int j = 0; j < str.length(); j++) {
				if (j % 2 == 0)
					evenStr += str.charAt(j);
				else
					oddStr += str.charAt(j);
			}
			System.out.println(evenStr + " " + oddStr);
		}
    }
	
}
