/* 	1. Create a class Employee. 
 * 	2. Set the First Name, Last name and Hourly rate.
 * 	3. Print the first name, last name and rate.
 * 	   (Use get and set method to update and retrieve values)
 * 	4. Add a method to : Calculate & print weekly salary of the person by taking input of no of hours worked
 *                       and multiply it to hourly rate.
 */
package methodsQue1;

public class Employee {

	String firstName = ""; // variable to store the first name of an employee
	String lastName = ""; // variable to store the last name of an employee
	double hourlyPay = 0; // variable to store the hourly pay rate

	void setFirstName(String fName) {
		firstName = fName;
	}

	void setLastName(String lName) {
		lastName = lName;
	}

	void setHourlyPay(double hPay) {
		hourlyPay = hPay;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	double getHourlyPay() {
		return hourlyPay;
	}

	// method to calculate the weekly salary
	void calcWeekPay(double hPay, int noOfHrs) {
		double weeklyPay = hPay * noOfHrs;
		System.out.println("Weekly salary : $" + weeklyPay);
	}
}
