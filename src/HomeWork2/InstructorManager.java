package HomeWork2;

public class InstructorManager {
	
	public void printInfo(Instructor instructor) {
		System.out.println("Instructor's name: " + instructor.name);
		System.out.println("Instructor's surname: " + instructor.surname);
		System.out.println("Instructor's e-mail: " + instructor.email);
		System.out.println("Instructor's course: " + instructor.givenCourses);
		
	}
	
	public void add(Instructor instructor) {
		System.out.println(instructor.name + " added to the system.");
	}
	
	
		


	
}
