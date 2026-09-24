public class Book
{
    private String title;
    private String author;
    private boolean available;
    private int pages;
    private int index;
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