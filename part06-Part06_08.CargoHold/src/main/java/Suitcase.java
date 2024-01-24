import java.util.ArrayList; 

public class Suitcase { 
	private ArrayList<Item> items; 
	private int maximumWeight; 
	 

	public Suitcase(int maximumWeight) { 
		this.items = new ArrayList<>(); 
		this.maximumWeight = maximumWeight; 
	} 


	public void addItem(Item item) { 
		//ArrayList<Item> items = new ArrayList<>(); 
		int totalWeightt = 0;
		for(int i = 0; i < this.items.size(); i++) {
			totalWeightt += (items.get(i)).getWeight();
		}
		
		if (totalWeightt + item.getWeight() <= this.maximumWeight) {
			this.items.add(item); 
		}
	} 
	
	public String toString() { 
		int totalWeight = 0;
		for (Item item: items) {
			totalWeight += item.getWeight();
		}
		
		if (this.items.size() == 0) {
			return "no items (0 kg)";
		} else if (this.items.size() == 1) {
			return "1 item (" + totalWeight + " kg)";
		} else {
		return this.items.size() + " items(" + totalWeight + " kg)"; 
		}
	} 
	
	public void printItems() {
		String statement = "";
		for (int i = 0; i < this.items.size(); i++) {
			statement += (this.items.get(i)).getName() + " (" + (this.items.get(i)).getWeight() + " kg)\n";
		}
		System.out.println(statement);
	}
	
	public int totalWeight() {
		int totWeight = 0;
		for (Item item : items) {
			totWeight += item.getWeight();
		}
		return totWeight;
	}
	
	public Item heaviestItem() {
		int heaviest = 0;
		Item test = null;
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.size() == 0) {
				test = null;
			}
			else if (this.items.get(i).getWeight() > heaviest) {
				heaviest = this.items.get(i).getWeight();
				test = items.get(i);
			}
		}
		return test;

	}
} 
