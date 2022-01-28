//Operations performed: Addition, Subtraction, Multiplication, Division of 2 numbers
// 1. Declare get methods to return result of each operation
// 2. Declare calc methods to perform each operation and calculate the result
// 3. Declare set method to update 2 input values

package calculatorBasic;

public class Operations {

	double firstNum = 0;
	double secNum = 0;
	double sum = 0;
	double difference = 0;
	double product = 0;
	double quotient = 0;

	void printOperationList() {
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
	}

	void setInput(double num1, double num2) {
		firstNum = num1;
		secNum = num2;
	}

	void calcSum(double num1, double num2) {
		sum = num1 + num2;
	}

	void calcDiff(double num1, double num2) {
		difference = num1 - num2;
	}

	void calcProduct(double num1, double num2) {
		product = num1 * num2;
	}

	void calcQuotient(double num1, double num2) {
		quotient = num1 / num2;
	}

	double getSum() {
		return sum;
	}

	double getDiff() {
		return difference;
	}

	double getProduct() {
		return product;
	}

	double getQuotient() {
		return quotient;
	}
}
