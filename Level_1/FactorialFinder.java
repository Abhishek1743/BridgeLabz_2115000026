import java.util.Scanner;
class FactorialFinder{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		int integer = number;
		int factorial = 1;
		if(number > 0){
			while(number > 0){
			factorial*= number;
			number--;
			}
		}
	System.out.println("The factorial of the integer " +integer + " is " +factorial);
	}
}
