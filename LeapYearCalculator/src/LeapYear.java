
public class LeapYear {

	public static boolean isLeapYear (int year) {
		
		if ((year <= 1) || (year > 9999)) {
			System.out.println(year + " is Invalid input, not in range.\n");
			return false;
		}
		else {
			if (!(year % 4 == 0)) {
				System.out.println(year + " is not a leap year! It is not divisible evenly by 4.\n");
				return false;
			}
			else {
				if (!(year % 100 == 0)) {
					System.out.println(year + " is not a leap year! It is not divisible evenly by 100.\n");
					return false;
				}
				else {
					if (!(year % 400 == 0)) {
						System.out.println(year + " is not a leap year! It is not divisible evenly by 400.\n");
						return false;
					}
					else {
						System.out.println(year + " is a leap year!\n");
						return true;
					}
				}
			}
		}
	}
	
}
