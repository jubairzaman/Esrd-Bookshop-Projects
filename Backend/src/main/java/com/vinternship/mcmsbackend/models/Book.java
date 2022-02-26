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
    private int yearofpublishing;
    private String author;
    private List<String> genre;
    private String publishar;
    @CreatedDate
    private Date registration;


    public Book(String title, int price, int yearofpublishing, String author, List<String> genre, String publishar) {
        this.title = title;
        this.price = price;
        this.yearofpublishing = yearofpublishing;
        this.author = author;
        this.genre = genre;
        this.publishar = publishar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getYearofpublishing() {
        return yearofpublishing;
    }

    public void setYearofpublishing(int yearofpublishing) {
        this.yearofpublishing = yearofpublishing;
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

    public void setRegistration(Date registration) {
        this.registration = registration;
    }
}


