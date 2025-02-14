import java.util.Scanner;
class SelectionSort{
	
	//Method for Selection Sort
	public void selectionSort(int[] scores){
		for(int i=0; i < scores.length-1; i++){
			int minIndex = i;
			for(int j=i+1; j<scores.length; j++){
					if (scores[j] < scores[minIndex]){
						minIndex = j;
					}
				}
			int temp = scores[minIndex];  
			scores[minIndex] = scores[i];
			scores[i] = temp;
		}			
	}
	
	//Method to display scores in ascending order
	public void display(int[] scores){
		System.out.println("Scores of students in ascending order are: ");
		for(int i=0; i<scores.length; i++){
			System.out.print(scores[i] + " ");
		}
	}
	
	//Main method
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		//creating object
		SelectionSort obj = new SelectionSort();
		
		//Taking input of the number of students
		System.out.println("Enter the number of students");
		int students = input.nextInt();
		
		//initializing an array of size students
		int[] scores = new int[students];
		
		//Taking scores of each student
		for(int i=0; i<students; i++){
			System.out.println("Enter the score of student " +(i+1) + " : ");
			scores[i] = input.nextInt();
		}
		
		//Performing Selection sort
		obj.selectionSort(scores);
		
		//displaying scores in ascending order
		obj.display(scores);
		
	}
}