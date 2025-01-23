import java.util.Scanner;
class BonusOfEmployees{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the salary");
		int salary = input.nextInt();
		System.out.println("Enter the years of service");
		int yearsOfService = input.nextInt();
		if(yearsOfService > 5){
			double bonus = salary * 5;
			System.out.println("The bonus amount is : " +bonus);
		} else{
			System.out.println("Not applicable");
		}
	}
}
