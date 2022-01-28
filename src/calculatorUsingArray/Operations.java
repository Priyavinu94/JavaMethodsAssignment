//Operations performed: Addition, Subtraction, Multiplication, Division, PercentageOf on an Array of numbers
// 1. Declare get methods to return result of each operation performed on 2 numbers
// 2. Declare calc methods to perform each operation on 2 numbers at a time and calculate the result 

package calculatorUsingArray;

public class Operations {

	double firstNum = 0;
	double secNum = 0;
	double result = 0;

	void printInstruction() {
		System.out.println("After entering each no, press corresponding key to perform desired operation");
		System.out.println(
				" '+' to Add \n '-' to Subtract \n '*' to Multiply \n '/' to Divide \n " + "'%' to Find Percentage of\n\n");
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
