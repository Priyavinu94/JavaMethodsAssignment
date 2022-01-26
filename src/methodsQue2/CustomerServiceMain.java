package methodsQue2;

import java.util.Scanner;

public class CustomerServiceMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		CustomerService custService = new CustomerService();
		
		//updating the variables by the values entered by user
		System.out.println("Enter the name of the customer : ");
		custService.setName(scan.nextLine());

		System.out.println("Enter the email id : ");
		custService.setEmail(scan.nextLine());

		System.out.println("Enter the current address : ");
		custService.setAddress(scan.nextLine());
		
		//printing the updated values by calling getter methods
		System.out.println("\n\nValidate the Customer details entered\n");
		System.out.println("Customer Name : " + custService.getName());
		System.out.println("Customer Email id : " + custService.getEmail());
		System.out.println("Customer Address : " + custService.getAddress());
		
		scan.close();
	}

}
