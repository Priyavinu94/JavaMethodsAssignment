package methodsQue1;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Enter the employee details below: ");
		System.out.print("First name : 	");
		employee.setFirstName(scan.next());
		System.out.print("Last name : 	");
		employee.setLastName(scan.next());

		String empName = employee.getFirstName() + " " + employee.getLastName();

		System.out.print("Hourly Pay : 	");
		employee.setHourlyPay(scan.nextDouble());

		System.out.print("Total number of hours worked in a week : ");
		int totalHours = scan.nextInt();

		System.out.println("\n\nEmployee Name : " + empName);
		
		// calling method without saving return value in a variable
		System.out.println("Hourly pay    : $" + employee.getHourlyPay());
		
		//calling method to calculate and print the weekly salary
		employee.calcWeekPay(totalHours);

		scan.close();

	}

}
