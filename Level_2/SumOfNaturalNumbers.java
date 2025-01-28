import java.util.Scanner;
class SumOfNaturalNumbers{
	public int sumUsingRecursion(int number){
		if(number == 1) return 1;
		else{
			return number + sumUsingRecursion( number - 1 );
		}
		
	}
	
	public int sumUsingFormulae(int number){
		int sum2;
		sum2 = number * (number + 1) / 2;
		return sum2;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		SumOfNaturalNumbers obj = new SumOfNaturalNumbers();
		System.out.print("Enter the natural number : ");
		int number = input.nextInt();
		if(number > 0){
			int sum1 = obj.sumUsingRecursion(number);
			int sum2 = obj.sumUsingFormulae(number);
			if( sum1 == sum2 ){
				System.out.println("Both the results are same " +sum1 + " and " +sum2 );
			}
			else{
				System.out.println("Both the results are not same " +sum1 + " and " +sum2);
			}
		}
	}
}