import java.util.ArrayList;

public class MovieApp
{
    static void main(String[] args)
    {
        MovieRepository movieRepository = new ConsoleSortedRepository(); //Create storage instance
        MovieService movieService = new MovieService(movieRepository);  //sends instance to service

        movieService.addMovie(new FeatureFilm("Shrek 2", 93, "animation"));
        movieService.addMovie(new Documentary("Free Solo", 100, "extreme sport"));
        movieService.addMovie(new FeatureFilm("Shawshank Redemption", 140, "drama"));
        movieService.addMovie(new FeatureFilm("American Grafitti", 110, "drama"));
        movieService.addMovie(new FeatureFilm("Alien", 117, "horror"));

        movieService.printAllMovies();
        System.out.println("Number of movies: " + movieService.getMovieCount());

        movieService.printMoviesMatching("ien");
        movieService.printMoviesMatching("SH");
        movieService.printMoviesMatching("ei");

        System.out.println(movieService.countMoviesMatching("a"));

        movieService.(0);
    }
}