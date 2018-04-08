package eg.gov.iti.moviesapp.network;

import java.util.List;

import eg.gov.iti.moviesapp.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ahmed_Mokhtar on 4/8/2018.
 */

public interface Api {

    String BASE_URL = "https://api.androidhive.info/json/";

    @GET("movies.json")
    Call<List<Movie>> getAllMovies();
}
