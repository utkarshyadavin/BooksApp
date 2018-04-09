package com.example.utkarshyadavin.books;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDetails extends AppCompatActivity {

    private ImageView mImage ;
    private TextView mTitle ;
    private TextView mCategory ;
    private TextView mDescription ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);


        //Receive Data from intent
        Intent intent = getIntent() ;
        String title = intent.getExtras().getString("Title") ;
        String category = intent.getExtras().getString("Category") ;
        String description = intent.getExtras().getString("Description") ;
        int thumbnail = intent.getExtras().getInt("Thumbnail") ;

        initvies() ;

        mImage.setImageResource(thumbnail);
        mTitle.setText(title);
        mCategory.setText(category);
        mDescription.setText(description);

    }


    public void initvies() {
        mImage = (ImageView) findViewById(R.id.image) ;
        mTitle = (TextView) findViewById(R.id.title) ;
        mCategory = (TextView) findViewById(R.id.category) ;
        mDescription = (TextView) findViewById(R.id.description) ;
    }

}
