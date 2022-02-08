package com.vinternship.mcmsbackend.models;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "book")

public class Book {

    @Id
    private String id;
    private String title;
    private int price;
    private int year_of_publishing;
    private String author;
    private List<String> genre;
    private String publishar;
    @CreatedDate
    private Date registration;



   public Book (String id, String title, int price, int year_of_publishing, String author, List<String> genre,String publishar, Date registration){
        this.id = id;
        this.title = title;
        this.price = price;
        this.year_of_publishing = year_of_publishing;
        this.author = author;
        this.genre = genre;
       this.publishar = publishar;
        this.registration = registration;
        }



    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear_of_publishing() {
        return year_of_publishing;
    }

    public void setYear_of_publishing(int year_of_publishing) {
        this.year_of_publishing = year_of_publishing;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getPublishar() {
        return publishar;
    }
    public void setPublishar(String publishar) {
        this.publishar = publishar;
    }

    public Date getRegistration() {
        return registration;
    }

}


