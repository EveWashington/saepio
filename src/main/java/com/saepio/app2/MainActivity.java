package com.saepio.app2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    //private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Word> wordList = new ArrayList<Word>(Arrays.asList(new Word("a", "b", "c"), new Word("a", "b", "c"), new Word("a", "b", "c")));

    public void add(Word word) {
        wordList.add(word);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.my_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        mAdapter = new MyAdapter(wordList);
        recyclerView.setAdapter(mAdapter);

        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setAdapter(mAdapter);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myIntent = new Intent(view.getContext(), MyWords.class);
//                startActivityForResult(myIntent, 0);}});

        add(new Word("a", "b", "c"));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Record.class);
                startActivityForResult(myIntent, 0);
            }
        });

        CardView one = findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPlaying1();
            }
        });
        CardView two = findViewById(R.id.one);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPlaying2();
            }
        });
        CardView three = findViewById(R.id.one);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPlaying3();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private MediaPlayer player;


    public void startPlaying1() {
        player = MediaPlayer.create(this, R.raw.one);
//        try {
//            player.setDataSource("Internal storage/Android/data/com.saepio.app2/cache/Sun Oct 27 05:37:50 EDT 2019audiorecord.3gp");
//            //player.prepare();
//            player.start();
//        } catch (IOException e) {
//            Log.e("1", "prepare() failed");
//        }
//    }
    }

    public void startPlaying2() {
        player = new MediaPlayer();
        try {
            player.setDataSource("Internal storage/Android/data/com.saepio.app2/cache/Sun Oct 27 05:37:33 EDT 2019audiorecord.3gp");
            //player.prepare();
            player.start();
        } catch (IOException e) {
            Log.e("2", "prepare() failed");
        }
    }
    public void startPlaying3() {
        player = new MediaPlayer();
        try {
            player.setDataSource("Internal storage/Android/data/com.saepio.app2/cache/Sun Oct 27 05:36:41 EDT 2019audiorecord.3gp");
          //  player.prepare();
            player.start();
        } catch (IOException e) {
            Log.e("3", "prepare() failed");
        }
    }

    private void stopPlaying() {
        player.release();
        player = null;
    }

}


//    public void recordAudio(View v) {
//        String filePath = Environment.getExternalStorageDirectory() + "/recorded_audio.wav";
//        int color = getResources().getColor(R.color.colorPrimaryDark);
//        int requestCode = 0;
//
//        AndroidAudioRecorder.with(this);
//        AndroidAudioRecorder.setFilePath(filePath);
//        AndroidAudioRecorder.setColor(color);
//        AndroidAudioRecorder.setRequestCode(requestCode);
//        // Start recording
//        AndroidAudioRecorder.record();

//    String filePath = Environment.getExternalStorageDirectory() + "/recorded_audio.wav";
//    int color = getResources().getColor(R.color.colorPrimaryDark);
//    int requestCode = 0;
//    //AndroidAudioRecorder.with(this)
//        // Required
//    AndroidAudioRecorder.setFilePath(filePath);
//    AndroidAudioRecorder.setColor(color);
//    AndroidAudioRecorder.setRequestCode(requestCode);
//    // Start recording
//    AndroidAudioRecorder.record();

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 0) {
//            if (resultCode == RESULT_OK) {
//                // Great! User has recorded and saved the audio file
//            } else if (resultCode == RESULT_CANCELED) {
//                // Oops! User has canceled the recording
//            }
//        }
//    }

