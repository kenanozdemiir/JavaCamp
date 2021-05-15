package HomeWork2;

public class StudentManager {
	
	public void printInfo(Student student) {
		System.out.println("Student's name: " + student.name);
		System.out.println("Student's surname: " + student.surname);
		System.out.println("Student's e-mail: " + student.email);
		System.out.println("Student's course: " + student.takenCourses);
		System.out.println("Student completed " + student.completionRate +"% of the course." );
	}
	
	public void takeCourseFrom(Instructor instructor) {
		System.out.println("Enrolled in " + instructor.givenCourses);
		
	}

}
