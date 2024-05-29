import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
    Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
    Book book3 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997);
    Book book4 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998);
    Book book5 = new Book("Pride and Prejudice", "Jane Austen", 1813);
    Book book6 = new Book("Sense and Sensibility", "Jane Austen", 1811);
    Book book7 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

    Library library = new Library();
    library.setLocation("Gulbene");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);
    library.addBook(book5);
    library.addBook(book6);
    library.addBook(book7);

    System.out.println("Library current book amount: " + library.librarySize(library));
    System.out.println("Library is located in " + library.getLocation());
    library.printBooks();

    System.out.println();
    System.out.println("You can search books by author. Type the author's name: ");
    Scanner scan = new Scanner(System.in);
    String author = scan.nextLine();
    library.printBooksByAuthor(library, author);
    scan.close();

    library.removeBook(book7);
    
  }
}
