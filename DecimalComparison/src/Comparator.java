
public class Comparator {

	public static void equalByThreePlaces(double a, double b) {

		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);

		System.out.println(a1 + " is the first number. " + b1 + " is the second number.\n");

		int indexA = a1.indexOf('.');
		String[] partsA = { a1.substring(0, indexA), a1.substring(indexA) };

		String lengthCheckerA = partsA[1];
		String preDecimalA = partsA[0];

		int indexB = b1.indexOf('.');
		String[] partsB = { b1.substring(0, indexB), b1.substring(indexB) };

		String lengthCheckerB = partsB[1];
		String preDecimalB = partsB[0];

		if (a1.equals(b1)) {
			System.out.println("These values are equal for up to 3 decimal places"
					+ "\n-------------------------------------------------------------\n");
		}

		else if (!(preDecimalA.equals(preDecimalB))) {
			System.out.println("These values are not equal for up to 3 decimal places"
					+ "\n-------------------------------------------------------------\n");
		}
		
		else if(preDecimalA.equals(preDecimalB) && (lengthCheckerA.length()<4||lengthCheckerB.length()<4)) {
			System.out.println("These values are not equal for up to 3 decimal places"
					+ "\n-------------------------------------------------------------\n");
		}

		else if (preDecimalA.equals(preDecimalB) && (lengthCheckerA.length() >= 4 && lengthCheckerB.length() >= 4)) {

			String decimalCruncherA = partsA[1];
			String[] cruncherA = { decimalCruncherA.substring(0, 4), decimalCruncherA.substring(4) };
			String trimmedA = partsA[0] + cruncherA[0];
			System.out.println("Trimmed value of A: " + trimmedA);

			String decimalCruncherB = partsB[1];
			String[] cruncherB = { decimalCruncherB.substring(0, 4), decimalCruncherB.substring(4) };
			String trimmedB = partsB[0] + cruncherB[0];
			System.out.println("Trimmed value of B: " + trimmedB);

			if (trimmedA.equals(trimmedB)) {
				System.out.println("These values are equal for up to 3 decimal places.\n"
						+ "\n-------------------------------------------------------------\n");

			} else {
				System.out.println("These values are not equivalent within the first 3 decimal places.\n"
						+ "\n-------------------------------------------------------------\n");
			}
		}
	}

}
