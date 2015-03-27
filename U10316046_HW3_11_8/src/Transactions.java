/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.8
 */
public class Transactions{
	private java.util.Date dateCreated;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transactions(char type, double amount, double balance, String description) {
		dateCreated = new java.util.Date();
	    this.type = type;
	    this.amount = amount;
	    this.balance = balance;
	    this.description = description;
	}
	public char getType(){
		return type;
	}
	public double getAmount(){
		return amount;
	}
	public double getBalance(){
		return balance;
	}
	public String getDescription() {
	    return description;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
}
