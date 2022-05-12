import java.util.Random;

public class TestGenerator {

	public static void test() {
		SpeedConverter kmphToMph = new SpeedConverter();
		Random random = new Random();
		long maxSmall = 999;
		long maxMedium = 9999;
		long maxLarge = 99999;

		System.out.println(
				"Generating small distance conversions \n ----------------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			long randomNumber = random.nextLong(maxSmall);

			System.out.println(i+1 + ". " + kmphToMph.toMilesPerHour(randomNumber) + " mph\n");

		}
		System.out.println(
				"Generating Medium distance conversions \n ----------------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			long randomNumber = random.nextLong(maxMedium);

			System.out.println(i+1 + ". " + kmphToMph.toMilesPerHour(randomNumber) + " mph\n");
		}

		System.out.println(
				"Generating Large distance conversions \n ----------------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			long randomNumber = random.nextLong(maxLarge);

			System.out.println(i+1 + ". " + kmphToMph.toMilesPerHour(randomNumber) + " mph\n");
		}
	}
}
