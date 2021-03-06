/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.8
 */
public class Transaction{
	//Declare data fields
	private java.util.Date dateCreated;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	//A no-arg constructor constructs to default value
	public Transaction(){
	}
	//A constructor specifies type, amount, balance, balance and description
	public Transaction(char type, double amount, double balance, String description) {
		dateCreated = new java.util.Date();
	    this.type = type;
	    this.amount = amount;
	    this.balance = balance;
	    this.description = description;
	}
	//Set the type
	public void setType(char type){
		this.type = type;
	}
	//Set the amount
	public void setAmount(double amount){
		this.amount = amount;
	}
	//Set the balance
	public void setBalance(double balance){
		this.balance = balance;
	}
	//Set the description
	public void getDescription(String description){
		this.description = description;
	}
	//Get the type
	public char getType(){
		return type;
	}
	//Get the amount
	public double getAmount(){
		return amount;
	}
	//Get the balance
	public double getBalance(){
		return balance;
	}
	//Get the description
	public String getDescription(){
	    return description;
	}
	//Get the dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
}
