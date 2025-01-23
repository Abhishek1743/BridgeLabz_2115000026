import java.util.*;
class ArmstrongNumberChecker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        int originalNumber = number;
        while (originalNumber!= 0) {
            int remainder= originalNumber % 10;
            sum+= Math.pow(remainder,3);
            originalNumber= originalNumber/10;
        }
        if (sum==number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
	}
}
