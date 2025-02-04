class Employee{
	static String companyName = "Capgemini";
	private static int totalEmployee = 0;
	private String name;
	private final int id;
	private String designation;
	
	//Parameterized Constructor
	Employee(String name,int id, String designation){
		this.name = name;
		this.id = id;
		this.designation = designation;
		totalEmployee++;
	}
	
	//Method to total number of employees
	public static int displayTotalEmployees(){
		return totalEmployee;
	}
	
	//Method to display company name
	public static void displayCompanyName(){
		System.out.println("Company name : " +companyName);
	}
	
	//To check and then display the details of the employee
	public void display(){
		if( this instanceof Employee ){
			System.out.println("Object is an instance of Employee Class");
			System.out.println("Details of the employee is : ");
			System.out.println("Name : " +name);
			System.out.println("ID : " +id);
			System.out.println("Designation : " +designation);
			System.out.println();
		} else{
			System.out.println("Object is not an instance of Employee Class");
		}
	}
	
	//Main method
	public static void main(String[] args){
		
		//Creating objects
		Employee EmployeeNumber1 = new Employee("Abhishek", 123, "Senior Developer");
		Employee EmployeeNumber2 = new Employee("Priyanshu", 321, "Full Stack Developer");
		
		//For displaying company name
		displayCompanyName();
		System.out.println();
		
		//Displaying Employee details
		EmployeeNumber1.display();
		System.out.println();
		EmployeeNumber2.display();
		
		System.out.println();
		
		//For displaying total number of employees
		System.out.println("Total Number of Employees are : " +displayTotalEmployees());
	}
}