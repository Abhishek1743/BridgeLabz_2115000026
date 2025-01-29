import java.util.Scanner;
class FibonacciSequenceGenerator{
	public void fibonacciSeries(int limit){
		int num1 = 0, num2 = 1;
		int sum = num1 + num2;
		
		printFibonacci(num1);
		printFibonacci(num2);
		
		for(int i=2; i < limit; i++){	
			sum = sum + num1;
			num1 = num2;
			num2 = sum;
			printFibonacci(sum);
		}
	}
	
	public void printFibonacci(int sum){
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		FibonacciSequenceGenerator obj = new FibonacciSequenceGenerator();
		
		System.out.print("Enter the limit of the number : ");
		int limit = input.nextInt();
		
		obj.fibonacciSeries(limit);
		
	}
}