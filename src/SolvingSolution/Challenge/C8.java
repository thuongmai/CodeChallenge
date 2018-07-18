package SolvingSolution.Challenge;

public class C8 {

	public static String solution (String S) {
		//Check for empty string
		if (S == "") return null;
		
		String[] getClock = S.split(":");
		String hour = getClock[0];
		String minute = getClock[1];
		String result = hour + ":";
		
		//Analyze the minute
		int a = Integer.parseInt(String.valueOf(minute.charAt(0)));
		int b =  Integer.parseInt(String.valueOf(minute.charAt(1)));
		
		if (a < b) 
			result += a + "" +  a;
		else
			result += b + "" +  b;
		return result;
	}

	public static void main (String[] args) {
		System.out.println(solution ("11:01"));
		System.out.println(solution ("11:13"));
		System.out.println(solution ("22:22"));
	}
	
}
