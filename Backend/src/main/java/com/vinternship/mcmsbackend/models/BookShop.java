package com.vinternship.mcmsbackend.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "bookShop")

public class BookShop {

    @Id
    private String id;
    private String shopName;
    private int shopNumber;
    private String location;
    private List<String> books;
    private String contactNo;
    private String email;
    @CreatedDate
    private Date registration;


    public BookShop(String id, String shopName, int shopNumber, String location,List<String> books, String contactNo, String email, Date registration) {
        this.id = id;
        this.shopName = shopName;
        this.shopNumber = shopNumber;
        this.location = location;
        this.books = books;
        this.contactNo = contactNo;
        this.email = email;
        this.registration = registration;
    }

    public BookShop(String shopName) {
        this.shopName = shopName;
    }


    public String getId() {
        return id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(int shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistration() {
        return registration;
    }

    public void add() {
    }
}

