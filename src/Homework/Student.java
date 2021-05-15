package Homework;

public class Student {
	String name;
	Course courseTaken;
	int completionRate=0;
	
	Student (String name){				
		this.name = name;
	}
	
	Student(String name,Course courseTaken){		////Alacaðý kursu istersek constructor oluþtururken verebiliriz.
		this.name = name;
		this.courseTaken = courseTaken;
	}
	
	public void getCourse(Course courseTaken) {			//Alacaðý kursu istersek nesne üzerinden metot çaðýrarak verebiliriz.
		this.courseTaken = courseTaken;
		
	}
	
	
	
	public void work() {
		System.out.println(this.name + " is studying on " + this.courseTaken.name);
		System.out.println(this.name + " has completed %" + this.completionRate + " of the " + this.courseTaken.name);
		
		this.completionRate+=25;
		if (this.completionRate==100) {
			System.err.println("Congrulations.You finished the course!!!");
		}
	}
	

	
	public void getStudentInfo() {
		System.out.println("Student's name: " + this.name);
		System.out.println("Student's course: " + this.courseTaken.name);
		System.out.print("Student's completion rate: %"); System.err.print(this.completionRate);
		System.out.println();
		
	}
	

}
