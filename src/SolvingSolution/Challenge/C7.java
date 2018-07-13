package SolvingSolution.Challenge;

import java.util.ArrayList;
import java.util.List;

/*
 * Given 3 sorted arrays, find all the intersection between them
 * [2 6 9 11 13 17]
 * [3 6 7 10 13 18]
 * [4 5 6 9 11 13]
 * => [6, 13]
 */
public class C7 {

	public static Object[] solution (int[] A, int[] B, int[] C) {
		List<Integer> list = new ArrayList<Integer>();
		
		int i = 0, j = 0, h = 0;
		while (i < A.length && j < B.length && h < C.length) {
			if (A[i] < B[j] || A[i] < C[h])
				i++;
			else if (B[j] < A[i] || B[j] < C[h])
				j++;
			else if (C[h] < A[i] || C[h] < B[j])
				h++;
			else
			{
				list.add(A[i]);
				i++;
				j++;
				h++;
			}
		}
		return list.toArray();
	}
	
	public static void main (String[] args) {
		int[] A = new int[] {2, 6, 9, 11, 13, 17};
		int[] B = new int[] {3, 6, 7, 10, 13, 18};
		int[] C = new int[] {4, 5, 6, 9, 11, 13};
		
		Object[] result = solution(A, B, C);
		
		for (Object o : result) {
			System.out.print (o + " ");
		}
	}
	
}
