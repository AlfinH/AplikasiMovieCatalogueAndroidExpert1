package com.alfin.aplikasimoviecatalogue_androidexpert_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter adapter;
    private String[] dataJudul;
    private String[] dataTanggal;
    private String[] dataDeskripsi;
    private TypedArray dataGambar;
    private ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lv_list);

        adapter = new MovieAdapter(this);
        listView.setAdapter(adapter);

        prepare();
        addItem();
    }

    private void addItem() {
        movies = new ArrayList<>();

        for (int i = 0; i < dataJudul.length; i++) {
            Movie movie = new Movie();
            movie.setGambar(dataGambar.getResourceId(i,1));
            movie.setJudul(dataJudul[i]);
            movie.setTanggal_rilis(dataTanggal[i]);
            movie.setDeskripsi(dataDeskripsi[i]);
            movies.add(movie);
        }

        adapter.setMovies(movies);
    }

    private void prepare() {
        dataJudul = getResources().getStringArray(R.array.judul_movie);
        dataTanggal = getResources().getStringArray(R.array.tgl_release_movie);
        dataDeskripsi = getResources().getStringArray(R.array.deskripsi_movie);
        dataGambar = getResources().obtainTypedArray(R.array.gambar_movie);
    }
}
