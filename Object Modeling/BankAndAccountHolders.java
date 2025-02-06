import java.util.*;
class Bank{
    private String name;
    private List<Customer> customers;

    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void openAccount(String customerName, int accountNumber, double initialBalance){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            customer = new Customer(customerName, this);
            customers.add(customer);
        }
        customer.addAccount(new BankAccount(accountNumber, initialBalance));
        System.out.println("Account opened for " + customerName + " in " + name + " bank.");
    }

    private Customer findCustomer(String name){
        for (Customer customer : customers){
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }
}

class Customer{
    private String name;
    private Bank bank;
    private List<BankAccount> accounts;

    public Customer(String name, Bank bank){
        this.name = name;
        this.bank = bank;
        this.accounts = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public void viewBalance(int accountNumber){
        for (BankAccount account : accounts){
            if (account.getAccountNumber() == accountNumber){
                System.out.println("Balance for account " + accountNumber + ": " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

class BankAccount{
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }
}

public class BankAndAccountHolders{
    public static void main(String[] args){
        Bank bank = new Bank("SBI Bank");
        bank.openAccount("Abhishek", 1001, 5000.0);
        bank.openAccount("Abhishek", 1002, 3000.0);
        bank.openAccount("Priyanshu", 1003, 7000.0);

        Customer john = new Customer("Abhishek", bank);
        john.viewBalance(1001);
        john.viewBalance(1002);
    }
}
