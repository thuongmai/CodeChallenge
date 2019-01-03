package SolvingSolution.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/*
 * Add input of all data, then return the matched data with initial input
 */
public class DrugStore_IBM {
	public static void main (String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line, userInput = "";
		Boolean isListEnd = false, foundDrug = false;
		List<String> listOfDrug = new ArrayList<String>();
		Vector<String> listOfDrug2 = new Vector<String>();
		
		System.out.println("Enter list of drug or enter 1 to end the list: ");
		
		while ((line = in.readLine()) != null) {
			//Check for blank line
			if (line.equals("1")) {
				System.out.println("Enter a drug you want to find: ");
				isListEnd = true;
				continue;
			}
			if (!isListEnd) {
				listOfDrug.add(line);
				listOfDrug2.addElement(line);
			}
			else {
				userInput = line;
				break;
			}
		}
		
		for (String drug : listOfDrug) {
			if (drug.startsWith(userInput)) {
				System.out.println("Your drug is 1: " + drug);
				foundDrug = true;
			}
		}
		
		for (String drug : listOfDrug2) {
			if (drug.startsWith(userInput)) {
				System.out.println("Your drug is 2: " + drug);
				foundDrug = true;
			}
		}
		
		//Difference between for loop and Iterator ?
		//Iterator can go next or previous, can remove or add to the list
		ListIterator<String> it = listOfDrug2.listIterator();
		while (it.hasNext()) {
			String temp = it.next();
			if (temp.startsWith(userInput)) {
				System.out.println("Your drug is 3: " + temp.toString());
				foundDrug = true;
			}
		}
		
		if (!foundDrug)
			System.out.println("<NONE>");
	}
}
