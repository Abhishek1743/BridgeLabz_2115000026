import java.util.Scanner;
class LeapYearChecker{
	public int leapYear(int year){
		if( year >= 1582 ){
			if(year%4 == 0 && year%100 != 0 || year%400 == 0){
				return 1;
			}
			else{
				return 0;
			}
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		LeapYearChecker obj = new LeapYearChecker();
		System.out.print("Enter the year : ");
		int year = input.nextInt();
		int yearCheck = obj.leapYear(year);
		if (yearCheck == 1){
			System.out.println("The year " +year + " is a leap year");
		}
		else{
			System.out.println("The year " +year + " is not a leap year");
		}
	}
}