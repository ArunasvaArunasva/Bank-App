/* Team : Arunasva Bhuyan 300055811 
         Sanchit Pokharel 300062001
*/

import java.util.Date;
public abstract class Account{
	protected Customer customer;
	protected double balance;
	protected int accountNumber;
	static int count = 9999;
	private final int INITSIZE=25;
	protected Transaction[] transactions;
	protected static int size =0;
	
	//constructor initialises fields and creates a new object
	public Account(Customer customer, double balance){
		this.customer = customer;
		this.balance = balance;
		this.accountNumber = count++;
		this.transactions = new Transaction[INITSIZE];
	}
	//constructor 2 initialises fields and creates a new object
	public Account(){
		this.customer = null;
		this.balance = 0;
		this.accountNumber = count++;
		this.transactions = new Transaction[INITSIZE];
	}
	//changes the size of the accounts array of the class if size is same as length of array
	public void reallocate(){
		
		if(size == transactions.length){
			Transaction[] newTransactions = new Transaction[transactions.length*2];
			for(int i = 0; i < transactions.length-1; i++){
					newTransactions[i] = transactions[i];
			}
			this.transactions = newTransactions;
		}
		
	}
//Accessors and Modifiers
	//getters
	public double getBalance(){
		return this.balance;
	}
	
	public Customer getCustomer(){
		return this.customer;
	}
	
	public String getCustomerName()
	{
		return this.customer.getcustomerName();
	}
	
	public boolean getVIP()
	{
		return this.customer.isVIP();
	}
	
	public int getaccountNumber(){
		return this.accountNumber;
	}
	
	
	
	//String represenation
	public String toString(){
		return(" Customer name: " + this.getCustomerName()+ " Balance " + this.getBalance() + " accountNumber " + this.getaccountNumber()+" ");
	}
	
	//setter method
	public void setCustomer(Customer c){
		this.customer = c;
	}
	public void setBalance(double newBalance){
		this.balance = newBalance;
	}
	
	//abstract methods will be implemented in child classes
	public abstract void withdraw(double amount);
	public  abstract void addInterest();
	public abstract void deposit(double amount);
}