import java.util.ArrayList;

public class MovieApp
{
    static void main(String[] args)
    {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new FeatureFilm("Shrek 2", 93, "animation"));
        movies.add(new Documentary("Fee Solo", 100, "extreme sport"));
        movies.add(new FeatureFilm("Shawshank Redemption", 140, "drama"));
        movies.add(new FeatureFilm("American Grafitti", 110, "drama"));
        movies.add(new FeatureFilm("Alien", 117, "horror"));

        System.out.println("Short movies: ");
        for (Movie movie : movies)
        {
            if (!movie.isLong())
            System.out.println(movie.describe());
        }
        System.out.println("Long movies: ");
        for (Movie movie : movies)
        {
            if (movie.isLong())
            System.out.println(movie.describe());
        }
    }
}