public class Student{
	static String universityName = "GLA University";
	private String name;
	private final int rollNumber;
	private String grade;
	private static int totalStudents = 0;
	
	//Parameterized Constructor
	Student(String name, int rollNumber, String grade){
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudents++;
	}
	
	//Method to display total number of students
	public static int displayTotalStudents(){
		return totalStudents;
	}
	
	//Method to display the details of the student
	public void display(){
		if(this instanceof Student){
			System.out.println("Object is an instance of the Student class");
			System.out.println("Name : " +name);
			System.out.println("Roll Number : " +rollNumber);
			System.out.println("Grade : " +grade);
			System.out.println();
		} else{
			System.out.println("Object is not an instance of the Student class");
		}
	}
	
	//Main Method
	public static void main(String[] args){
		//Creating objects (or students)
		Student student1 = new Student("Abhishek", 2115000026, "B+");
		Student student2 = new Student("Priyanshu", 15, "A");
		
		//displaying University Name
		System.out.println("University Name : " +universityName);
		System.out.println();
		
		//displaying details of the students
		student1.display();
		student2.display();
		
		//displaying total number of students
		System.out.println("Total number of students are : " +displayTotalStudents());
	}
}