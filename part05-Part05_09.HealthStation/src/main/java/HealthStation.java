
public class HealthStation {
    private int amountOfWeighings;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        amountOfWeighings++;
        return person.getWeight();
        
    }
    
    //method to increase weight by one
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings() {
        return amountOfWeighings;
        
        
    }

}
