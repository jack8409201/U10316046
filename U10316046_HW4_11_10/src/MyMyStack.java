/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.10
 */
import java.util.ArrayList;
public class MyMyStack extends MyStack{
	//Create an ArrayList store five strings
	private ArrayList<String> list = new ArrayList<String>();
		
	//Override MyStack isEmpty method	
	@Override
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	//Override MyStack getSize method
	@Override
	public int getSize(){
		return list.size();
	}
	
	//Override MyStack peek method
	@Override
	public Object peek(){
		return list.get(getSize()-1);
	}
	
	//Override MyStack pop method
	@Override
	public Object pop(){
		Object o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	//Store string in the ArrayList
	public void push(String o){
		list.add(o);
	}

}
