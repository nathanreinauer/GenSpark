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

    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
}