package com.improve10x.series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class SeriesActivity extends AppCompatActivity {
      public  SeriesItem[] seriesItems;
      public SeriesItemAdapter adapter;
      public ListView seriesItemsLv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        initViews();
        createData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        seriesItemsLv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new SeriesItemAdapter(this, android.R.layout.simple_list_item_1,seriesItems);

    }

    private void initViews() {
        seriesItemsLv = findViewById(R.id.seriesitems_lv);
    }

    public  void  createData(){
      seriesItems = new SeriesItem[2];
      SeriesItem item1 = new SeriesItem();
      item1.name = "Kung fu Panda";
      item1.imageUrl ="https://media.timeout.com/images/101527289/750/422/image.jpg";
      seriesItems[0] = item1;

      SeriesItem item2 = new SeriesItem();
      item2.name = "Harry Potter";
      item2.imageUrl = "https://uploads-ssl.webflow.com/618a73d35bc6ef04e7184abf/621cf2794d1c9f2c5e29036e_harry-potter.jpg";
      seriesItems[1] = item2;

    }
}