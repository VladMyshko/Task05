package by.epam.javatraining.myshko.controller;

import by.epam.javatraining.myshko.model.OperationsExecutor;
import by.epam.javatraining.myshko.view.ConsoleOut;

public class Controller {

	public static void main(String[] args) {

		int num = 7;

		int a = 4, b = 30;

		ConsoleOut.greatestDigitFinderOutput(OperationsExecutor.greatestDigitFinder(num));
		ConsoleOut.palindromeCheckOutput(OperationsExecutor.palindromeCheck(num));
		ConsoleOut.isSimpleOutput(OperationsExecutor.isSimple(num));
		ConsoleOut.findGreatestCommonFactorOutput(OperationsExecutor.findGreatestCommonFactor(a, b));
		ConsoleOut.findLeastCommonMultipleOutput(OperationsExecutor.findLeastCommonMultiple(a, b));
		ConsoleOut.findNumberOfDifferentDigits(OperationsExecutor.findNumberOfDifferentDigits(num));

	}

}
