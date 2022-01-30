package depositMoney;

public class Deposit {

	String cardNumber = "8976132745615646";
	String cardNum ="";
	int pinNumber = 5646;
	int pinNum = 0;
	double balance = 4647.78;
	double depAmount = 0;

	boolean validateCard(String cardNo, int pinNo) {

		if (cardNo.equals(cardNumber) && pinNo == pinNumber) {
			return true;
		}
		return false;
	}

	void setDepositAmt(double amount) {
		depAmount = amount;
	}

	double getDepositAmt() {
		return depAmount;
	}

	void setCardNum(String cardNo) {
		cardNum = cardNo;
	}

	String getCardNum() {
		return cardNum;
	}
	
	void setPin(int pinNo) {
		pinNum = pinNo;
	}

	int getPinNum() {
		return pinNum;
	}
	
	double getBalance() {
		return balance;
	}
	
	double depositMoney(double depositAmt, String cardNo, int pinNo) {

		if (validateCard(cardNo, pinNo)) {
			balance += depositAmt;
		} 
		return balance;
	}
}
