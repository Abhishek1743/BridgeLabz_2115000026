import java.util.*;
class FactorsFinder{
	public static int[] factors(int number){
		int count=0;
		for(int i=1; i <= number; i++){
			if(number % i == 0){
				count++;
			}
		}
		int[] arrayOfFactors = new int[ count ];
		int k = 0;
		for(int i=1; i <= number; i++){
			if(number % i == 0){
				arrayOfFactors[k] = i;
				k++;
			}
		}
		return arrayOfFactors;
	}
	
	public int sum(int[] numberOfFactors){
		int sumOfFactors = 0;
		for(int i=0; i < numberOfFactors.length; i++){
			sumOfFactors += numberOfFactors[i];
		}
		return sumOfFactors;
	}

	public int product(int[] numberOfFactors){
		int productOfFactors = 1;
		for(int i=0; i < numberOfFactors.length; i++){
			productOfFactors *= numberOfFactors[i];
		}
		return productOfFactors;
	}

	public int squareSum(int[] numberOfFactors){
		int sumOfSquares = 0;
		for(int i=0; i < numberOfFactors.length; i++){
			sumOfSquares = sumOfSquares + (int)Math.pow(numberOfFactors[i],2 );
		}
		return sumOfSquares;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		FactorsFinder obj = new FactorsFinder();
		System.out.println("Enter the number");
		int number = input.nextInt();
		int[] numberOfFactors = factors(number);
		int factorsSum = obj.sum(numberOfFactors);
		int factorsProduct = obj.product(numberOfFactors);
		int factorsSquareSum = obj.squareSum(numberOfFactors);
		System.out.println("The factors of " +number + " are : ");
		for(int i=0; i<numberOfFactors.length; i++){
			System.out.print(numberOfFactors[i] + " ");
		}
		System.out.println("\nThe sum of factors is " +factorsSum);
		System.out.println("The product of factors is " +factorsProduct);
		System.out.println("The sum of square of the factors is " +factorsSquareSum);
	}
}
