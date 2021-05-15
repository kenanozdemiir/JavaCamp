package HomeWork2;

public class Instructor extends User {
	String  givenCourses;
	
	Instructor(int id,String name,String surname,String email,String givenCourses){
		super(id,name,surname,email);
		this.givenCourses=givenCourses;
	}
		
	public void signIn() {
		System.out.println("Logging in as an instructor...");
	}
	
	public void startCourse() {
		System.out.println(givenCourses + " course started.");
		
	}
	public void finishCourse() {
		System.out.println(givenCourses + " course finished.");
	}
}
