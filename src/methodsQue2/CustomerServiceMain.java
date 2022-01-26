package methodsQue2;

import java.util.Scanner;

public class CustomerServiceMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		CustomerService custService = new CustomerService();
		
		custService.customName = "John";
		custService.customEmail = "john@gmail.com";
		custService.customAddress = "100 Queen Street";
		
		System.out.println("Customer Details : \n");
		System.out.println("Customer Name : " + custService.getName());
		System.out.println("Customer Email id : " + custService.getEmail());
		System.out.println("Customer Address : " + custService.getAddress());
		
		System.out.println("\n\nPlease provide the details which needs to be updated\n");
		//updating the variables by the values entered by user
		System.out.println("Enter the name of the customer : ");
		custService.setName(scan.nextLine());
		String newName = custService.getName();

		System.out.println("Enter the email id : ");
		custService.setEmail(scan.nextLine());
		String newEmail = custService.getEmail();

		System.out.println("Enter the current address : ");
		custService.setAddress(scan.nextLine());
		String newAddress = custService.getAddress();
		
		//printing the updated values by calling getter methods
		System.out.println("\n\nValidate the updated Customer details\n");
		System.out.println("Customer Name : " + newName);
		System.out.println("Customer Email id : " + newEmail);
		System.out.println("Customer Address : " + newAddress);
		
		scan.close();
	}

}
