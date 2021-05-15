package Homework;

public class Course {
	int no;
	String name;
	Educator educator;
	
	Course(){
		
	}
	
	Course(int no,String name,Educator educator){
		this.no = no;
		this.name = name;
		this.educator = educator;
		educator.setCourse(this);
	}
	
	public void setEducator(Educator educator) {
		this.educator=educator;
	}
	
	
}
