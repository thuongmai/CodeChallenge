package SolvingSolution.Challenge;

public class Merge2Numbers {
	public static int solution(int A, int B) {
		int lengthA = countDigits(A);
		int lengthB = countDigits(B);
		int result = -1;

		// Base case
		if (lengthA + lengthB > 9)
			return result;

		// Find the smaller one
		int length = lengthA;
		if (lengthB < length)
			length = lengthB;

		// Convert Int to String
		String strA = convertIntToStr(A);
		String strB = convertIntToStr(B);
		String tempResult = "";

		// Merge 2 numbers string
		int index = 0;
		while (index < length) {
			System.out.println(strA.charAt(index) + " : " + strB.charAt(index));
			tempResult += strA.charAt(index) + "" + strB.charAt(index);
			System.out.println(tempResult);
			index++;
		}

		// Get the leftover string
		strA = strA.substring(length, lengthA);
		strB = strB.substring(length, lengthB);

		// Add the rest of the string into the result
		tempResult += strA + "" + strB;
		
		//Convert back to Int
		result = Integer.parseInt(tempResult);
		return result;
	}

	public static int countDigits(int num) {
		if (num == 0)
			return 1;
		return (int) Math.log10(num) + 1;
	}

	public static String convertIntToStr(int num) {
		return num + "";
	}

//	public static void main(String[] args) {
//		System.out.println(solution(12, 56));
//		System.out.println(solution(12345, 678));
//		System.out.println(solution(123, 67890));
//		System.out.println(solution(100000, 100000));
//	}
}
