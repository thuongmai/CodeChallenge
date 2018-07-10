package SolvingSolution.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
 * Give N, p and q > 1, with p != q
 * Print N ... 1, and replace number with text if
 * - N % p -> OUT
 * - N % q -> THINK
 * - N % p && N % q -> OUTTHINK
 */
public class C1 {	
	public static void main (String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		
		/*Difference between BufferedReader and Scanner ?
		*BufferedReader: sync, larger buffer memory, a bit faster because it simply reads sequence of char
		*Scanner: not sync, smaller memory, slower because it parse input data (like data types)
		*/
		BufferedReader in = new BufferedReader (reader);
		//Scanner scanner = new Scanner(reader);

		String line;
		int n = 0, p = 0, q = 0;
		
		System.out.print("Enter N p and q: ");
		while ((line = in.readLine()) != null) {
			if (line.equals(""))
				break;
			String[] value = line.split(" ");
			n = Integer.parseInt(value[0]);
			p = Integer.parseInt(value[1]);
			q = Integer.parseInt(value[2]);
			
			for (int i = 1; i <= n; i++) {
				if (i % p == 0 && i % q != 0)
					System.out.print("OUT, ");
				else if (i % p != 0 && i % q == 0)
					System.out.print("THINK, ");
				else if (i % p == 0 && i % q == 0)
					System.out.print("OUTTHINK, ");
				else
					System.out.print(i + ", ");
			}
		}
		
		//Test
		System.out.println("Print: " + n + " " + p + " " + q);
	}
}
