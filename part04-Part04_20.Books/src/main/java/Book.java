public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
    //THIS IS THE CORRECT ONE!!!!!!!
    
    public String getTitle() {
        return this.title = title;
    }

    public int getPages() {
        return this.pages = pages;
    }

    public int getYear() {
        return this.year= year;
    }
    
    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
}