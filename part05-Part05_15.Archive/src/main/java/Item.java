
public class Item {
	String identifier;
	String name;
	
	public Item(String identifier, String name) {
		this.identifier = identifier;
		this.name = name;
	}
	
	public String getIdentifier() {
		return this.identifier;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(Object comparison)  {
		if (this == comparison) {
			return true;
		}
		
		if (!(comparison instanceof Item)) {
			return false;
		}
		
		Item comparisonItem = (Item) comparison;
		
		return this.identifier.equals(comparisonItem.identifier);
	}
	
	

}