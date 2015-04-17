/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.10
 */
import java.util.Scanner;
public class Test {
	//main method 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Create MyMyStack class
		MyStack MyStack1 = new MyStack();
		
		//Enter five strings and store in ArrayList
		for(int i = 0; i < 5; i++){
			System.out.print("Please enter a string : ");
			String scanner = input.next();
			MyStack1.push(scanner);
		}
		
		//When the ArrayList isn't empty display
		while(!MyStack1.isEmpty()){
			System.out.print(MyStack1.pop()+" ");
		}
	}

}
