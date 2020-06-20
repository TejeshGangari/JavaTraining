package basics;

public class Student {

	String Name;
	int Age;
	String Collage;
	boolean passOrFail;
	
	Student(){
		System.out.println("Default Constructor");
	}
	
	Student(String Name, int age, String Collage, boolean passOrFail){
		this.Name = Name;
		this.Age = age;
		this.Collage = Collage;
		this.passOrFail = passOrFail;
		System.out.println("Parameterised Constructor");
	}
	
	public void goesToCollage(){
 
	}
	
	public void attemptsExams(){
		
	}

	public String getStudentName(String name) {
		
		return Name;
	}
	
	public void printStudentName() {
		//System.out.print(obj.Name);
		System.out.println(Name);
	}
	
}
