package com.improve10x.series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MoviesActivity extends AppCompatActivity {
      public MoviesItem[] moviesItems;
      public MoviesItemAdapter adapter;
      GridView moviesItemGv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
         initViews();
         createMoviesData();
         setupAdapter();
         connectAdapter();

    }

    private void connectAdapter() {
        moviesItemGv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new MoviesItemAdapter(this, android.R.layout.simple_list_item_1,moviesItems);
    }

    private void initViews() {
        moviesItemGv = findViewById(R.id.moviesitems_gv);
        moviesItemGv.setNumColumns(2);
    }

    private void createMoviesData() {
        moviesItems = new MoviesItem[6];
        MoviesItem item1 = new MoviesItem();
        item1.movieName = "Harry potter and the sorcerer's stone";
        item1.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220 ";
        moviesItems[0] = item1;

        MoviesItem item2 = new MoviesItem();
        item2.movieName = "Harry potter and chamber of Secretes";
        item2.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647 ";
        moviesItems[1] = item2;

        MoviesItem item3 = new MoviesItem();
        item3.movieName = "Harry potter and the prisoner of azkaban";
        item3.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg ";
        moviesItems[2] = item3;

        MoviesItem item4 = new MoviesItem();
        item4.movieName = "Harry potter and the sorcerer's stone";
        item4.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg ";
        moviesItems[3] = item4;

        MoviesItem item5 = new MoviesItem();
        item5.movieName = "Harry potter";
        item5.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg ";
        moviesItems[4] = item5;

        MoviesItem item6 = new MoviesItem();
        item6.movieName = "Harry potter and the sorcerer's stone";
        item6.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg ";
        moviesItems[5] = item6;
    }
}