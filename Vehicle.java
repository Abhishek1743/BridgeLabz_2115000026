import java.util.Scanner;
public class Vehicle{
	static int registrationFee = 10000;
	private String ownerName;
	private String vehicleType;
	private final String registrationNumber;
	
	//Parameterized Constructor
	Vehicle(String ownerName, String vehicleType, String registrationNumber){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}
	
	//Method to update the registration fee
	public static void updateRegistrationFee(int newRegistrationFee){
		registrationFee = newRegistrationFee;
	}
	 //Method to display Vehicle details
	public void display(){
		if( this instanceof Vehicle){
			System.out.println("Object is an instance of the Vehicle class");
			System.out.println("Owner Name : " +ownerName);
			System.out.println("Vehicle Type : " +vehicleType);
			System.out.println("Registration Number : " +registrationNumber);
			System.out.println("Registration Fee : " +registrationFee);
			System.out.println();
		} else{
			System.out.println("Object is not an instance of the Vehicle class");
		}
	}
	
	//Main Method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//creating objects (or cars)
		Vehicle vehicle1 = new Vehicle("Abhishek", "Sports Car", "UP85A0001");
		Vehicle vehicle2 = new Vehicle("Priyanshu", "Muscle Car", "UP85A0002");
		
		//displaying vehicle details before updating the registration fee
		vehicle1.display();
		vehicle2.display();
		
		//Updating the registration fee
		System.out.println("Enter the new Registration fee : ");
		int newRegistrationFee = input.nextInt();
		updateRegistrationFee(newRegistrationFee);
		System.out.println();
		
		//displaying vehicle details after updating the registration fee
		System.out.println("New details after updating the registration fee : ");
		vehicle1.display();
		vehicle2.display();
	}
}