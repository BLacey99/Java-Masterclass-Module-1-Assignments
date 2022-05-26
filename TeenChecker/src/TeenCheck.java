
public class TeenCheck {
	
	
	public static boolean findTeenNumber(int a, int b, int c) {
		if ((a >= 13 && a <=19) || (b >=13 && b <=19) || (c >= 13 && c <= 19)) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
		
	}
}
