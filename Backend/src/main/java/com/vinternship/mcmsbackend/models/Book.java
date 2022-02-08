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
    private String name;
    private int age;
    private String phone;
    private String email;
    private List<String> genre;
    @CreatedDate
    private Date registration;
}
