/* Team : Arunasva Bhuyan 300055811 
         Sanchit Pokharel 300062001
*/
public class Student extends Customer{
	private final double SAVINGS_INTEREST = 0.07; 
	private final double CHECK_INTEREST = 0.03;
	private final double CHECK_CHARGE = 0.02; 
	
	//constructor
	public Student(String firstName,String lastName,int age){
	super(firstName,lastName,age); //gets instance variables from parent class by calling parent class constructor
	}
	
	//constructor 2
	public Student(String customerName, String customerAddress, int customerAge, String customerPhoneNumber){
		super(customerName, customerAddress,  customerAge, customerPhoneNumber);
		}
	
//Accessor methods (getters)	
	public double getSavingsInterest(){
		return this.SAVINGS_INTEREST;
	}
	public double getCheckInterest(){    
		return this.CHECK_INTEREST;
	}
	public double getCheckCharge(){
		return this.CHECK_CHARGE;
	}

//Checks VIP
	public boolean isVIP(){
		return false;
	}
}