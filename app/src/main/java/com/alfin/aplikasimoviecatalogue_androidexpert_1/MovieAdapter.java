package com.alfin.aplikasimoviecatalogue_androidexpert_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Movie> movies = new ArrayList<>();

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public MovieAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        }
        ViewHolder viewHolder = new ViewHolder(itemView);
        Movie movie = (Movie) getItem(position);
        viewHolder.bind(movie);
        return itemView;
    }

    private class ViewHolder{
        private TextView txtJudul;
        private TextView txtTanggal;
        private TextView txtDeskripsi;
        private ImageView imgGambar;
        ViewHolder(View view) {
            txtJudul = view.findViewById(R.id.tv_judul);
            txtTanggal = view.findViewById(R.id.tv_tgl_rilis);
            txtDeskripsi = view.findViewById(R.id.tv_deskripsi);
            imgGambar = view.findViewById(R.id.iv_gambar);
        }
        void bind(Movie movie) {
            txtJudul.setText(movie.getJudul());
            txtTanggal.setText(movie.getTanggal_rilis());
            txtDeskripsi.setText(movie.getDeskripsi());
            imgGambar.setImageResource(movie.getGambar());
        }
    }
}
