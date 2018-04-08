package eg.gov.iti.moviesapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ahmed_Mokhtar on 4/8/2018.
 */

public class Movie {

    @SerializedName("title")
    private String movieTitle;

    @SerializedName("image")
    private String moviePosterURL;

    @SerializedName("rating")
    private double movieRating;

    @SerializedName("releaseYear")
    private int movieReleaseYear;

    @SerializedName("genre")
    private List<String> movieGenre;


    public Movie() {
    }

    public Movie(String movieTitle, String moviePosterURL, double movieRating, int movieReleaseYear, List<String> movieGenre) {
        this.movieTitle = movieTitle;
        this.moviePosterURL = moviePosterURL;
        this.movieRating = movieRating;
        this.movieReleaseYear = movieReleaseYear;
        this.movieGenre = movieGenre;
    }


    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMoviePosterURL() {
        return moviePosterURL;
    }

    public void setMoviePosterURL(String moviePosterURL) {
        this.moviePosterURL = moviePosterURL;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public int getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(int movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public String getMovieGenre() {
        StringBuilder builder = new StringBuilder();
        for (String type : movieGenre) {
            builder.append(type.concat(" "));
        }
        return builder.toString();
    }

    public void setMovieGenre(List<String> movieGenre) {
        this.movieGenre = movieGenre;
    }
}
