import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualSumChecker check = new EqualSumChecker();
		Random random = new Random();
		
		int maxTest = 10;
		int randomA = 5;
		int randomB = 5;
		
		for (int i = 0; i < 10; i++) {
			int randomNumber = random.nextInt(maxTest);
			int aRandom = random.nextInt(randomA);
			int bRandom = random.nextInt(randomB);
			
			check.hasEqualSum(aRandom,  bRandom, randomNumber);
		}
		
		
		
		
	}

}
