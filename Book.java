import java.util.Scanner;
class Book{

	static String title;
	static String author;
	static int price;

	Book(String title, String author, int price){
	this.title = title;
	this.author = author;
	this.price = price;
	}

	public void displayDetails(){
		System.out.println("Title of the book is : " +title);
		System.out.println("Author of the book is : " +author);
		System.out.println("Price of the book is : " +price);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter title of the book : ");
		String title = input.nextLine();
		System.out.println("Enter the author of the book : ");
		String author = input.nextLine();
		System.out.println("Enter the price of the book : ");
		int price = input.nextInt();

		Book obj = new Book(title, author, price);
		obj.displayDetails();
	}
}
