// Program to instantiate a class having 2 methods: Add 2 numbers & subtract 2 numbers, 
// call these methods in main class, and print them. 
package theoryQuestion8;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// instantiating the class BasicMathOperation
		BasicMathOperation operation = new BasicMathOperation();

		System.out.println("Enter 2 numbers to perform addition & substraction");
		double firstNum = sc.nextDouble();
		double secNum = sc.nextDouble();

		System.out.println("The sum of entered numbers is :  " + operation.addNum(firstNum, secNum));
		System.out.println("The difference of entered numbers is :  " + operation.subtractNum(firstNum, secNum));

		// instantiating the class BasicMathOperation2
		BasicMathOperation2 mathOperation = new BasicMathOperation2();
		
		System.out.println("\n\nUsing getter and setter methods\n");
		mathOperation.setSum(firstNum, secNum);
		mathOperation.setDiff(firstNum, secNum);
		System.out.println("The sum of entered numbers is : " + mathOperation.getSum());
		System.out.println("The difference of entered numbers is : " + mathOperation.getDiff());
		
		sc.close();
	}

}
