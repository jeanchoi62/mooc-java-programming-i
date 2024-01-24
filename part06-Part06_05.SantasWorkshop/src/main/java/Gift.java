
public class Gift {
	private String name;
	private int weight;
	
	public Gift(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
//	Method public String getName(), which returns the name of the gift
//	Method public int getWeight(), which returns the weight of the gift
//	Method public String toString(), which returns a string in the form "name (weight kg)"
	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return this.name + "(" + this.weight + " kg)";
	}

}
