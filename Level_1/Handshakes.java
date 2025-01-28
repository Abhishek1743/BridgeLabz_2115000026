import java.util.Scanner;
class Handshakes{
	public int numberOfHandshakes(int students){
	int possibleHandshakes = (students * ( students - 1 ) ) /2;
	return possibleHandshakes;
	}
	public static void main(String[] args){
		Handshakes obj = new Handshakes();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students");
		int students = input.nextInt();
		int result = obj.numberOfHandshakes(students);
		System.out.println("Maximum number of possible handshakes are " +result);
	}
}
