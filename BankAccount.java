public class BankAccount{
	static String bankName = "ICICI";
	private static int totalAccount = 0;
	private String accountHolderName;
	private final int accountNumber;

	//Parameterized Constructor
	BankAccount(String accountHolderName, int accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAccount++;
	}
	
	//Total Number of Accounts
	public static int getTotalAccounts(){
		return totalAccount;
	}
	
	//To check and then display the details of the Customer
	public void display(){
		if( this instanceof BankAccount ){
			System.out.println("Account is an instance of BankAccount");
			System.out.println("Details of the Customer are : ");
			System.out.println("Bank Name : " +bankName);
			System.out.println("Account Holder Name : " +accountHolderName);
			System.out.println("Account Number : " +accountNumber);
			System.out.println();
		} else{
			System.out.println("Account is not an instance of BankAccount");
		}
		
	}
	
	//Main Method
	public static void main(String[] args){
		
		//Creating object
		BankAccount account1 = new BankAccount("Abhishek",123456789);
		BankAccount account2 = new BankAccount("Priyanshu",987654321);
		
		//displaying account
		account1.display();
		System.out.println();
		account2.display();
		
		//Printing total number of accounts
		System.out.println("\nTotal Accounts are : " +getTotalAccounts());
	}
}