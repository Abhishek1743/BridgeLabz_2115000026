import java.util.Scanner;
class FactorialFinder2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		int integer = number;
		int factorial = 1;
		if(integer > 0){
			for(int i=integer; i > 0; i--){
			factorial*= i;
			}
		}
	System.out.println("The factorial of the integer " +number + " is " +factorial);
	}
}
