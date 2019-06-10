/* Team : Arunasva Bhuyan 300055811 
			Sanchit Pokharel 300062001
*/
public abstract class Customer{
	//fields
	private String firstName, lastName,address,customerName,phoneNumber; 
	private int age,customerNumber; 
	//class variable used to initialise acount number
	static int lastCustomerNumber = 9999;
	//constructor initialises a customer object and sets a customer number to every new customer created.
	public Customer(String firstName,String lastName,int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.customerNumber = lastCustomerNumber++;
	}
	//constructor 2
	public Customer(String customerName, String customerAddress, int customerAge, String customerPhoneNumber){
		this.customerName = customerName;
		this.address = customerAddress;
		this.age = customerAge;
		this.phoneNumber=customerPhoneNumber;
		this.customerNumber = lastCustomerNumber++;
	}
	
	//constructor 3
	public Customer(){
		this.customerNumber = lastCustomerNumber++;
	}
	
//accessor methods
	//returns customer number null -> int
	public int getCustomerNumber(){
		return this.customerNumber;
	}
	
	//returns firstName of object null -> String
	public String getFirstName(){
		return this.firstName;
	}
	
	//returns lastName of instance of customer null ---> String
	public String getLastName(){
		return this.lastName;
	}
	
	//returns age of customer
	public int getAge(){
		return this.age;
	}
	
	public String getcustomerName()
	{
		return this.customerName;
	}
//modifier methods
	
	//setting first name. String -> null
	public void setFirstName(String f){
		this.firstName = f;
	}
	
	//setting last name.  String -> null
	public void setLastName(String l){
		this.lastName = l;
	}
	
	//sets age. int -> null
	public void setAge(int a){
		this.age = a;
	}
	
	//checks if two Customers have identical customer numbers. Object  -> boolean;
	public boolean equals(Customer other){
		return (this.customerNumber == other.customerNumber);
	}
	
	// returns a string representation of the customer. null -> String
	public String toString(){
		return (this.getCustomerNumber() + " " + this.getFirstName() + " " + this.getLastName() + " " + this.getAge());
	}

//abstract methods will be implemented in child classes
	public abstract double getSavingsInterest();
	public abstract double getCheckInterest();
	public abstract double getCheckCharge();
	public abstract boolean isVIP(); //will be implemented in senior

}