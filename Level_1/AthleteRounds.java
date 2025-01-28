import java.util.Scanner;
class AthleteRounds{
	public double numberOfRounds(double side1, double side2, double side3){
	double distance = 5;
	double perimeter = side1 + side2 + side3;
	double rounds = (distance * 1000) / perimeter;
	return rounds;
	}

	public static void main(String[] args){
	AthleteRounds obj = new AthleteRounds();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first side of the triangle");
	double side1= input.nextDouble();
	System.out.println("Enter second side of the triangle");
	double side2 = input.nextDouble();
	System.out.println("Enter third side of the triangle");
	double side3 = input.nextDouble();
	double round = obj.numberOfRounds(side1, side2, side3);
	System.out.println("The number of rounds to complete 5 km run is " +round);
	}
}
