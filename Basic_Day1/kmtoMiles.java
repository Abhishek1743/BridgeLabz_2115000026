import java.util.*;
class  kmtoMiles{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Distance in kilometers");
	double km=sc.nextDouble();
	double dis=km*0.621371;
	System.out.println("The Distance in miles is="+dis);
	}
}