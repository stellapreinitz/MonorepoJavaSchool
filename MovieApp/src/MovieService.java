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
}