/* Team : Arunasva Bhuyan 300055811 
         Sanchit Pokharel 300062001
*/
import java.util.Date;
import java.time.LocalDateTime; 
public class Transaction{
	private byte type;
	private double amount;
	private Date date;
	private double fees;
	private String description;
	
	//constructor, creates a new object of transaction
	public Transaction(byte type, double amount, Date date, double fees ,String description){
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.fees = fees;
		this.description = description;
	}
	
	
	//returns string representation of transaction. null --> String
	public String processTransaction(){
		if(type==0){
			return("Type: 0 deposit:" + "Amount:" + this.amount+ " Date: " + this.date + " fees: " + this.fees +" Description: " +this.description);
		}else if( type == 1){
					return("Type: 1 withdrawal:" + "Amount:" + this.amount+ " Date: " + this.date + " fees: " + this.fees +" Description: " +this.description);

		}else if(type ==2){
			return("Type: 2 addedInterest:" + "Amount:" + this.amount+ " Date: " + this.date + " fees: " + this.fees +" Description: " +this.description);
		}
		return("Type: *ERROR NOT FOUND* "+  "Amount:" + this.amount+ " Date: " + this.date + " fees: " + this.fees +" Description: " +this.description);	
	}
	
}