package calculator;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Operations operation = new Operations();

		operation.printInstruction();
		double[] number = new double[2]; 
		//two element array, index 0 stores first element, index 1 stores 2nd element
		//the resultant of operations performed gets stored at index 0 next.. and so on..
		
		boolean isValidOperator = true;	//variable to store the condition being checked to enter into loop

		System.out.println("Enter a number to begin");
		number[0] = scanner.nextDouble();	//first user input number gets stored in the array at index 0
		int index = 1; // variable to denote index of array

		String operator = scanner.next();	//first user input operator
		
		//check if the operator is valid and stores the boolean value. if true, enters loop and gets second input
		isValidOperator = operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")
				|| operator.equals("%") || operator.equals("=") || operator.equals("C");

		Loop: while (isValidOperator) { //loop is labelled inorder to exit the loop from switch case when needed.

			if (index != 0) { //first element already stored in index 0.

				switch (operator) {

				case "+":
					number[1] = scanner.nextDouble();	//gets 2nd number input
					operation.calcSum(number[0], number[1]); //performs operation
					number[0] = operation.getResult(); //resultant in each case gets stored at index 0
					break;

				case "-":
					number[1] = scanner.nextDouble();
					operation.calcDiff(number[0], number[1]);
					number[0] = operation.getResult();
					break;

				case "*":
					number[1] = scanner.nextDouble();
					operation.calcProduct(number[0], number[1]);
					number[0] = operation.getResult();
					break;

				case "/":
					number[1] = scanner.nextDouble();
					operation.calcQuotient(number[0], number[1]);
					number[0] = operation.getResult();
					break;

				case "%":
					number[1] = scanner.nextDouble();
					operation.calcPercent(number[0], number[1]);
					number[0] = operation.getResult();
					break;

				case "=":
					System.out.println("Final result is : " + number[0]);
					break Loop; //exits from the loop

				case "C":
					System.out.println("Final result is : " + number[0]);
					operation.exitCase();

					String choice = scanner.next();
					if (choice.equals("Y")) {
						break Loop;
					} else {
						System.out.println("\nEnter a number to begin");
						number[0] = scanner.nextDouble();
					}
					break;

				default:
					isValidOperator = false;
					break Loop;
				}
			}
			operator = scanner.next();
		}
		if (!isValidOperator) {
			System.out.println("Invalid operator");
			System.out.println("The result upto valid input = " + number[0]);
			operation.exitCase();
		}
	}
}
