package calculatorUsingArray;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Operations operation = new Operations(); // instantiating Operations class

		System.out.println("Welcome!!  Enter how many numbers to perform calculation");
		int listLength = scanner.nextInt();

		if (listLength < 1) {

			System.out.println("Not a valid entry");

		} else {

			double[] numberList = new double[listLength]; // declare array with length same as count of numbers
			operation.printInstruction(); // gives the user instructions to follow
			boolean isValidOperator = true;

			System.out.print("Enter number 1 :	"); // prompts user to enter 1st number
			numberList[0] = scanner.nextDouble();

			for (int i = 1; i < listLength; i++) {
				String operator = scanner.next(); // prompts user to enter the operation needs to be performed

				System.out.print("Enter number " + (i + 1) + " : 	"); // prompts user to enter 2nd number
				numberList[i] = scanner.nextDouble();

				switch (operator) {

				case "+":
					operation.calcSum(numberList[i - 1], numberList[i]);
					numberList[i] = operation.getResult();
					break;

				case "-":
					operation.calcDiff(numberList[i - 1], numberList[i]);
					numberList[i] = operation.getResult();
					break;

				case "*":
					operation.calcProduct(numberList[i - 1], numberList[i]);
					numberList[i] = operation.getResult();
					break;

				case "/":
					operation.calcQuotient(numberList[i - 1], numberList[i]);
					numberList[i] = operation.getResult();
					break;

				case "%":
					operation.calcPercent(numberList[i - 1], numberList[i]);
					numberList[i] = operation.getResult();
					break;

				default:
					isValidOperator = false;
					break;
				}

				if (!isValidOperator) {
					System.out.println("Invalid operator input after number " + i);
					System.out.println("The result upto valid input = " + numberList[i - 1]);
					break;
				}
			}
			
			if (isValidOperator) {
				System.out.println("\nFinal result of operations = " + numberList[listLength - 1]);
			}
		}

		scanner.close();
	}

}
