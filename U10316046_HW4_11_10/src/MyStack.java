/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.10
 */
import java.util.ArrayList;
public class MyStack {
	
	//Create an ArrayList store objects
	private ArrayList<Object> list = new ArrayList<Object>();
	
	//Bollean method if stack is empty that return true
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	//Method return amount of element in the stack
	public int getSize() {
		return list.size();
	}

	//Method return top object of the stack but not delete
	public Object peek() {
		return list.get(getSize() - 1);
	}

	//Method delete top object in the stack and return it
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	//Method store object on the top 
	public void push(Object o) {
		list.add(o);
	}
	
	//Override the toString in the Object class
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
