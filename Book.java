public class Book{

    private String title;
    private String author;
    private double price;

	//Default Constructor
    public Book(){
        this.title = "How to fly higher";
        this.author = "Unknown";
        this.price = 110.0;
    }
	
	//Parameterized Constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        //Default constructor
        Book defaultBook = new Book();
        defaultBook.displayInfo();

        System.out.println();

        //Parameterized constructor
        Book parameterizedBook = new Book("Merchant Of Venice", "William Shakespeare", 210);
        parameterizedBook.displayInfo();
    }
}