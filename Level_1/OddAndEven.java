import java.util.Scanner;
class OddAndEven{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number limit");
		int number = input.nextInt();
		if(number > 0){
			for(int i=1; i <= number; i++){
				if( i % 2 == 0 ){
					System.out.println("The number " +i + " is even");
				} else{
					System.out.println("The number " +i + " is odd");
				}
			}
		}
	}
}
