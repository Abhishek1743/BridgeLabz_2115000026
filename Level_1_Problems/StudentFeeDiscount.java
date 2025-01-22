import java.util.Scanner;
class StudentFeeDiscount{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int fee=input.nextInt();
		int discountPercent=10;
		double discount = (fee*discountPercent)/100;
		double payableFee = fee - discount;
		System.out.println("The discount amount is INR " +discount + " and final discounted fee is INR " +payableFee);
	}
}
