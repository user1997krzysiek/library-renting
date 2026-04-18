import java.util.ArrayList;

public class Book {
    private String title;
    private int price;
    private String location;
     public Book(String t, int p, String l) {
         title = t;
         price = p;
         location = l;
     }
     @Override
    public String toString() {
         return "Book " + title + " " + price + " " + location;
     }

}
