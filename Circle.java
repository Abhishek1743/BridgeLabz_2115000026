import java.util.Scanner;
public class Circle{
	
	static double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public static double circumferenceCalculation(double radius){
		return 2 * 3.14 * radius;
	}
	
	public static double areaOfCircleCalculation(double radius){
		return 3.14 * Math.pow(radius,2);
	}
	
	
	public void displayResult(double circumference, double area){
		System.out.println("The circumference of the circle is : " +circumference );
		System.out.println("The circumference of the circle is : " +area );
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double radius = input.nextDouble();
		
		Circle obj = new Circle(radius);
		
		double circumference = circumferenceCalculation(radius);
		double area = areaOfCircleCalculation(radius);
		
		obj.displayResult(circumference, area);
	}
}