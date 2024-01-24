import java.util.ArrayList;

public class Package {
	private ArrayList<Gift> list;
	
	public Package() {
		this.list = new ArrayList<>();
	}
	
	public void addGift(Gift gift) {
		this.list.add(gift);
	}
	
	public int totalWeight() {
		int totWeight = 0;
		for (int i = 0; i < list.size(); i++) {
			totWeight += (list.get(i)).getWeight();
		}
		return totWeight;
	}

}
