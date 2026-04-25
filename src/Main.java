import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Pride and Prejudice", 50, "rack number 10"));
        list.add(new Book("Pan tadeusz", 100, "rack number 5"));
//        Book element = list.get(0);
//        Book element1 = list.get(1);
//        System.out.println(element);
//        System.out.println(element1);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();



        for (int i = 1; i <= number; i++) {
            list.add(new Book("Dziady cz " + i, 100, "rack number  " + i + 4));

        }

        for (int i = 0; i < list.size(); i++) {
            Book element = list.get(i);
            System.out.println(element);

        }
    }
}