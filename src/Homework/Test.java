package Homework;

public class Test {
	
	public static void main(String [] args) {
		
		Educator educator1 = new Educator("Engin","Demirog","C# .Net developer");
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� C#",educator1);
		
		Student student1 = new Student("Kenan �zdemir");
		
		
		
		student1.getCourse(course1);
		student1.work();
		System.out.println();
		student1.work();
		System.out.println();
		student1.getStudentInfo();
		
		System.out.println();
		
		
		
		Educator educator2 = new Educator("Mustafa Murat","Co�kun","Java");
		
		Course course2 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� Java",educator2);
		
		Student student2 = new Student("Ay�en Akbal",course2);
		
		
		student2.work();
		System.out.println();
		student2.work();
		System.out.println();
		student2.work();
		System.out.println();
		student2.work();
		System.out.println();
		student2.getStudentInfo();
	}

}
