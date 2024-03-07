import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter your email address:");
        String emailAddress = scanner.nextLine();

        BookStore bookStore = new BookStore(firstName, lastName, emailAddress);
        System.out.println("Available books:");
        for (BookDetails book : BookDetails.values()) {
            System.out.println("Book ID: " + book.getBookID() + ", Name: " + book.getBookName());
            // Display other details if needed
        }
        System.out.println("Enter the book ID you want to order:");
        String bookID = scanner.nextLine();
        BookDetails selectedBook = bookStore.searchBook(bookID);
        if (selectedBook != null) {
            System.out.println("Book found!");
        } else {
            System.out.println("Book not found. Please try again.");
        }
        scanner.close();
    }
}

