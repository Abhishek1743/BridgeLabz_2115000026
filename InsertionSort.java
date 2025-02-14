import java.util.Scanner;

class InsertionSort{
	
	//Method for Insertion Sort
	void insertionSorting(int[] employeeIDs){
		for(int i=0; i<employeeIDs.length; i++){
			int key = employeeIDs[i];
			int j = i-1;
			while(j>=0 && employeeIDs[j] > key){
				employeeIDs[j+1] = employeeIDs[j];
				j = j - 1;
			}
			employeeIDs[j+1] = key;
		}
	}
	
	//Method to display employee id 
	void displayEmployeeIDs(int[] employeeIDs){
		System.out.print("IDs of employees in ascending order is : ");
		for(int i=0; i<employeeIDs.length; i++){
			System.out.print(employeeIDs[i] +" ");
		}
	}
	
	//Main Method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//creating object
		InsertionSort obj = new InsertionSort();
		
		//Taking input of the number of employees
		System.out.println("Enter the number of employees");
		int employee = input.nextInt();
		
		//creating array of employees
		int[] employeeIDs = new int[employee];
		
		//Taking marks of each student
		for(int i=0; i<employee ; i++){
			System.out.println("Enter the id of employee " +(i+1) +" :");
			employeeIDs[i] = input.nextInt();
		}
		
		//Performing insertion sort
		obj.insertionSorting(employeeIDs);
		
		//displaying employee IDs of employees in ascending order
		obj.displayEmployeeIDs(employeeIDs);
		
	}
}