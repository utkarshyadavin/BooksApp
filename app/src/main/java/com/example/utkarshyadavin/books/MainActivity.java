package com.example.utkarshyadavin.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> myBooks ;
    private RecyclerView myview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBooks = new ArrayList<Book>() ;
        myBooks.add(new Book("The Vegetarian ", "ffdsafdsfds" , "Romance" , R.drawable.book1));
        myBooks.add(new Book("Badshah", "fdsfjdsdddddd" , "Romance" ,  R.drawable.book2));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Action" ,  R.drawable.book3));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Comedy" , R.drawable.book5));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Romance" , R.drawable.book6));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Drama" ,R.drawable.book7));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Drama" ,  R.drawable.book1));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Drama" ,  R.drawable.book2));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Drama" ,R.drawable.book7));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Drama" ,  R.drawable.book1));
        myBooks.add(new Book("The Vegetarian ", "fdsfjdskfdskf" , "Drama" ,  R.drawable.book2));

        myview = (RecyclerView) findViewById(R.id.recycler_view) ;
        BookRecylerAdapter myAdapter = new BookRecylerAdapter(this , myBooks) ;
        myview.setLayoutManager( new LinearLayoutManager(this));
        myview.setAdapter(myAdapter);
    }
}
