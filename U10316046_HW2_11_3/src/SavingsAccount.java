/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.3
 */
public class SavingsAccount extends Account{
	//A no-arg constructor
	public SavingsAccount(){
		super();
	}
	//Constructor
	public SavingsAccount(int id,double balance){
		super(id,balance);
	}
	//Withdraw the money from super class if it isn't over balance
	@Override
	public void withdraw(double money){
		if(money > super.getBalance()){
			System.out.println("You can't overdraw your balance !!");
		}else{
			super.withdraw(money);
		}
	}
		//Return toString 
	@Override
	public String toString(){
		return "SavingsAccount :\n " + super.toString();
	}
}
