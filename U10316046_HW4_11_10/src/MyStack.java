/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.10
 */
import java.util.ArrayList;
public class MyStack extends ArrayList<Object>{
	
	private ArrayList<String> list = new ArrayList<String>();
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	public int getSize() {
		return super.size();
	}

	public Object peek() {
		return super.get(getSize() - 1);
	}

	public Object pop() {
		Object o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}
	
	public void push(Object o) {
		super.add(o);
	}
	
	@Override
	public String toString() {
		return "stack: " + super.toString();
	}
}
