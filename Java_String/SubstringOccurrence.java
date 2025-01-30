import java.util.Scanner;
class SubstringOccurrence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine().toLowerCase();
        System.out.print("Enter the substring: ");
        String substring = sc.nextLine().toLowerCase();
        
        System.out.println("The substring occurs " + countOccurrences(mainString, substring) + " times.");
    }

    public static int countOccurrences(String mainStr, String subStr){
        int count = 0;
        for (int i=0; i <= mainStr.length() - subStr.length(); i++){
            int j;
            for (j=0; j < subStr.length(); j++){
                if (mainStr.charAt(i + j) != subStr.charAt(j)){
                    break;
                }
            }
            if (j == subStr.length()){
                count++;
            }
        }
        return count;
    }
}
