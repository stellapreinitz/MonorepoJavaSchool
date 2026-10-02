import java.util.ArrayList;

public class ConsoleMovieRepository implements MovieRepository
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
        return movies;
    }

}