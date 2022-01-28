package calculatorBasic;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Operations operation = new Operations();

		System.out.println("Enter two numbers : ");
		double numOne = scanner.nextDouble();
		double numTwo = scanner.nextDouble();
		operation.setInput(numOne, numTwo);

		System.out.println("Choose an operation to perform ");
		operation.printOperationList();
		String choice = scanner.next();

		switch (choice) {

		case "1":
		case "Addition":
			operation.calcSum(numOne, numTwo);
			System.out.println("Sum of entered numbers is : " + operation.getSum());
			break;
			
		case "2":
		case "Subtraction":
			operation.calcDiff(numOne, numTwo);
			System.out.println("Difference of entered numbers is : " + operation.getDiff());
			break;
			
		case "3":
		case "Multiplication":
			operation.calcProduct(numOne, numTwo);
			System.out.println("Sum of entered numbers is : " + operation.getProduct());
			break;
			
		case "4":
		case "Division":
			operation.calcQuotient(numOne, numTwo);
			System.out.println("Sum of entered numbers is : " + operation.getQuotient());
			break;
			
		default:
			System.out.println("Not a valid choice");
		}
		
		scanner.close();
	}

}
