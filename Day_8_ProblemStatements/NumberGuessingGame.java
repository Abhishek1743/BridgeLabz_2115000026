import java.util.Scanner;
import java.util.Random;
class NumberGuessingGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int low = 1, high = 100;
        boolean found = false;
        
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");

        while(!found){
            int guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 'H' if my guess is too high, 'L' if it's too low, or 'C' if it's correct.");

            char feedback = input.next().charAt(0);
            
            if (feedback == 'C' || feedback == 'c'){
                System.out.println("I guessed your number correctly! 🎉");
                found = true;
            } else if(feedback == 'H' || feedback == 'h'){
                high = guess - 1;
            } else if(feedback == 'L' || feedback == 'l'){
                low = guess + 1;
            } else{
                System.out.println("Please enter a valid input: 'H', 'L', or 'C'");
            }
        }
    }

    public static int generateGuess(int low, int high, Random random){
        return random.nextInt(high - low + 1) + low;
    }
}
