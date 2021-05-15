package Homework;

public class Educator {
	String name;
	String surname;
	String role;
	Course course;
	
	
	Educator(){
	}
	
	
	Educator(String name,String surname,String role){
		this.name = name;
		this.surname = surname;
		this.role = role;
	
	}
	
	public void setCourse(Course course) {
		this.course = course ;
	}
}
