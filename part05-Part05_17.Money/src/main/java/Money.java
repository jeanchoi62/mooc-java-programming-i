import java.math.*;
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        
        if ((this.cents + addition.cents) > 100) {
            Money newwMoney = new Money((this.euros + addition.euros) + 1, Math.abs((this.cents + addition.cents) % 100));
            return newwMoney;
        }
            Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); 
            return newMoney;
        
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        } return false;
    }
    
    public Money minus(Money decreaser) { 
    	if (this.euros < decreaser.euros) {
    		Money moneyFive = new Money(0, 0);
    		return moneyFive;
    	}
    

    	if (this.euros == decreaser.euros && this.cents < decreaser.cents) {
    		
    		Money moneySeven = new Money (this.euros - (decreaser.euros + 1), 100 - decreaser.cents);
    		return moneySeven;
    	}
    	if (this.cents == 0) {
			Money moneySix = new Money(this.euros - (decreaser.euros+1), 100 - decreaser.cents);
			return moneySix;
			}
    		
    	
    	

    	
    	if (this.cents < decreaser.cents) {
    		Money moneyThree = new Money(this.euros - (decreaser.euros + 1), Math.abs(this.cents - decreaser.cents));
    		return moneyThree;
    	} 
    	
    	Money moneyFour = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
		return moneyFour;
    	
    }
}