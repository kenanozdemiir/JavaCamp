package HomeWork2;

public class Student extends User {
	String takenCourses;
	int completionRate=0;
	
	Student(int id,String name,String surname,String email,String takenCourses){
		super(id,name,surname,email);
		this.takenCourses=takenCourses;
		
	}
	
	public void signIn() {
		System.out.println("Singning in as a Student.");
	}
	public void workCourse() {
		System.out.println("Working for the course.");
		completionRate+=10;
	}
	
}
