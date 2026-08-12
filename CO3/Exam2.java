import java.util.Scanner;

// 1. The Book Class
class Book {
    // Private data members as requested
    private int bookId;
    private String title;
    private String author;

    // Public method to read and store details
    public void setBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        this.bookId = sc.nextInt();
        sc.nextLine(); // Clear the buffer after reading an int!

        System.out.print("Enter Book Title: ");
        this.title = sc.nextLine();

        System.out.print("Enter Book Author: ");
        this.author = sc.nextLine();
    }

    // Getter methods so the BookUtility class can read the private data
    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}

// 2. The BookUtility Class
class BookUtility {
    // Public static method that accepts a Book object
    public static void displayBook(Book b) {
        System.out.println("Book ID: " + b.getBookId());
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("-------------------------");
    }
}

// 3. The Main Program
public class Exam2 {
    public static void main(String[] args) {
        // Step 1: Create two Book objects
        Book book1 = new Book();
        Book book2 = new Book();

        // Step 2: Accept and set the details of each book using setBook()
        System.out.println("--- Enter details for Book 1 ---");
        book1.setBook();

        System.out.println("\n--- Enter details for Book 2 ---");
        book2.setBook();

        // Step 3: Display details using the Expected Invocation format
        System.out.println("\n--- Library Inventory ---");
        BookUtility.displayBook(book1);
        BookUtility.displayBook(book2);
    }
}


