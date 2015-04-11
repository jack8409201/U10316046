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
		MyMyStack MyMyStack1 = new MyMyStack();
		
		//Enter five strings and store in ArrayList
		for(int i = 0; i < 5; i++){
			System.out.print("Please enter a string : ");
			String scanner = input.next();
			MyMyStack1.push(scanner);
		}
		
		//When the ArrayList isn't empty display
		while(! MyMyStack1.isEmpty()){
			System.out.print(MyMyStack1.pop()+" ");
		}
	}

}
