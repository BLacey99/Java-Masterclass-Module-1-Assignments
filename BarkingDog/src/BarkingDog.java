
public class BarkingDog {

	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		
		if(hourOfDay < 0 || hourOfDay > 23) {
			System.out.println("False, regardless of barking.\n");
			return false;
		}
		else if (hourOfDay < 8 && barking == true || hourOfDay > 22 && barking == true) {
			System.out.println("It is " + hourOfDay + ". The dog has woken everyone up.\n");
			return true;
		}
		else {
			System.out.println("The dog is not barking, the time is " +hourOfDay + "\n");
			return false;
		}
		
		
	}
}
