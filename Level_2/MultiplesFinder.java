import java.util.Scanner;
class MultiplesFinder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The multiples of " + number + " below 100 are:");
        for (int i=1; i<100; i++) {
            if (i%number == 0){
                System.out.println(i);
            }
        }
    }
}
