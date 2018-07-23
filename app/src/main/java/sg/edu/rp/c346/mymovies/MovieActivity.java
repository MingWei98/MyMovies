package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class MovieActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView tvYear;
    TextView tvGenre;
    TextView tvDesc;
    TextView tvWatchOn;
    TextView tvTheater;
    ImageView ivRated;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        tvTitle = findViewById(R.id.textViewTitle);
        tvYear = findViewById(R.id.textViewYear);
        tvGenre = findViewById(R.id.textViewGenre);
        tvDesc = findViewById(R.id.textViewDesc);
        tvWatchOn = findViewById(R.id.textViewWatchOn);
        tvTheater = findViewById(R.id.textViewTheater);
        ivRated = findViewById(R.id.imageViewRating);
        ratingBar = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();

        // -- Serializable --
        // Bundle bundle = intentReceived.getExtras();
        // List<MovieItem> movies = (List<MovieItem>)bundle.getSerializable("value");
        // -- Serializable --

        String title = intentReceived.getStringExtra("title");
        tvTitle.setText(title);

        String year = intentReceived.getStringExtra("year");
        tvYear.setText(year);

        String genre = intentReceived.getStringExtra("genre");
        tvGenre.setText(" - " + genre);

        String desc = intentReceived.getStringExtra("desc");
        tvDesc.setText(desc);

        String watchon = intentReceived.getStringExtra("watchon");
        tvWatchOn.setText("Watch on: " + watchon);

        String theater = intentReceived.getStringExtra("theater");
        tvTheater.setText("In Theater: " + theater);

        String rated = intentReceived.getStringExtra("img");
        if (rated.equals("g")){
            ivRated.setImageResource(R.drawable.rating_g);
        }
        else if (rated.equals("pg")){
            ivRated.setImageResource(R.drawable.rating_pg);
        }
        else if (rated.equals("pg13")){
            ivRated.setImageResource(R.drawable.rating_pg13);
        }
        else if (rated.equals("nc16")){
            ivRated.setImageResource(R.drawable.rating_nc16);
        }
        else if (rated.equals("m18")){
            ivRated.setImageResource(R.drawable.rating_m18);
        }
        else{
            ivRated.setImageResource(R.drawable.rating_r21);
        }
        int ratingStar = intentReceived.getIntExtra("rating",0);
        ratingBar.setIsIndicator(true);
        ratingBar.setRating(ratingStar);

    }
}
