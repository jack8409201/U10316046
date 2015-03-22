/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.3
 */
public class CheckingAccount extends Account{
	private double overdraft;
	
	//Constructor
	public CheckingAccount(){
		super();
	}
	//Constructor
	public CheckingAccount(int id,double balance){
		super(id,balance);
	}
	//Set the overdraft
	public void setOverdraf(double overdraft){
		this.overdraft = overdraft;
	}
	//Get the overdraft
	public double getOverdraf(){
		return overdraft;
	}
	//Withdraw the money from super class if it isn't over balance or overdraft limit
	@Override
	public void withdraw(double money){
		if(money > (super.getBalance()+overdraft)){
			System.out.println("You can't withdraw over the overdraft limit !!");
		}else if(money > super.getBalance() && money<= (super.getBalance()+overdraft)){
			System.out.println("You withdraw over the balance but don't over the overdraft limit, so you just only deposit money next time.");
		}else{
			super.withdraw(money);
		}
	}
	//Return toString 
	@Override
	public String toString(){
		return "Your CheckingAccount :\n " + super.toString();
	}
}
