import java.util.ArrayList;
import java.util.Scanner;

public class LibraryDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<Book>();

        System.out.print("How many books add? ");
        int count = sc.nextInt();
        sc.nextLine();

        String[] title = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Title book " + (i + 1) + ": ");
            title[i] = sc.nextLine();
            books.add(new Book(title[i]));
        }

        System.out.println("\nBooks added");
        for (Book b: books) {
            System.out.println("- " + b.getTitle() + " (borrowed: " + b.isBorrowed() + ")");
        }

        Borrower borrower = new Borrower(books);
        borrower.run();

    }
}