import java.util.Scanner;
class AthleteRounds{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the length of side 1 (in meters): ");
      double side1 = input.nextDouble();
      System.out.print("Enter the length of side 2 (in meters): ");
      double side2 = input.nextDouble();
      System.out.print("Enter the length of side 3 (in meters): ");
      double side3 = input.nextDouble();
      double perimeter = side1 + side2 + side3;
      double targetDistance = 5 * 1000;
      double rounds = targetDistance / perimeter;
      System.out.println("\nThe total number of rounds the athlete will run to complete 5 km is " + rounds);
	}
}
