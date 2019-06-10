/* Team : Arunasva Bhuyan 300055811 
         Sanchit Pokharel 300062001
*/
public class Bank {
    private Account[] accounts; 
    private int size = 0;
    
    private static final int SAVINGS = 0;
    private static final int CHECKING = 1;    
    private static final int SENIOR = 0;
    private static final int ADULT = 1;    
    private static final int STUDENT = 2;
    private static final int INIT_CAPACITY = 100;
    
    /** Creates a new instance of Bank */
	
	//initialises accounts[] an array storing accounts
    public Bank(){
		this.accounts = new Account[INIT_CAPACITY];
		
	} 


    
    /********************************************************************
     * Creates a new account.
     * pre: customer information must be not null and types must be valid
     * post: New account added to bank
     * @param customerName String Account owner's name
     * @param customerAddress String Owner's address
     * @param customerAge int Owner's age (in years)
     * @param customerPhoneNumber String Owner's phone number
     * @param customerType int Owner's type of customer within bank
     * @param typeAccount int Account type (savings or checking)
     * @return String New account number
     */
    public String addAccount(String customerName, String customerAddress,int customerAge, String customerPhoneNumber, int customerType, int typeAccount,boolean VIP) {
		Customer customer;
	
		switch(customerType)
		{
			case 0:
			customer = new Senior(customerName, customerAddress, customerAge, customerPhoneNumber, VIP);
			break;
			case 1:
			customer =  new Adult(customerName, customerAddress, customerAge, customerPhoneNumber);
			break;
			default:
			customer = new Student(customerName, customerAddress, customerAge, customerPhoneNumber);
			break;
		}
		
	    Account account;
		switch(typeAccount)
		{
			case 0:
			account = new SavingsAccount(customer,0);
			break;
			default:
			account = new CheckingAccount(customer,0);
			break;
			
		}
		if(size == accounts.length){
			reallocate();
		}
		
		accounts[size] = account;
		size++;
		return account.getaccountNumber() + " ";

	}
    
    /***********************************************************************
     * Make a deposit into account.
     * pre: amount must be a positive integer
     * post: Account's balance increases
     * @param accountNumber String Account's number
     * @param amount double Amount to deposit
     * @return double New balance
     */
    public double makeDeposit(String accountNumber, double amount){
		
		double newBalance=0;
		int acNumber = Integer.valueOf(accountNumber);
		if(size == accounts.length)
		{
			reallocate();
		}
		for(int i = 0; i < size;i++){
			if(accounts[i].getaccountNumber()==acNumber){
				
			
				if(amount <=0)
				{
					newBalance = accounts[i].getBalance();
				}
				else{
					double currentBalance = accounts[i].getBalance();
					newBalance = currentBalance + amount;
					accounts[i].setBalance(newBalance);
				}
			}
		}
		return newBalance;
	}
    
    /***********************************************************************
     * Make a withdrawal from account.
     * pre: amount must be a positive integer
     * post: Account's balance decreases
     * @param accountNumber String Account's number
     * @param amount double Amount to withdraw
     * @return double New balance
     */    
    public String makeWithdrawal(String accountNumber, double amount){
        int index = find(accountNumber);
        accounts[index].withdraw(amount);
        return Double.toString(accounts[index].getBalance());       
    }

    /***********************************************************************
     * Returns account information as a string so it can be displayed
     * @param accountNumber String Account's number
     * @return String Account information as a String object
     */    
    public String getAccount(String accountNumber)
	{
		if(find(accountNumber)==-1){
			return"This account does not exist";
		}
		else
		{
			int acNumber = find(accountNumber);
			return accounts[acNumber].toString();
			
		}
	}
    
    /***********************************************************************
     * Given an account number tells if the account exists or not
     * @param accountNumber String Account's number
     * @return int TRUE if accountNumber exists in accounts[]. Otherwise, -1.
     */    
    private int find(String accountNumber){
		Integer acNumber = Integer.valueOf(accountNumber);
		for(int i = 0; i < size;i++){
			if(acNumber == accounts[i].getaccountNumber()){
			return i;}
		}
		for(Account i : accounts){
 
		}
		
		return -1;
	}

 /***********************************************************************


    /** You need to create private method : Allocate to allocate a new array to hold the transactions. */
    private void reallocate(){
		Account[] newAccounts = new Account[accounts.length*2]; 
		for(int i = 0; i < accounts.length;i++){
			newAccounts[i] = accounts[i];
	}
	accounts = newAccounts;
	}
/*******************************************************************************************************/
	public String addInterest(String accountNumber)
	{
		 int index = find(accountNumber);
        accounts[index].addInterest();
        return String.valueOf(accounts[index].getBalance());   
	}
}
