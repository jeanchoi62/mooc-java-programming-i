/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanmac
 */
public class Multiplier {
    private int instnumber;
    
    
    public Multiplier(int number) {
        this.instnumber = number;
    }
    
    public int multiply(int number) {
        return number * this.instnumber;
    }
    
    
}
