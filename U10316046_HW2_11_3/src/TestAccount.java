/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.3
 */
import java.util.Scanner;
public class TestAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account = new Account(1122,20000);
		account.setAnnualInterestRate(4.5);
		
		//Let user choice the savingsAccount or checkingAccount		
		System.out.print("Choosing you withdraw monkey from SavingsAccount(0) or CheckingAccount(1) : ");
		int choice = input.nextInt();
		if(choice == 0){
			SavingsAccount savingsAccount = new SavingsAccount(3344,20000.0);
			savingsAccount.setAnnualInterestRate(4.5);
			System.out.print("How much money you want to withdraw : ");
			double money = input.nextInt();
			savingsAccount.withdraw(money);
			System.out.println(savingsAccount.toString());
		}else{
			CheckingAccount checkingAccount = new CheckingAccount(5566,20000);
			checkingAccount.setAnnualInterestRate(4.5);
			System.out.print("How much money you want to withdraw : ");
			double money = input.nextDouble();
			System.out.print("How much overdraft limit you want to enter : ");
			double overdraft = input.nextDouble();
			checkingAccount.setOverdraf(overdraft);
			checkingAccount.withdraw(money);
			System.out.println(checkingAccount.toString());
		}
			
	}

}
