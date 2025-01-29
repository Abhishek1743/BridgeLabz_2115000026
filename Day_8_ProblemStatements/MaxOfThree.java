import java.util.Scanner;
class MaxOfThree{
    public int getInput(){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}
	
	public int MaxValue(int number1, int number2, int number3){
		return Math.max(number1, Math.max(number2, number3));
	}
	
	public static void main(String[] args){
		MaxOfThree obj = new MaxOfThree();
		
		System.out.println("Enter first number : ");
		int number1 = obj.getInput();
		System.out.println("Enter second number : ");
		int number2 = obj.getInput();
		System.out.println("Enter third number : ");
		int number3 = obj.getInput();
		
		int result = obj.MaxValue(number1, number2, number3);
		System.out.println("The maximum number out of three is : " +result);
	}
}