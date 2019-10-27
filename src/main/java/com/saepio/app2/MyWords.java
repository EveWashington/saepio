package com.saepio.app2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MyWords extends Activity {
    private RecyclerView recyclerView;
//    private RecyclerView.LayoutManager ;
    public ArrayList<Word> wordList = new ArrayList<Word>();
    private RecyclerView.Adapter mAdapter;

    public void add(String M, String p, String l){
        Word a = new Word(M, p, l);
        wordList.add(a);
        mAdapter.notifyDataSetChanged();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        recyclerView = findViewById(R.id.my_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        mAdapter = new MyAdapter(wordList);
        recyclerView.setAdapter(mAdapter);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setAdapter(mAdapter);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        add("a", "b", "c");
        add("a", "b", "c");
        add("a", "b", "c");
        add("a", "b", "c");
        add("a", "b", "c");
        // use a linear layout manager
        //layoutManager = new LinearLayoutManager(this);
        //recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        //mAdapter = new MyAdapter(this, wordList);
        ;
    }


    // ...
}