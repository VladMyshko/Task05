package by.epam.javatraining.myshko.view;

public class ConsoleOut {

	public static final String GREATEST_DIGIT_TEXT = "The greatest digit in number is ";
	public static final String PALINDROME_TEXT = "Is this number a palindrome? - ";
	public static final String IS_SIMPLE_TEXT = "Is your number a simple? -  ";
	public static final String GREATEST_COMMON_FACTOR_TEXT = "The greatest common factor of two numbers is ";
	public static final String LEAST_COMMON_MULTIPLE_TEXT = "The least common multiple of two numbers is ";
	public static final String DIFFERENT_DIGITS_TEXT = "The number of different digits in number is ";

	static public void greatestDigitFinderOutput(int greatestDigit) {

		System.out.println(GREATEST_DIGIT_TEXT + greatestDigit);

	}

	public static void palindromeCheckOutput(boolean palindromeCheck) {
		System.out.println(PALINDROME_TEXT + palindromeCheck);

	}

	public static void isSimpleOutput(boolean isSimple) {
		System.out.println(IS_SIMPLE_TEXT + isSimple);

	}

	public static void findGreatestCommonFactorOutput(int greatestCommonFactor) {
		System.out.println(GREATEST_COMMON_FACTOR_TEXT + greatestCommonFactor);

	}

	public static void findLeastCommonMultipleOutput(int leastCommonMultiple) {
		System.out.println(LEAST_COMMON_MULTIPLE_TEXT + leastCommonMultiple);

	}

	public static void findNumberOfDifferentDigits(int differentDigitsInNum) {
		System.out.println(DIFFERENT_DIGITS_TEXT + differentDigitsInNum);

	}

}
