package com.alfin.aplikasimoviecatalogue_androidexpert_1;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int gambar;
    private String judul,tanggal_rilis,genre,deskripsi;

    public Movie() {
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal_rilis() {
        return tanggal_rilis;
    }

    public void setTanggal_rilis(String tanggal_rilis) {
        this.tanggal_rilis = tanggal_rilis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(gambar);
        dest.writeString(judul);
        dest.writeString(tanggal_rilis);
        dest.writeString(genre);
        dest.writeString(deskripsi);
    }

    protected Movie(Parcel in) {
        gambar = in.readInt();
        judul = in.readString();
        tanggal_rilis = in.readString();
        genre = in.readString();
        deskripsi = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
