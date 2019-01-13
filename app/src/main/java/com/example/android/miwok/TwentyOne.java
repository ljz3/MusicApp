package com.example.android.miwok;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TwentyOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twenty_one);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Rolling in the Deep","3:51"));
        songs.add(new Song("Set Fire to the Rain", "3:47"));
        songs.add(new Song("Lovesong","5:16"));


        SongAdapter adapter = new SongAdapter(this,songs);

        ListView listView = (ListView) findViewById(R.id.listTwo);

        listView.setAdapter(adapter);

        Button back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helloIntent = new Intent(TwentyOne.this,MainActivity.class);
                startActivity(helloIntent);
            }
        });
    }
}
