package com.improve10x.series;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class MoviesItemAdapter extends ArrayAdapter<MoviesItem> {
    public MoviesItemAdapter(@NonNull Context context, int resource, @NonNull MoviesItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MoviesItem movie = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.movies_item,parent,false);
        TextView tittleTxt = view.findViewById(R.id.tittle_txt);
        tittleTxt.setText(movie.movieName);
        ImageView imageIv = view.findViewById(R.id.movies_iv);
        Picasso.get().load(movie.imageUrl).into(imageIv);
        return view;
    }
}
