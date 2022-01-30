package depositMoney;

import java.util.Scanner;

public class DepositMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Deposit deposit = new Deposit();

		System.out.println("Welcome!!! Enter 'Y' to Deposit , 'N' to Exit");
		String choice = sc.next();

		if (choice.equals("Y")) {
			
			System.out.println("Enter the amount needs to be deposited");
			deposit.setDepositAmt(sc.nextDouble());
			double depositAmount = deposit.getDepositAmt();

			System.out.println("1. Insert your card OR Enter the card number");
			System.out.println("2. Enter your 4 digit PIN");

			deposit.setCardNum(sc.next());
			String accessCardNo = deposit.getCardNum();

			deposit.setPin(sc.nextInt());
			int pinNumber = deposit.getPinNum();

			double initialBalance = deposit.getBalance();
			double newBalance = deposit.depositMoney(depositAmount, accessCardNo, pinNumber);

			if (initialBalance < newBalance) {
				System.out.println("You deposited $" + deposit.getDepositAmt());
				System.out.println("New Account balance is :  $" + newBalance);
			} else {
				System.out.println("Request is declined. Invalid Card No or Invalid PIN. Please try again..");
			}

		}

		sc.close();
	}

}
