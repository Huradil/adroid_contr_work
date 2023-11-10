package com.project.myfirstprojectapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private ArrayList<Movie> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeData();
        recView = findViewById(R.id.recView);
        MovieAdapter movieAdapter = new MovieAdapter(this, movies);
        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(movieAdapter);
        }

    private void initializeData(){
        movies.add(new Movie("Furry", "action", 2015, 5.0, "http.poster1", "http.movie1"));
        movies.add(new Movie("Interstellar", "sky fiction", 2017, 5.0, "http.poster2", "http.movie2"));
        movies.add(new Movie("War", "documentation", 2018, 3.0, "http.poster3", "http.movie3"));
        movies.add(new Movie("God Of War", "fantasy", 2019, 4.0, "http.poster4", "http.movie4"));
        movies.add(new Movie("Red apple", "action", 2020, 5.0, "http.poster5", "http.movie5"));
    }

}


