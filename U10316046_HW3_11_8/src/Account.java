/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.8
 */
public class Account{
	//Declare data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	private String name;
	private java.util.ArrayList transactions;

	//A no-arg constructor constructs to default value
	public Account(){
	}
	//A constructor specifies id and initialize balance
	public Account(int id, double balance, String name){
		dateCreated = new java.util.Date();
		transactions = new java.util.ArrayList();
		this.id = id;
		this.balance = balance;
		this.name = name;
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
	public String getName() {
		return name;
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
	public void withdraw(double amount){
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, " "));
	}
	//Deposit the money
	public void deposit(double amount){
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, " "));
	}
	//Get the dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public java.util.ArrayList getTransactions() {
		return transactions;
	}
}