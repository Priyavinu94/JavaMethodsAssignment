package calculator;

public class Operations {

	double result = 0;

	void printInstruction() {
		System.out.println("Welcome!!! Please Enter a number to begin the calculation.");
		System.out.println("After entering each no, press corresponding key to perform desired operation");
		System.out.println(" '+' to Add \n '-' to Subtract \n '*' to Multiply \n '/' to Divide");
		System.out.println(" '%' to Find Percentage of\n '=' to get the resultant of operations");
		System.out.println(" 'C' to Cancel current calculation");
		System.out.println("Application exits if invalid operator is entered.\n\n");
	}

	void exitCase() {
		System.out.println("Current operation stopped.");
		System.out.println("Press Y to exit application.");
		System.out.println("Press N to start new operation.");
	}

	void calcSum(double num1, double num2) {
		result = num1 + num2;
	}

	void calcDiff(double num1, double num2) {
		result = num1 - num2;
	}

	void calcProduct(double num1, double num2) {
		result = num1 * num2;
	}

	void calcQuotient(double num1, double num2) {
		result = num1 / num2;
	}

	void calcPercent(double num1, double num2) {
		result = num1 / 100 * num2;
	}

	double getResult() {
		return result;
	}

}
