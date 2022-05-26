

public class EqualSumChecker {

	
	public static boolean hasEqualSum(int a, int b, int c) {
		
		
		
		
		if (a + b == c) {
			
			System.out.println("Does " + a + " + " + b + " equal " + c + "?");
			System.out.println("True");
			return true;
		}
		System.out.println("Does " + a + " + " + b + " equal " + c + "?");
		System.out.println("False");
		return false;
	}
}
