package SolvingSolution.Challenge;

/*
 * Input: a string of license key with random dash, with number of char in length of K
 * Output: correct license key with length of K between each dash
 * Ex: abc-ed-aes, 4 -> abce-daes
 * Ex: abc-ed-aes, 3 -> ab-ced-aes (first sub string must be shorter)
 */

public class C4 {

	public static String solution (String S, int K) {
		String words = S.replaceAll("-", "").toUpperCase();
		int length = words.length();
		boolean isFirstSubShorter = false;
		int subCeilLength = (int) Math.ceil((double) length / K);
		int subFloorLength = (int) Math.floor((double) length / K);
		
		if (subCeilLength != subFloorLength)
			isFirstSubShorter = true;
		
		String newStr = "";
		int count = 1;
		for (int i = 0; i < length; i++) {
			
			if (isFirstSubShorter && count == subFloorLength) {
				newStr += words.charAt(i) + "-";
				count = 1;
				isFirstSubShorter = false;
			}
			else if (count == K) {
				newStr += words.charAt(i);
				count = 1;
				if (i != length -1)
					newStr += "-";
			}
			else {
				newStr += words.charAt(i);
				count++;
			}
		}
		return newStr;
	}
}
