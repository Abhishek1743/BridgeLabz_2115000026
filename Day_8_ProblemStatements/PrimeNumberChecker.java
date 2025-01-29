import java.util.Scanner;
class PrimeNumberChecker{
	
	public boolean PrimeCheck(int number){
		int count=0;
		for(int i=2; i<=number/2; i++){
			if(number%i == 0){
				count++;
			}
			if(count > 0) return false;
		}
		return true;
	}
	
	public void Result(boolean result){
		if (result == true) System.out.println("The given number is Prime ");
		else System.out.println("The given number is not Prime ");
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		PrimeNumberChecker obj = new PrimeNumberChecker();
		
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		
		boolean result = obj.PrimeCheck(number);
		obj.Result(result);
	}
}