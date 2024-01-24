
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        
        if (this.month == 1 && this.day == 30) {
            this.month = 2;
            this.day =1;
        }
        
        else if (this.month == 2 && this.day == 30) {
            this.month = 3;
            this.day =1;
        }
        
        else if (this.month == 3 && this.day == 30) {
            this.month = 4;
            this.day =1;
        }
        
        else if (this.month == 4 && this.day == 30) {
            this.month = 5;
            this.day =1;
        }
        
        else if (this.month == 5 && this.day == 30) {
            this.month = 6;
            this.day =1;
        }
        
        else if (this.month == 6 && this.day == 30) {
            this.month = 7;
            this.day =1;
        }
    
        else if (this.month == 7 && this.day == 30) {
            this.month = 8;
            this.day = 1;
        }
        
        else if (this.month == 8 && this.day == 30) {
            this.month = 9;
            this.day =1;
        }
        
        else if (this.month == 9 && this.day == 30) {
            this.month = 10;
            this.day =1;
        }
        
        else if (this.month == 10 && this.day == 30) {
            this.month = 11;
            this.day =1;
        }
    
        else if (this.month == 11 && this.day == 30) {
            this.month = 12;
            this.day =1;
        }
        
        else if (this.month == 12 && this.day == 30) {
            this.month = 1;
            this.day =1;
            this.year += 1;
        }

        else {
            this.day += 1;
        }
    }
    
    public void advance(int howManyDays) {
        for (int i = 1; i <= howManyDays; i++) {
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        clone.advance(days);
        return clone;
    }
    
    
}
