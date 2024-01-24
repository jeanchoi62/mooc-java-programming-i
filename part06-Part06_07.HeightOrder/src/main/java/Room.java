import java.util.ArrayList;


public class Room {
	ArrayList<Person> list;
	
	public Room() {
		this.list = new ArrayList<>();
	}
	
	public void add(Person person) {
		this.list.add(person);
	}
	
	public boolean isEmpty() {
		if (this.list.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<Person> getPersons() {
		return this.list;
	}
        
        	public Person shortest() {
		if (list.size() == 0) {
			return null;
		}
		
		int index = 0;
		int placeholder = (this.list.get(0).getHeight());
		for (int i = 0; i <list.size(); i++) {
			
			
			if ((this.list.get(i).getHeight() < placeholder)) {
				placeholder = this.list.get(i).getHeight();
				index = i;
			}
		}
		return this.list.get(index);
	}
                
        public Person take() {
		if (list.size() == 0) {
			return null;
		}
		
		int index = 0;
		int placeholder = (this.list.get(0).getHeight());
		for (int i = 0; i <list.size(); i++) {
			
			
			if ((this.list.get(i).getHeight() < placeholder)) {
				placeholder = this.list.get(i).getHeight();
				index = i;
			}
		}
		Person copy = this.list.get(index);
		list.remove(index);
		return copy;
	}

}