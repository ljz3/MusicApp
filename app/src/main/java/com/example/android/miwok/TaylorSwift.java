package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TaylorSwift extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taylor_swift);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Invisible","3:24"));
        songs.add(new Song("Our Song", "3:22"));
        songs.add(new Song("Teardrops on my Guitar","3:37"));


        SongAdapter adapter = new SongAdapter(this,songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        Button back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helloIntent = new Intent(TaylorSwift.this,MainActivity.class);
                startActivity(helloIntent);
            }
        });
    }
}
