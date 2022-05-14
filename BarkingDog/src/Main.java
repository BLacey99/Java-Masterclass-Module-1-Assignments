
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarkingDog badDog = new BarkingDog();
		
		
		badDog.shouldWakeUp(false, 0);
		badDog.shouldWakeUp(true, 8);
		badDog.shouldWakeUp(false, 2);
		badDog.shouldWakeUp(true, 1);
		badDog.shouldWakeUp(true, -1);
		badDog.shouldWakeUp(true, 9);
		badDog.shouldWakeUp(false, 7);
		badDog.shouldWakeUp(true, 4);
		badDog.shouldWakeUp(true, 13);
		badDog.shouldWakeUp(true, 24);
		
	}

}
