package SolvingSolution.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/*
 * Input: list of  Input date, quantity and product
 * Output: sum date, count all product quantity sold on that day, 
 * average sell (all product quantity/days) with 2 decimal points, number of products
 * Ex: input : 
 * 2017-06-02,5,apples
 * 2017-06-02,7,banana
 * output:
 * 2017-06-02, 12, 6.00, 2
 */
public class C3 {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line = "";

		List<String> dates = new ArrayList<String>();
		List<String> quantity = new ArrayList<String>();
		List<String> productID = new ArrayList<String>();

		while ((line = in.readLine()) != null) {
			if (line.equals("exit")) {
				break;
			}

			String[] words = line.split(",");

			if (!dates.contains(words[0])) {
				dates.add(words[0]);
				quantity.add(words[1]);
				productID.add(words[2]);
			}
			else {
				
			}
		}
	}
}
