package SolvingSolution.Lession3_TimeComplexity;

/*
 * Count min number of jumps D from pos X to Y
 * 
 * Complexity: Time O(1), Space O(1)
 */

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        double result = 0;
        
        result = (double) (Y - X) / D;
        
        int temp = (int)Math.ceil(result);
        
        return temp;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(10,85,30)); // 3
		System.out.println(solution(3,999111321,7)); // 142730189
	}

}
