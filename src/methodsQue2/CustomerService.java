/* 	1. Create a class CustomerService with 3 variables : Name, Email and Address
 * 	2. Initialize these variables with the below values :
 *        Name = John , Email = john@gmail.com , Address = 100 queen street
 * 	3. Write code to update these values from main class. 
 */
package methodsQue2;

public class CustomerService {

	String customName = "John";
	String customEmail = "john@gmail.com";
	String customAddress = "100 Queen Street";
	
	void setName(String name) {
		customName = name;
	}
	
	void setEmail(String email) {
		customEmail = email;
	}
	
	void setAddress(String address) {
		customAddress = address;
	}
	
	String getName() {
		return customName;
	}
	
	String getEmail() {
		return customEmail;
	}
	
	String getAddress() {
		return customAddress;
	}
}
