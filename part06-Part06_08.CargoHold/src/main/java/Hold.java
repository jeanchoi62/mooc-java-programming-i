import java.util.ArrayList;

public class Hold {
	private int maximumWeight;
	private ArrayList<Suitcase> list;
	
	public Hold (int maximumWeight) {
		this.maximumWeight = maximumWeight;
		this.list = new ArrayList<>();
	}
	
	public void addSuitcase(Suitcase suitcase) {
		int currentWeight = 0;
		for (int i = 0; i < list.size(); i ++) {
			currentWeight += list.get(i).totalWeight();
		}
		
		if (suitcase.totalWeight() + currentWeight > this.maximumWeight) {
			return;
		}	else {
				this.list.add(suitcase);
			
		}
	}
	
	public String toString() {
		int weight = 0;
		for (Suitcase suitcase : list) {
			weight += suitcase.totalWeight();
		}
		return this.list.size() + " suitcases (" + weight + " kg)";
	}
	
	public void printItems() {
		for(Suitcase suitcase : list) {
			suitcase.printItems();
		}
	}

}
