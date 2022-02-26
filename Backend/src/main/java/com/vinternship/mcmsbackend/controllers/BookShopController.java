package com.vinternship.mcmsbackend.controllers;


import com.vinternship.mcmsbackend.models.BookShop;
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

    @PostMapping("/bookshop")
    public ResponseEntity<BookShop> createBookShop(@RequestBody BookShop bookShop) {
        try {
            BookShop _bookShop = bookShopRepository.save(bookShop);
            return new ResponseEntity<>(_bookShop, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//
//    @PutMapping("/books/{id}")
//    public ResponseEntity<BookShop> updateAuthor(@PathVariable("id") String id, @RequestBody Book book) {
//        Optional<Book> bookData = bookShopRepository.findById(id);
//
//        if (bookData.isPresent()) {
//            Book _book = bookData.get();
//            _book.setTitle(book.getTitle());
//            _book.setPrice(book.getPrice());
//            _book.setAuthor(book.getAuthor());
//            _book.setGenre(book.getGenre());
//            _book.setYear_of_publishing(book.getYear_of_publishing());
//            _book.setPublishar(book.getPublishar());
//            return new ResponseEntity<>(bookRepository.save(_book), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/books/{id}")
//    public ResponseEntity<HttpStatus> deleteAuthor(@PathVariable("id") String id) {
//        try {
//            bookRepository.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @DeleteMapping("/books")
//    public ResponseEntity<HttpStatus> deleteAllAuthors() {
//        try {
//            bookRepository.deleteAll();
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/books/age/{age}")
//    public ResponseEntity<List<Book>> findByAuthorAge(@PathVariable("title") String title) {
//        try {
//            List<Book> books = bookRepository.findBookByTitle(title);
//
//            if (books.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity<>(books, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

}
