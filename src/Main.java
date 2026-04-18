import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book ("Pride and Prejudice" , 50, "rack number 10"));
        Book element = list.get(0);
        System.out.println(element);
    }
}
