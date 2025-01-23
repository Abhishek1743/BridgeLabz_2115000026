import java.util.Scanner;
class SumOfNaturalNumberComparision2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int number = input.nextInt();
        int sum=0, sumResult=0;
        if(number > 0){
                sum = ( number * ( number + 1 ))/2;
                for(int i = number ; i > 0 ; i--){
                    sumResult+= i;
                }
        }
        if(sum == sumResult){
            System.out.println("The sum of Natural numbers is: " + sumResult);
        }
    }
}
