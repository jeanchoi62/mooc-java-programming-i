import java.util.ArrayList;

public class Stack {
	private ArrayList<String> list;
	
	public Stack() {
		this.list = new ArrayList<>();
		
	}
	
	public boolean isEmpty() {
		if (this.list.size() == 0) {
			return true;
		} else { 
		return false; }
	}
	
	public void add(String value) {
		this.list.add(value);
	}
	
	public ArrayList<String> values() {
		return this.list;
	}
	
	public String take() {
		int topIndex = this.list.size();
		String topValue = this.list.get(topIndex - 1);
		
		this.list.remove(topValue);
		return topValue;
		
	}
	
	
}