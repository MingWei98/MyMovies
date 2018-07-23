package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvmovie;
    ArrayList<MovieItem> alMovie;
    CustomAdapter caMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvmovie = findViewById(R.id.listViewMovies);

        alMovie = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2014,11,15);
        Calendar date2 = Calendar.getInstance();
        date2.set(2015,5,15);

        MovieItem m1 = new MovieItem("The Avengers", "2012", "pg13", "Action | Sci-Fi",
                date1, "Golden Village - Bishan",
                "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.",
                4);

        MovieItem m2 = new MovieItem("Planes", "2013", "pg", "Animation | Comedy",
                date2, "Cathay - AMK Hub",
                "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.",
                2);

        alMovie.add(m1);
        alMovie.add(m2);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovie);
        lvmovie.setAdapter(caMovie);

        lvmovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, MovieActivity.class);
                MovieItem movieselected = alMovie.get(i);
                // -- Serializable --
                // Bundle bundle = new Bundle();
                // bundle.putSerializable("value", alMovie);
                // intent.putExtras(bundle);
                // -- Serializable --
                intent.putExtra("title", movieselected.getTitle());
                intent.putExtra("year", movieselected.getYear());
                intent.putExtra("genre", movieselected.getGenre());
                intent.putExtra("desc", movieselected.getDescription());
                intent.putExtra("watchon", movieselected.getDateString());
                intent.putExtra("theater", movieselected.getIn_theatre());
                intent.putExtra("img", movieselected.getRated());
                intent.putExtra("rating", movieselected.getRating_star());
                startActivity(intent);

            }
        });

    }

}
