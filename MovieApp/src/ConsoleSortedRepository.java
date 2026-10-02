import java.util.ArrayList;
import java.util.Comparator;

public class ConsoleSortedRepository implements MovieRepository
{
    //Array stored here
    private final ArrayList<Movie> movies = new ArrayList<>();

    //Setter, adds movies to the array
    @Override
    public void add(Movie movie)
    {
        movies.add(movie);
    }

    //Getter, returns list to caller
    @Override
    public ArrayList<Movie> getAll()
    {
        movies.sort(Comparator.comparing(Movie::getTitle));
        return movies;
    }
}