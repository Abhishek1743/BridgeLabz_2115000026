import java.util.Scanner;
class FactorialRecursion{
	
    public static long factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int getInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        return number;
    }

    public static void displayResult(int number, long result){
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args){
        int number = getInput();
        long result = factorial(number);
        displayResult(number, result);
    }
}