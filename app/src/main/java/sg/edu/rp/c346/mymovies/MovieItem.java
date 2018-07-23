package sg.edu.rp.c346.mymovies;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by 16038911 on 23/7/2018.
 */

// implements Serializable
public class MovieItem implements Serializable {
    private String title;
    private String year;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String in_theatre;
    private String description;
    private int rating_star;

    public MovieItem(String title, String year, String rated, String genre, Calendar watched_on, String in_theatre, String description, int rating_star) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
        this.rating_star = rating_star;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getDateString(){
        String str = watched_on.get(Calendar.DAY_OF_MONTH)+"/"+watched_on.get(Calendar.MONTH)+"/"+watched_on.get(Calendar.YEAR);
        return str;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating_star() {
        return rating_star;
    }

    public void setRating_star(int rating_star) {
        this.rating_star = rating_star;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", watched_on=" + watched_on +
                ", in_theatre='" + in_theatre + '\'' +
                ", description='" + description + '\'' +
                ", rating_star=" + rating_star +
                '}';
    }
}
