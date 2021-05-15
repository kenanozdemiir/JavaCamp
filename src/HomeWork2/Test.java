package HomeWork2;

public class Test {
	
	public static void main(String [] args) {
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor1 = new Instructor(1,"Engin","Demirog","engindemirog@gmail.com","JAVA");
		instructor1.setPassword("instructor1password");
		instructorManager.add(instructor1);
		instructor1.signIn();
		instructor1.startCourse();
		instructor1.finishCourse();
		instructor1.changePassword("instructor1newpassword");
		instructorManager.printInfo(instructor1);
		instructor1.signOut();
		
		System.out.println("****************");
		StudentManager studentManager = new StudentManager();
		Student student1 = new Student (1,"Kenan","Özdemir","kenanozdemiir@gmail.com","JAVA");
		student1.setPassword("student1password");
		student1.signIn();
		student1.workCourse();
		student1.workCourse();
		student1.changePassword("student1newpassword");
		studentManager.takeCourseFrom(instructor1);
		studentManager.printInfo(student1);
		student1.signOut();
		
		
	}

}
