public class Book
{
    private String title;
    private String author;
    private boolean available;
    private int pages;
    public Book(String title, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        available = true;
    }
    @Override
    public String toString() {return title + ", " + author + ", " + pages + ", Available: " + available;}
}