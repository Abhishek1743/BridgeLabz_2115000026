import java.util.Scanner;
class GCD_LCM_Calculator{
	
    public static int gcd(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
	
    public static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
		
        int gcdResult = gcd(num1, num2);
        int lcmResult = lcm(num1, num2);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
        
    }
}
