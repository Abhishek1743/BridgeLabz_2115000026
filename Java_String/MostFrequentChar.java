import java.util.Scanner;
public class MostFrequentChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + result + "'");
    }

    public static char findMostFrequentCharacter(String str){
        int[] frequency = new int[256];
        
        for(int i = 0; i < str.length(); i++){
            frequency[str.charAt(i)]++;
        }
       
        char mostFrequentChar = ' ';
        int maxFrequency = 0;
       
        for(int i = 0; i < 256; i++){
            if (frequency[i] > maxFrequency){
                mostFrequentChar = (char) i;
                maxFrequency = frequency[i];
            }
        }
        return mostFrequentChar;
    }
}
