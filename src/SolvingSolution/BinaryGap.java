package SolvingSolution;

/*
 * Binary Gap within a positive integer N is any maximum sequence of consecutive zeros
 * that is surrounded by ones at both ends in the binary representation of N
 * 
 * Ex: 529 => 1000010001 has 2 binary gaps : length of 4 and length of 3
 * Ex: 20 => 10100 has binary gap of length 1
 * Ex: 15 => 1111 has no binary gap
 */

public class BinaryGap {

	/**
	 * @return length of its longest binary gap.
	 */
	public static int solution(int N)
	{
		//Covert Integer to Binary
		String binary = Integer.toBinaryString(N);
		int maxGap = 0, countGap = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			char c = binary.charAt(i);
			if (c == '1')
			{
				if (countGap > maxGap)
					maxGap = countGap;
				countGap = 0;
			}
			else
				countGap++;
		}
		return maxGap;
	}
	
	public static void main (String[] args)
	{
		System.out.println(solution(529)); //Should be 4
		System.out.println(solution(20)); //Should be 1
		System.out.println(solution(15)); //Should be 0
	}
}
