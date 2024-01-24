import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class JokeManager {
    private ArrayList<String> list;
    
    
    public JokeManager() {
        // new arraylist
        this.list = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.list.add(joke);
        
    }
    
    public String drawJoke() {
        if (this.list.size() == 0) {
            return "Jokes are in short supply.";
        }
        
        int random = ThreadLocalRandom.current().nextInt(0, list.size());
        return (this.list.get(random).toString());
        
    }
    
    public void printJokes() {
        for (int i = 0; i < this.list.size(); i++) {
        System.out.println(this.list.get(i));
    }
        
    }
    
        public boolean emptyy() {
        if (list.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
}