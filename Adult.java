/* Team : Arunasva Bhuyan 300055811 
         Sanchit Pokharel 300062001
*/

public class Adult extends Customer{
	private final double SAVINGS_INTEREST = 0.03; 
	private final double CHECK_INTEREST = 0.01;
	private final double CHECK_CHARGE = 0.03; 
	
	//constructor
	public Adult(String firstName,String lastName,int age){
	super(firstName,lastName,age);
	}
	//Constructor 2
	public Adult(String customerName, String customerAddress, int customerAge, String customerPhoneNumber){
		super(customerName, customerAddress,  customerAge, customerPhoneNumber);
		}

//Accessors and Modifiers
		//getters
	public double getSavingsInterest(){
		return this.SAVINGS_INTEREST;
	};
	public double getCheckInterest(){
		return this.CHECK_INTEREST;
	};
	public double getCheckCharge(){
		return this.CHECK_CHARGE;
	};

//returns the status of VIP variable;
	public boolean isVIP(){
		return false;
	}
}