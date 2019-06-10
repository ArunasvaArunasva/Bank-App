/* Team : Arunasva Bhuyan 300055811 
         Sanchit Pokharel 300062001
*/
public class Senior extends Customer{
	protected boolean isVIP; //fields to check if senior is vip
	private double SAVINGS_INTEREST; 
	private double CHECK_INTEREST;
	private double CHECK_CHARGE; 
	
	//Constructor 1 initialises name, age and VIP status
	public Senior(String firstName,String lastName,int age, boolean isVIP){
		super(firstName,lastName,age);
		this.isVIP = isVIP;
		
		if(isVIP){ 
			SAVINGS_INTEREST = 0.1; 
			CHECK_INTEREST = 0.04;
			CHECK_CHARGE = 0;
		}
		else{
			SAVINGS_INTEREST = 0.08; 
			CHECK_INTEREST = 0.04;
			CHECK_CHARGE = 0.01;
		}
		
		
	}
	//constructor 2 initialises name, address,age,phone number and VIP status
	public Senior(String customerName, String customerAddress, int customerAge, String customerPhoneNumber, boolean isVIP){
		super(customerName, customerAddress,  customerAge, customerPhoneNumber);
		this.isVIP=isVIP;
			
		if(isVIP){ 
			SAVINGS_INTEREST = 0.1; 
			CHECK_INTEREST = 0.04;
			CHECK_CHARGE = 0;
		}
		else{
			SAVINGS_INTEREST = 0.08; 
			CHECK_INTEREST = 0.04;
			CHECK_CHARGE = 0.01;
		}
		
		
		
	}
	
	//sets value of isVIP variable
	public void setisVIP(boolean b){
		this.isVIP = b;
	}
	
	//checks whether senior is VIP or not
	public boolean isVIP(){
		return isVIP;
	}
	
	//Accessor methods returns value of instance variables
	public double getSavingsInterest(){
		return this.SAVINGS_INTEREST;
	};
	public double getCheckInterest(){
		return this.CHECK_INTEREST;
	};
	public double getCheckCharge(){
		return this.CHECK_CHARGE;
	};
}