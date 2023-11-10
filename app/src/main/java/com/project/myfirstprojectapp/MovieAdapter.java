package com.project.myfirstprojectapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Movie> movies;

    MovieAdapter(Context context, List<Movie> movies){
        this.movies = movies;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.name.setText(movie.getName());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(Integer.toString(movie.getYear()));
        holder.rating.setText(Double.toString(movie.getRating()));
        holder.watchUrl.setText(movie.getWatchUrl());
        holder.posterUrl.setText(movie.getPosterUrl());


    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, genre, year, rating, posterUrl, watchUrl;

        public ViewHolder(View view){
            super(view);

            name = view.findViewById(R.id.name_txt);
            genre = view.findViewById(R.id.genre_txt);
            year = view.findViewById(R.id.year_txt);
            rating = view.findViewById(R.id.rating_txt);
            posterUrl = view.findViewById(R.id.posterUrl_txt);
            watchUrl = view.findViewById(R.id.watchUrl_txt);
        }

    }
}
