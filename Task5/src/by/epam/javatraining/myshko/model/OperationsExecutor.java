package by.epam.javatraining.myshko.model;

final public class OperationsExecutor {

	public static int greatestDigitFinder(int num) {

		int maxNum = 0;

		if (num > 0) {
			while (num > 0) {
				if (num % 10 > maxNum) {
					maxNum = num % 10;
				}
				num /= 10;
			}
		} else {
			return -1;
		}

		return maxNum;
	}

	public static boolean palindromeCheck(int num) {

		int inverseNum = 0;
		int temp = num;
		while (temp > 0) {
			inverseNum = inverseNum * 10 + temp % 10;
			temp /= 10;
		}

		return num == inverseNum;

	}

	public static boolean isSimple(int num) {

		if (num == 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

	static public int findGreatestCommonFactor(int a, int b) {

		if (a <= 0 || b <= 0) {
			return -1;
		}

		while (true) {
			if (a == b) {
				break;
			}
			if (a < b) {
				a = a + b;
				b = a - b;
				a = a - b;

			}

			a = a - b;

		}

		return a;
	}

	static public int findLeastCommonMultiple(int a, int b) {

		if (a <= 0 || b <= 0) {
			return -1;
		}

		int leastCommonMultiple = a / findGreatestCommonFactor(a, b) * b;

		return leastCommonMultiple;
	}

	static public int findNumberOfDifferentDigits(int num) {

		if (num <= 0) {
			return -1;
		}

		int temp = 0;
		int count = 0;
		while (num > 0) {
			temp |= (1 << (num % 10));
			num /= 10;
		}
		while (temp > 0) {
			count += temp & 1;
			temp >>= 1;
		}
		return count;
	}

}
