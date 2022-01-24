package theoryQuestion12;

public class ExamMarks {
	
	//attributes of the class:
	String studentName = "";
	String subjectName = "";
	float marks = 0;
	
	//setter methods declared for setting values for all the 3 attributes
	void setName(String name) {
		studentName = name;
	}
	
	void setSubject(String sub) {
		subjectName = sub;
	}
	
	void setMarks(float mark) {
		marks = mark;
	}
	
	//getter methods declared for getting the set/updated values of the attributes
	String getName() {
		return studentName;
	}
	
	String getSubject() {
		return subjectName;
	}
	
	float getMarks() {
		return marks;
	}
}
