import java.util.ArrayList;
import java.util.Scanner;

public class Borrower {
    private ArrayList<Book> library;

    public Borrower(ArrayList<Book> library) {
        this.library = library;
    }

    private Book findBook(String title) {
        for (Book b: library) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a book title to borrow (or 'done' to stop): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            Book found = findBook(input);

            if (found == null) {
                System.out.println("No book found with that title.");
            } else if (found.isBorrowed()) {
                System.out.println("Sorry, \"" + found.getTitle() + "\" is already borrowed.");
            } else {
                found.borrow();
                System.out.println("You borrowed " + found.getTitle() + ".");
            }
        }
    }
}