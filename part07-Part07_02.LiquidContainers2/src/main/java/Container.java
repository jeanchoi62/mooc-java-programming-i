
public class Container {
	private int first;
	
	public Container() {
	}
	
	public int contains() {
		return first;
	}
	
	public void add(int amount) {
		if (amount < 0) {
			this.first = first;
		} else if (amount + first <= 100) {
			this.first += amount;
		} else {
			this.first = 100;
		}
	}
	
	public void remove(int amount) {
		if (amount < 0) {
			this.first = first;
		} else if (first - amount >= 0) {
			this.first -= amount;
		} else {
			first = 0;
		}
		
	}
	
	public String toString() {
		return first + "/100";
	}
 
}
