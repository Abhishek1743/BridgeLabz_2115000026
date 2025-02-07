//Superclass: Book
class Book{
    String title;
    int publicationYear;

    //Constructor
    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //Method to display book details
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

//Subclass: Author
class Author extends Book{
    String name;
    String bio;

    //Constructor
    public Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
        System.out.println();
    }
}

//Main class
public class LibraryManagement{
    public static void main(String[] args){
		
        //creating objects
        Author book1 = new Author("Merchant Of Venice", 1988, "William Shakespeare", "Romantic Novel");
        Author book2 = new Author("How to fly higher", 2005, "Unknown", "Hack your brain");

        // Displaying book and author details
        book1.displayInfo();
        book2.displayInfo();
    }
}
