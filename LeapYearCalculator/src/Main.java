
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear leapChecker = new LeapYear();
		
		leapChecker.isLeapYear(-1600);
		leapChecker.isLeapYear(1600);
		leapChecker.isLeapYear(2017);
		leapChecker.isLeapYear(2000);
		leapChecker.isLeapYear(4600);
		leapChecker.isLeapYear(10600);
		leapChecker.isLeapYear(800);
		leapChecker.isLeapYear(924);
	}

}
