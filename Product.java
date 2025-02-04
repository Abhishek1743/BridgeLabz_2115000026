import java.util.Scanner;
public class Product{
	static double discount = 10.00;
	private String productName;
	private int price;
	private int quantity;
	private final int productID;
	
	//Parameterized Constructor
	Product(String productName, int price, int quantity, int productID){
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productID = productID;
	}
	
	//Method to update discount percentage
	public static void updateDiscount(double newDiscount){
		discount = newDiscount;
	}
	
	//Method to check instance and then display the details of the product
	public void display(){
		if(this instanceof Product){
			System.out.println("Object is an instance of Product class");
			System.out.println("Details of the Product are :");
			System.out.println("Product Name : " +productName);
			System.out.println("Price : " +price);
			System.out.println("Quantity : " +quantity);
			System.out.println("Product ID : " +productID);
			System.out.println("Price after discount : " +((price) - ((discount/100)*price)));
			System.out.println();
		} else{
			System.out.println("Object is not an instance of Product class");
			System.out.println();
		}
	}
	
	//Main Method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Creating objects (or products)
		Product product1 = new Product("Laptop", 69000, 5, 123456);
		Product product2 = new Product("Phone", 45000, 2, 654321);
		
		//Displaying the product details before the updated Discount
		product1.display();
		product2.display();
		
		//Updating the discount percentage	
		System.out.println("Enter the new discount : ");
		double newDiscount = input.nextDouble();
		updateDiscount(newDiscount);
		
		//Displaying the product details after updating the new Discount percentage
		product1.display();
		System.out.println();
		product2.display();
	}
}