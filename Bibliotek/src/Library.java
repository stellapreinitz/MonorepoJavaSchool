import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books = new ArrayList<>();
    public Library()
    {
        books.add(new Book("1984", "George Orwell", 328));
        books.add(new Book("Brave New World", "Aldous Huxley", 268));
        books.add(new Book("Ray Bradbury", "Fahrenheit 451", 194));
    }
}