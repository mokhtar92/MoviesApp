package eg.gov.iti.moviesapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import eg.gov.iti.moviesapp.R;
import eg.gov.iti.moviesapp.model.Movie;

/**
 * Created by Ahmed_Mokhtar on 4/8/2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private List<Movie> movies;


    public MovieAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = movies.get(position);

        Picasso.get().load(movie.getMoviePosterURL()).into(holder.mainImageView);
        Picasso.get().load(movie.getMoviePosterURL()).into(holder.miniImageView);
        holder.movieTitle.setText(movie.getMovieTitle());
        holder.movieRating.setText(String.valueOf(movie.getMovieRating()));
        holder.movieReleaseYear.setText(String.valueOf(movie.getMovieReleaseYear()));
        holder.movieGenre.setText(movie.getMovieGenre());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.main_image_view)
        ImageView mainImageView;

        @BindView(R.id.mini_image_view)
        ImageView miniImageView;

        @BindView(R.id.movie_title_text_view)
        TextView movieTitle;

        @BindView(R.id.movie_rating_text_view)
        TextView movieRating;

        @BindView(R.id.movie_release_year_text_view)
        TextView movieReleaseYear;

        @BindView(R.id.movie_genre_text_view)
        TextView movieGenre;

        public MyViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
