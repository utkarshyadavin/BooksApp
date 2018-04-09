package com.example.utkarshyadavin.books;

/**
 * Created by utkarshyadavin on 9/4/18.
 */

public class Book {

    private String Title ;
    private String Description ;
    private String Category ;
    private int Thumbnail ;

    public Book() {

    }

    public Book(String Title , String Description , String Category , int Thumbnail){

        this.Title = Title ;
        this.Category = Category ;
        this.Description = Description ;
        this.Thumbnail = Thumbnail ;

    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getCategory() {
        return Category;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
