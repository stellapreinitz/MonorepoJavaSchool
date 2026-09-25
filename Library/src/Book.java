public class Book
{
    private final String title;
    private final String author;
    private final boolean available;
    private final int pages;
    private final int index;
    Book(String title, String author, int pages, int index)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.index = index;
        available = true;
    }
    @Override
    public String toString() {return "Index: " + index + ". " + title + ", " + author + ", " + pages + ", Available: " + available;}
}