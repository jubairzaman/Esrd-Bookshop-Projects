package com.vinternship.mcmsbackend.repositories;


import com.vinternship.mcmsbackend.models.Book;
import com.vinternship.mcmsbackend.models.BookShop;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookShopRepository extends MongoRepository<BookShop, String> {

}
