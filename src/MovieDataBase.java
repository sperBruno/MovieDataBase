import java.util.ArrayList;

/**
 * Created by Bruno Barrios on 7/7/2017.
 */
public class MovieDataBase {
    ArrayList<Movie> movieList;
    ArrayList<Actor> actorList;

    public MovieDataBase() {
        this.movieList = new ArrayList<>();
        this.actorList = new ArrayList<>();
    }

    public void addMovie(String name, String[] actors ) {

    }
    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public ArrayList<Actor> getActorList() {
        return actorList;
    }
}
