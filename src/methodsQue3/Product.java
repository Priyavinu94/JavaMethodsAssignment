/* 	1. Initialize 3 variables : Product name, Product description, Product price
 * 	2. Write methods which just prints these values and call it from main class. 
 *     (No sys out commands should be present in main class)
 */
package methodsQue3;

public class Product {
	
	String prodName = "Crock-Pot Digital Slow Cooker 4-qt";
	String prodDescription = "Features one touch controls and countdown timer\n"
			+ "Automatically keeps food warm\n"
			+ "See through tempered glass lid\n"
			+ "Easy to clean, dishwasher safe stoneware";
	double prodPrice = 39.99;

	void printName() {
		System.out.println("Product details\n\nName :	" + prodName);
	}
	void printDescription() {
		System.out.println("\nDescription :\n" + prodDescription);
	}
	void printPrice() {
		System.out.println("\nPrice :	$" + prodPrice);
	}
}
