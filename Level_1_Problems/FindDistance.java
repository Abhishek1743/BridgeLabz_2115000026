import java.util.Scanner;
class FindDistance{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
	System.out.println("Distance in feet is "+distanceInFeet+" while in yards is "+distanceInYards+" and in miles is "+distanceInMiles);
	}
}
