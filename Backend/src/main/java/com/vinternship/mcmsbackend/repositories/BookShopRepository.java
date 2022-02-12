package com.vinternship.mcmsbackend.repositories;


import com.vinternship.mcmsbackend.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookShopRepository extends MongoRepository<Book, String> {
    List<Book> findBookByTitle(String title);
    List<Book> findBookByAuthor(String author);
}
