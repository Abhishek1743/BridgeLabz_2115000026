import java.util.Scanner;
class LeapYearChecker{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = input.nextInt();

		//part 1 : using multiple if else statements
		if( year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					System.out.println("The year " +year + " is a leap year");
				}
				else{
					System.out.println("The year " +year + " is not a leap year");
				}
			} else{
				System.out.println("The year " +year + " is a leap year");
			}
		}
		else{
			System.out.println("The year " +year + " is not a leap year");
		}

		//part 2 : using only one if statement and multiple logical
		if( (year%4==0 && year%100!=0) || year%400==0){
			System.out.println("The year " +year + " is a leap year");
		}
	}
}
