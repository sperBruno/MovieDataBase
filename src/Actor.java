import java.util.ArrayList;

/**
 * Created by Bruno Barrios on 7/7/2017.
 */
public class Actor {
    ArrayList<Movie> movies;

    String name;

    public Actor(ArrayList<Movie> movies, String name) {
        this.movies = movies;
        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

}
