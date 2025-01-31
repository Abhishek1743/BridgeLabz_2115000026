import java.util.Scanner;
class Employee{

	static String name;
	static int id;
	static int salary;

	Employee(String name, int id, int salary){
	this.name = name;
	this.id = id;
	this.salary = salary;
	}

	public void displayDetails(){
		System.out.println("Name of the Employee is : " +name);
		System.out.println("Id of the Employee is : " +id);
		System.out.println("Salary of the Employee is : " +salary);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Name of the Employee : ");
		String name = input.nextLine();
		System.out.println("Enter Employee Id of the Employee : ");
		int employeeId = input.nextInt();
		System.out.println("Enter Employee Salary : ");
		int salary = input.nextInt();

		Employee obj = new Employee(name, employeeId, salary);
		obj.displayDetails();
	}
}
