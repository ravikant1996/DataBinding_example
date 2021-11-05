package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("The State of Grace", "Lois Twardowski", getDrawable(R.drawable.book_1)));
        bookList.add(new Book("Murder At The Rocks", "Jill Paterson", getDrawable(R.drawable.book_2)));
        bookList.add(new Book("Sleepless Part one", "Marc Layton", getDrawable(R.drawable.book_3)));
        bookList.add(new Book("Devil on Deck", "Madison Kent", getDrawable(R.drawable.book_4)));
        bookList.add(new Book("Dark Promise", "Julia Crane & Talia Jagger", getDrawable(R.drawable.book_5)));
        bookList.add(new Book("The Daniel Druids", "William Collins", getDrawable(R.drawable.book_6)));
        bookList.add(new Book("The Frights of Fiji", "Santayana Prasad", getDrawable(R.drawable.book_7)));
        bookList.add(new Book("Stubborn Ignite", "Hannah Parker", getDrawable(R.drawable.book_8)));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(bookList);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        binding.recyclerView.setAdapter(adapter);
    }
}
