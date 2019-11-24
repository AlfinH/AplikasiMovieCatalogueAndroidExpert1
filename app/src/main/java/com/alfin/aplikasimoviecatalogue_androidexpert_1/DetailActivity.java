package com.alfin.aplikasimoviecatalogue_androidexpert_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgGambar = findViewById(R.id.iv_gambar_detail);
        TextView txtJudul = findViewById(R.id.tv_judul_detail);
        TextView txtTanggal = findViewById(R.id.tv_tanggal_detail);
        TextView txtGenre = findViewById(R.id.tv_genre_detail);
        TextView txtDeskripsi = findViewById(R.id.tv_deskripsi_detail);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        imgGambar.setImageResource(movie.getGambar());
        txtJudul.setText(movie.getJudul());
        txtTanggal.setText(movie.getTanggal_rilis());
        txtGenre.setText(movie.getGenre());
        txtDeskripsi.setText(movie.getDeskripsi());
    }
}
