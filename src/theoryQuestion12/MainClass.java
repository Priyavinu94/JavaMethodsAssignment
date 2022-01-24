//Question 12: 
//Write a program to update another class variable from the main class 
//and then print the value of updated variable.

package theoryQuestion12;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ExamMarks examMark = new ExamMarks();	//instantiating the class ExamMarks

		System.out.println("Enter the student name : ");
		examMark.setName(sc.next()); // calling setName() to set the name entered by the user

		System.out.println("Enter the subject name");
		examMark.setSubject(sc.next()); // calling setSubject() to set the subject name entered by user

		System.out.println("Enter the subject marks");
		examMark.setMarks(sc.nextFloat()); // calling setMarks() to set the marks entered by user

		System.out.println("Marks scored by " + examMark.getName() + " in " + examMark.getSubject() + " is :	"
				+ examMark.getMarks());		//calling getter methods to get/print the set values

		sc.close();
	}

}
