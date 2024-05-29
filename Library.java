import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {

  public ArrayList<Book> books;

  public String location;

  public Library() {
    this.books = new ArrayList<Book>();
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getLocation(){
    return this.location;
  }

  public void addBook(Book book) {
    this.books.add(book);
  }

  public void removeBook(Book book) {
    this.books.remove(book);
    System.out.println(book.title + " has been removed from the library");
  }

  public void printBooks() {
    System.out.println("This is a list of the available books: ");
    for (Book book : this.books) {
      System.out.println(book.title + " by " + book.author + " published in " + book.publishingYear);
    }
  }

  public void printBooksByAuthor(Library library, String author) {
    System.out.println("This is the list of books we have by " + author + ": ");
    books
      .stream()
      .filter(book -> book.author.equals(author))
      .forEach(book -> System.out.println(book.title));
  }
  
  public int librarySize(Library library) {
  return library.books.size();
  }  
}
