import java.util.ArrayList;

/**
 * Created by Bruno Barrios on 7/7/2017.
 */
public class Movie {
    String name;
    ArrayList<Actor> actors;
    double rating;

    public Movie(String name, ArrayList<Actor> actors, double rating) {
        this.name = name;
        this.actors = actors;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
}
