import java.util.Scanner;
class UnitConvertor2{
	public static double convertYardsToFeet(double yards){
		double yards2feet = 3 * yards;
		return yards2feet;
	}
	
	public static double convertFeetToYards(double feet){
		double feet2yards = 0.333333 * feet;
		return feet2yards;
	}
	
	public static double convertMetersToFeet(double meters){
		double meters2inches = 39.3701 * meters;
		return meters2inches;
	}
	
	public static double convertInchesToMeters(double inches){
		double inches2meters = 0.0254 * inches;
		return inches2meters;
	}
	
	public static double convertInchesToCm(double inches){
		double inches2cm = 2.54 * inches;
		return inches2cm;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the yards that will be converted into feets: ");
		double yards = input.nextDouble();
		System.out.print("\nEnter the feet that will be converted into yards: ");
		double feet = input.nextDouble();
		System.out.print("\nEnter the meters that will be converted into inches: ");
		double meters = input.nextDouble();
		System.out.print("\nEnter the inches that will be converted into meters: ");
		double inches = input.nextDouble();
		System.out.print("\nEnter the inches that will be converted into cm: ");
		double feets = input.nextDouble();
		
		double yardsResult = convertYardsToFeet(yards);
		double feetResult = convertFeetToYards(feet);
		double metersResult = convertMetersToFeet(meters);
		double inches2metersResult = convertInchesToMeters(inches);
		double inches2cmResult = convertInchesToCm(inches);
		
		System.out.println( yards + " yards in feet is " +yardsResult + " feet");
		System.out.println( feet + " feet in km is " +feetResult + " yards");
		System.out.println( meters + " meters in feet is " +metersResult + " feets");
		System.out.println(feets + " feets in meters are " +inches2metersResult + " meters");
		System.out.println(feets + " feets in cm is " +inches2cmResult + " cm");
	}
}