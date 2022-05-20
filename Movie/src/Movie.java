import java.util.ArrayList;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie(String _title, String _studio, String _rating)
    {
        title = _title;
        studio = _studio;
        rating = _rating;
    }

    public Movie(String _title, String _studio)
    {
        title = _title;
        studio = _studio;
        rating = "PG";
    }

    public static ArrayList<Movie> getPG(ArrayList<Movie> movies)
    {
        ArrayList<Movie> pgMovies = new ArrayList<Movie>();

        for(int i = 0; i < movies.size(); i++)
        {
            if(movies.get(i).rating == "PG")
            {
                pgMovies.add(movies.get(i));
            }
        }
        return pgMovies;
    }

    public static void main(String[] args)
    {
        Movie movie1 = new Movie("Casino Royale", "Ion Productions", "PG-13");
        Movie movie2 = new Movie("Jurassic Park", "Universal Studios", "PG-13");
        Movie movie3 = new Movie("E.T.", "Amblin Entertainment", "PG");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        ArrayList<Movie> pgMovies = getPG(movies);

        for(Movie movie : pgMovies)
        {
            System.out.println(movie.title + " is PG!");
        }
    }
}