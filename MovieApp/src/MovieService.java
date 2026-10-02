import java.util.ArrayList;

public class MovieService
{
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository)
    {
        this.movieRepository = movieRepository;
    }
    public void printAllMovies()
    {
        ArrayList<Movie> movies = movieRepository.getAll();
        for (Movie movie : movies)
        {
            System.out.println(movie.describe());
        }
    }
    public void addMovie(Movie movie)
    {
        movieRepository.add(movie);
    }
    public int getMovieCount()
    {
        return movieRepository.getAll().size();
    }
    public void printMoviesMatching(String searchText)
    {
        boolean filmFound = false;
        ArrayList<Movie> movies = movieRepository.getAll();
        for (Movie movie : movies)
        {
            if (movie.getTitle().toLowerCase().contains(searchText.toLowerCase()))
            {
                System.out.println(movie.getTitle());
                filmFound = true;
            }
        }
        if (!filmFound)
        {
            System.out.println("No films matching search string.");
        }
    }
    public int countMoviesMatching(String searchText)
    {
        int count = 0;
        ArrayList<Movie> list = movieRepository.getAll();
        for (Movie movie : list)
        {
            if (movie.getTitle().toLowerCase().contains(searchText.toLowerCase()))
            {
                count++;
            }
        }
        return count;
    }
}