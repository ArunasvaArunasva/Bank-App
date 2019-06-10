/* Team : Arunasva Bhuyan 300055811 
         Sanchit Pokharel 300062001
*/
import java.util.Date;
public class SavingsAccount extends Account{
	 //constructor initialises fields and creates a new object
	public SavingsAccount(Customer customer, double balance){
		super(customer, balance);
	}
	//constructor 2 blank constructor
	public SavingsAccount(){
		super();
	}
	
	//deposits money into account by creating new transaction in transactions array double ---> null
	public void deposit(double amount){
		
		balance=+amount;
		if(super.size < transactions.length){
		for(int i=0; i<transactions.length;i++)
		{
			if(transactions[i]==null)
			{
				
				transactions[i]= new Transaction((byte)0, amount, new Date(), 0 ,"Deposit into saving account "+amount+"$");
				size++;
			}
		}
	}else{
		reallocate();
		for(int i=0; i<transactions.length;i++)
		{
			if(transactions[i]==null)
			{
				
				transactions[i]= new Transaction((byte)0, amount, new Date(), 0 ,"Deposit into saving account "+amount+"$");
				size++;
			}
		}
	}
	}
	
	public void withdraw(double amount){
		
		//ovedraft
		if((amount>balance)){ 	
	
			double fees=0;
			if (customer instanceof Senior){
				
				if(customer.isVIP()){
					if(amount > 100)
					{
					balance = balance - (amount + 5);
					fees=5;
					}
					
				}
			
				else{

						balance = balance-(amount+10);
						fees = 10;
					
				}
				
				 
			}else if(customer instanceof Adult){
				balance = balance - amount - 25;
				fees = 25;
			}
			else if(customer instanceof Adult){
				balance = balance - amount - 25;
				fees = 25;
			}
			
			if(super.size < transactions.length){	
			for(int i=0; i<transactions.length;i++)
			{
				if(transactions[i]==null)
				{
					
					transactions[i]= new Transaction((byte)1, amount, new Date(), fees ,"Withdraw from saving account "+amount+"$");
					super.size++;
				}
			}
			
			
			}
		
			else{
				reallocate();
				for(int i=0; i<transactions.length;i++)
			{
				if(transactions[i]==null)
				{
					
					transactions[i]= new Transaction((byte)1, amount, new Date(), fees ,"Withdraw from saving account "+amount+"$");
					super.size++;
				 
				}
			}
			}
			
			//non overdraft
		}else{ 
			balance = balance - amount;	
			if(super.size < transactions.length){
			for(int i=0; i<transactions.length;i++)
			{
				if(transactions[i]==null)
				{
					
					transactions[i]= new Transaction((byte)1, amount, new Date(), 0 ,"Withdraw from saving account "+amount+"$");
					super.size++;
				}
			}}else{
				reallocate();
				for(int i=0; i<transactions.length;i++)
			{
				if(transactions[i]==null)
				{
					
					transactions[i]= new Transaction((byte)1, amount, new Date(), 0 ,"Withdraw from saving account "+amount+"$");
					super.size++;
				}
			}
		}
	}
	
	}
	
	public void addInterest(){
	balance = balance + (balance*customer.getSavingsInterest());
	if(super.size<transactions.length){
		for(int i = 0; i<transactions.length;i++){
			if(transactions[i]==null){ 
			 transactions[i]= new Transaction((byte)2, balance, new Date(), 0 ,"Add interest to account");
			 super.size++;
				}
			}
		}else{
			reallocate();			
			for(int i = 0; i<transactions.length;i++){
			if(transactions[i]==null){ 
			 transactions[i]= new Transaction((byte)2, balance, new Date(), 0 ,"Add interest to account");
			 super.size++;
				}
			}
			
		}
	}

	//returns string representation of account
	public String toString(){
		return(" Customer name: " + this.getCustomerName()+ " Balance: " + this.getBalance() + " accountNumber: " + this.getaccountNumber() + " " + "Account Type:  Savings ");
	}
	
	
	
}