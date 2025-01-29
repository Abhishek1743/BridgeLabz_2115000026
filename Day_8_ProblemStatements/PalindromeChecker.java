import java.util.Scanner;
class PalindromeChecker{
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int left = 0, right = str.length()-1;
        
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
	
	public String inputString(){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
		String input = sc.nextLine();
		return input;
	}
	
	public void printResult( String str){
		if(isPalindrome(str)){
            System.out.println("\"" +str + "\" is a palindrome.");
        } else{
            System.out.println("\"" +str + "\" is not a palindrome.");
        }
	}

    public static void main(String[] args){
		PalindromeChecker obj = new PalindromeChecker();
		
		String str = obj.inputString();
		obj.printResult(str);
    }
}