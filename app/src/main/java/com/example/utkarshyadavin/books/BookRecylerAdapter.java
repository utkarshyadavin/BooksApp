package com.example.utkarshyadavin.books;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by utkarshyadavin on 9/4/18.
 */

public class BookRecylerAdapter extends RecyclerView.Adapter<BookRecylerAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Book> mData ;

    public BookRecylerAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }




    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Return a newly generated ViewHolder
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext) ;
        view = mInflater.inflate(R.layout.cardview_books, parent , false) ;
        return new MyViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.book_title.setText(mData.get(position).getTitle());
        holder.book_image.setImageResource(mData.get(position).getThumbnail());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openBookIntent = new Intent(mContext , BookDetails.class) ;
                openBookIntent.putExtra("Title" , mData.get(position).getTitle()) ;
                openBookIntent.putExtra("Description" , mData.get(position).getDescription()) ;
                openBookIntent.putExtra("Thumbnail" , mData.get(position).getThumbnail()) ;
                openBookIntent.putExtra("Category" , mData.get(position).getCategory()) ;
                mContext.startActivity(openBookIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size() ;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView book_title ;
        ImageView book_image ;
        CardView cardview ;

        // Initializing a viewholder through a constructor
        public MyViewHolder(View itemView){
            super(itemView);
            book_title = (TextView) itemView.findViewById(R.id.book_title) ;
            book_image =(ImageView) itemView.findViewById(R.id.book_image) ;
            cardview = (CardView) itemView.findViewById(R.id.cardview) ;
        }
    }



}
