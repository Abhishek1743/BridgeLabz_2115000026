import java.util.Scanner;
class SumUntilZero2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double total = 0.0;
	System.out.println("Enter the number");
        double number=input.nextDouble();
        while(true){
		total+=number;
		System.out.println("Enter the number (zero if you want to stop)");
		number=input.nextDouble();
		if(number<=0){
			break;
		}
	}
        System.out.println("The total sum is: " +total);
    }
}
