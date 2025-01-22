import java.util.Scanner;
class WeightConversion{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the weight in pounds: ");
      double weightInPounds=input.nextDouble();
      double conversionFactor=2.2;
      double weightInKilograms=weightInPounds * conversionFactor;
      System.out.println("\nThe weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms);
	}
}
