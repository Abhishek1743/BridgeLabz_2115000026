class Book{
	static String libraryName = "CEA Library";
	private String title;
	private String author;
	private final int isbn;
	
	//Parameterized Constructor
	Book(String title,String author, int isbn ){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	//Method to display library Name
	public static void displayLibraryName(){
		System.out.println("Library name : " +libraryName);
	}
	
	//To check and then display the details of the Book
	public void display(){
		if( this instanceof Book ){
			System.out.println("Object is an instance of Book");
			System.out.println("Details of the Book is : ");
			System.out.println("Book Title : " +title);
			System.out.println("Author Name : " +author);
			System.out.println("ISBN : " +isbn);
			System.out.println();
		} else{
			System.out.println("Object is not an instance of Book");
		}
	}
	
	//Main method
	public static void main(String[] args){
		Book bookNumber1 = new Book("Merchant of Venice", "William Shakespeare", 123456);
		Book bookNumber2 = new Book("Marvel's Spider Man", "Stan Lee", 234567);
		
		//Displaying Library Name
		displayLibraryName();
		
		System.out.println();
		
		//Displaying book details
		bookNumber1.display();
		System.out.println();
		bookNumber2.display();
		
	}
}