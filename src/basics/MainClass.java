package basics;

//Student Management System
//Create Student 
public class MainClass {
	public static void main(String[] args) {
		Student s1 = new Student(); //Student Object
		s1.Name = "Vinod";
		s1.Age =  31;
		s1.Collage = "VZ";
		s1.passOrFail = true;
		
		Student s2 = new Student("Naresh", 30, "Ongole", true);
		
	}
	
}
