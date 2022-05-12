
public class MegabyteConverter {

	public static void printMegaandKiloBytes(int kilobytes) {
		int megabyteBase = 1024;
		
		
		if (kilobytes < 0) {
			System.out.println("Invalid Value.\n");
		}
		else {
			
			//Finds the remainder of division of Kb input by 1024 Mb value.
			int findKB = kilobytes%megabyteBase;
			
			
			//Removes the excess Kb that would cause conversion issues for Mb / Aka nondivisible by 1024 for int.
			int excessKB = kilobytes - findKB;
			
			
			//Takes the remaining Kb divisible by 1024 and calculates.
			int convertableKbToMb = excessKB / megabyteBase;
			
			System.out.println(kilobytes + " converted into Megabytes is: \n" + convertableKbToMb + " Megabytes and " + findKB + " Kilobytes\n");
		}
		
	}
	
}
