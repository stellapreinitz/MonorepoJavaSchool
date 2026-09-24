import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library
{
    private ArrayList<Book> books = new ArrayList<>();
    public Library()
    {
        addBook("1984", "George Orwell", 328);
        addBook("Brave New World", "Aldous Huxley", 268);
        addBook("Ray Bradbury", "Fahrenheit 451", 194);
        addBook("Catch 22", "Joseph Heller", 453);
    }
    private void addBook(String title, String author, int pages)
    {
        int index = books.size();
        books.add(new Book(title, author, pages, index));
    }
    //method for handing out read-only access to ArrayList
    //trying to add objects to books from anywhere except library causes runtime error
    public List<Book> getBooks()
    {
        return Collections.unmodifiableList(books);
    }
}