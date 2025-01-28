import java.util.Scanner;
class UnitConvertor{
	public static double convertKmToMiles(double km){
		double km2miles = 0.621371 * km;
		return km2miles;
	}
	
	public static double convertMilesToKm(double miles){
		double miles2km = 1.60934 * miles;
		return miles2km;
	}
	
	public static double convertMetersToFeet(double meters){
		double meters2feet = 3.28084 * meters;
		return meters2feet;
	}
	
	public static double convertFeetToMeters(double feet){
		double feet2meters = 0.3048 * feet;
		return feet2meters;
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the km that will be converted into miles: ");
		double km = input.nextDouble();
		System.out.print("\nEnter the miles that will be converted into km: ");
		double miles = input.nextDouble();
		System.out.print("\nEnter the meters that will be converted into feets: ");
		double meters = input.nextDouble();
		System.out.print("\nEnter the feets that will be converted into meters: ");
		double feets = input.nextDouble();
		
		double kmResult = convertKmToMiles(km);
		double milesResult = convertMilesToKm(miles);
		double metersResult = convertMetersToFeet(meters);
		double feetsResult = convertFeetToMeters(feets);
		
		System.out.println( km + " km in miles is " +kmResult + " miles");
		System.out.println( miles + " miles in km is " +milesResult + " kms");
		System.out.println( meters + " meters in feet is " +metersResult + " feets");
		System.out.println(feets + " feets in meters are " +feetsResult + " meters");
	}
}