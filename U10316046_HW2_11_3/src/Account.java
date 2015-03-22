/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.3
 */
public class Account{
	//Declare data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	//A no-arg constructor constructs to default value
	public Account(){
		id = 0;
	}
	//A constructor specifies id and initialize balance
	public Account(int id, double balance){
		dateCreated = new java.util.Date();
		this.id = id;
		this.balance = balance;
	}
	//Set the id
	public void setId(int id){
		this.id = id;
	}
	//Set the balance
	public void setBalance(double balance){
		this.balance = balance;
	}
	//Set the annual InterestRate
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	//Get the id
	public int getId(){
		return id;
	}
	//Get the balance
	public double getBalance(){
		return balance;
	}
	//Get the annual InterestRate
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//Get the monthly InterestRate
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	//Get the monthly Interest
	public double getMonthlyInterest(){
		return (balance*getMonthlyInterestRate())/100;
	}
	//Withdraw the money
	public void withdraw(double money){
		balance -= money;
	}
	//Deposit the money
	public void deposit(double money){
		balance += money;
	}
	//Get the dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString(){
		return "Your balance is $"+(int)getBalance()+"\nThe monthly interest is "+getMonthlyInterest()+" %"+"\nThe account was created in "+getDateCreated();
	}	
}