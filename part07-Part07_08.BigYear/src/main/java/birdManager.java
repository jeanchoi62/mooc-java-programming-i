import java.util.*;

public class birdManager {
	String name;
	String latinName;
	int observations;
	ArrayList<birdManager> list;
	
	public birdManager(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.list = new ArrayList<>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void add(birdManager bird) {
		this.list.add(bird);
	}
	public void Observation() {
		this.observations++;
	}
	
	public String toString() {
		return this.name + "(" + this.latinName + "): " + this.observations + " observations";
	}

}
