import java.util.Scanner;

class BubbleSort{
	
	//Method for Bubble Sort
	void bubbleSorting(int[] marks){
		for(int i=0; i<marks.length-1; i++){
			for(int j=0; j<marks.length - i - 1; j++){
				if(marks[j] > marks[j+1]){
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}
	}
	
	//Method to display marks
	void displayMarks(int[] marks){
		System.out.print("Marks of Student in ascending order is : ");
		for(int i=0; i<marks.length; i++){
			System.out.print(marks[i] +" ");
		}
	}
	
	//Main Method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//creating object
		BubbleSort obj = new BubbleSort();
		
		//Taking input of the number of students
		System.out.println("Enter the number of students");
		int students = input.nextInt();
		
		//creating array of marks
		int[] marks = new int[students];
		
		//Taking marks of each student
		for(int i=0; i<students ; i++){
			System.out.println("Enter the marks of student " +(i+1) +" :");
			marks[i] = input.nextInt();
		}
		
		//Performing bubble sort
		obj.bubbleSorting(marks);
		
		//displaying marks of students in ascending order
		obj.displayMarks(marks);
		
	}
}