import java.util.Scanner;
class RocketLaunchCountdown2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch!");
    }
}
