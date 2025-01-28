import java.util.Scanner;
class SimpleInterestCalculator{
	public double SimpleInterest(double principal, double rate, double time){
		double simpleInterest = ( principal * rate * time )/100;
		return simpleInterest;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		SimpleInterestCalculator obj = new SimpleInterestCalculator();
		System.out.println("Enter the principal");
		double principal = input.nextDouble();
		System.out.println("Enter the rate");
		double rate = input.nextDouble();
		System.out.println("Enter the time");
		double time = input.nextDouble();
		double interest = obj.SimpleInterest(principal, rate, time);
		System.out.println(" The Simple Interest is " +interest + " for Principal " +principal + ", Rate of Interest " +rate + " and Time " +time);
	}
}
