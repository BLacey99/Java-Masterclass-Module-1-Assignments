
public class SpeedConverter {

	long value;

	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour < 0) {
			System.out.println("-1, Invalid Value");
			return -1;
		} else if (kilometersPerHour > 0) {
			long value = (long) (kilometersPerHour / 1.609);
			long roundedValue = Math.round(value);
			System.out.println(kilometersPerHour + " km/h = " + roundedValue + " mi/h.");
			return roundedValue;

		} else {
			System.out.println("Error");
			System.out.println("-1");
			return -1;
		}
	}


}
