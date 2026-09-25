public class User
{
    private final String name;
    private final String userID;;
    private String[] borrowedBooks = new String[5];
    private int numberOfBooks;
    public User(String name, String userID)
    {
        this.name = name;
        this.userID = userID;
        numberOfBooks = 0;
    }
    @Override
    public String toString() {return name + "\nuserID: " + userID + "\nNumber of borrowed books: " + numberOfBooks;}
}