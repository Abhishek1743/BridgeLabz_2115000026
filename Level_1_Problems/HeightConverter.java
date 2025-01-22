import java.util.Scanner;
class HeightConverter{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double height=input.nextDouble();
		double  cmToInch=2.54;
		double  inchesPerFoot=12;
		double totalInch=height/cmToInch;
		int feet=(int)(totalInch/inchesPerFoot);
		int inches=(int)(totalInch%inchesPerFoot);
		System.out.println("Your height in cm is " +height +" while in feet is " +feet +" and inches is " +inches);
	}
}
