package com.vinternship.mcmsbackend.models;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "book")

public class BookShop {

    @Id
    private String id;
    private String shopname;
    private int shop_number;
    private String Location;
    private List<String> books;
    private String contactNo;
    private String email;
    @CreatedDate
    private Date registration;



   public BookShop(String id, String title, int price, int year_of_publishing, String author, List<String> genre, String publishar, Date registration){
        this.id = id;
        this.shopname = shopname;
        this.shop_number = shop_number;
        this.Location = Location ;
        this.books = books;
        this.contactNo = contactNo;
       this.email = email;
        this.registration = registration;
        }

    public BookShop(String id, String shopname, int shop_number, String location, List<String> books,String ContactNo ,String email, Date registration) {

    }


    public String getId() {
        return id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public int getShop_number() {
        return shop_number;
    }

    public void setShop_number(int shop_number) {
        this.shop_number = shop_number;
    }


    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public String getContactNo() {
        return contactNo;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Date getRegistration() {
        return registration;
    }

    public void add() {
    }
}


