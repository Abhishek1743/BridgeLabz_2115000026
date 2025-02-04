public class Patient{
	static String hospitalName = "AIMS DELHI";
	private static int totalPatients = 0;
	private String name;
	private int age;
	private String ailment;
	private final int patientID;
	
	//Parameterized Constructor
	Patient(String name, int age, String ailment, int patientID){
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientID = patientID;
		totalPatients++;
	}
	
	//method to get total number of patients
	public static int getTotalPatients(){
		return totalPatients;
	}
	
	//method to display the details of the patients
	public void display(){
		if(this instanceof Patient){
			System.out.println("Object is an instance of the Patient class");
			System.out.println("Name : " +name);
			System.out.println("Age : " +age);
			System.out.println("Ailment : " +ailment);
			System.out.println("Patient ID : " +patientID);
			System.out.println();
		} else{
			System.out.println("Object is not an instance of the Patient class");
			System.out.println();
		}
	}
	
	//Main Method
	public static void main(String[] args){
		
		//creating objects (or patients)
		Patient patient1 = new Patient("Abhishek", 21, "Viral", 1234567);
		Patient patient2 = new Patient("Aditya", 21, "Asthma", 7654321);
		
		//Displaying Hospital Name
		System.out.println("Hospital Name : " +hospitalName);
		System.out.println();
		
		//Displaying Patient Details
		patient1.display();
		patient2.display();
		
		//Displaying total number of patients
		System.out.println("Total Number of patients : " +totalPatients);
	}
}