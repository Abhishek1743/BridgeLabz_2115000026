import java.util.Scanner;
class SumOfNaturalNumberComparision{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the natural number");
		int number = input.nextInt();
		int sum=0, sumResult=0;
		if(number>0){
				sum = ( number * ( number + 1 ))/2;
				while(number!=0){
					sumResult+=number;
					number--;
				}
		}
		if(sum == sumResult){
			System.out.println("The sum of Natural numbers is: " + sum);
		}
	}
}
