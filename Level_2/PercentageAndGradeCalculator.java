import java.util.Scanner;
class PercentageAndGradeCalculator{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the marks obtained in physics : ");
		int physics = input.nextInt();
		System.out.print("Enter the marks obtained in chemistry : ");
		int chemistry = input.nextInt();
		System.out.print("Enter the marks obtained in maths : ");
		int maths = input.nextInt();
		double percentage = ( physics + chemistry + maths )/3;
		if(percentage >= 80){
			System.out.println("The average mark is : " +percentage + "\nGrade : A " + "\nRemarks : Level 4, above agency-normalized standards");
		} else if(percentage >= 70 && percentage <=79 ){
			System.out.println("The average mark is : " +percentage + "\nGrade : B " + "\nRemarks : Level 3, at agency-normalized standards");
		} else if(percentage >=60 && percentage <=69){
			System.out.println("The average mark is : " +percentage + "\nGrade : C " + "\nRemarks : Level 2, below, but approaching agency-normalized standards");
		} else if(percentage >= 50 && percentage <=59){
			System.out.println("The average mark is : " +percentage + "\nGrade : D " + "\nRemarks : Level 1, well below agency-normalized standards");
		} else if(percentage >= 40 && percentage <=49){
			System.out.println("The average mark is : " +percentage + "\nGrade : E " + "\nRemarks : Level 1, too below agency-normalized standards");
		} else{
			System.out.println("The average mark is : " +percentage + "\nGrade : R " + "\nRemarks : Remedial standards");
		}
	}
}
