package com.vinternship.mcmsbackend.controllers;

import com.vinternship.mcmsbackend.models.Book;
import com.vinternship.mcmsbackend.models.BookShop;
import com.vinternship.mcmsbackend.repositories.BookRepository;
import com.vinternship.mcmsbackend.repositories.BookShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class BookShopController {
    @Autowired
   BookShopRepository bookShopRepository;

//    @GetMapping("/bookShop")
//    public ResponseEntity<List<BookShop>> getAllBookShop(@RequestParam(required = false) String shopName) {
//        try {
//            List<BookShop> bookShops = new ArrayList<BookShop>();
//
//            if (shopName == null) {
//                bookShopRepository.findAll().forEach(bookShops::add);
//            } else {
//                bookShopRepository.findBookByTitle(shopName).forEach(bookShops::add);
//            }
//
//            if (bookShops.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//            return new ResponseEntity <>(null, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//    @GetMapping("/bookshop/{id}")
//    public ResponseEntity<BookShop> getBookShopById(@PathVariable("id") String id) {
//        Optional<BookShop> bookShopData = bookShopRepository.findById(id);
//
//        if (bookData.isPresent()) {
//            return new ResponseEntity<>(bookData.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

}
