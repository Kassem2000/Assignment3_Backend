package com.example.Test_Uppgift.services;

import com.example.Test_Uppgift.models.Books;
import com.example.Test_Uppgift.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServices {

    @Autowired
    BooksRepository booksRepository;

    public Books addBook(Books books) {         // POST Lägga till en ny book
        return booksRepository.save(books);
    }


    public List<Books> getAllBooks() {          // GET Hämta en lista över alla Böcker
        return booksRepository.findAll();
    }


    public Books getBookById(String id) {           // GET Hämta en specefik bok med dess ID
        return booksRepository.findById(id).get();
    }


    public Books updateBook(Books books) {       // PUT Uppdatera en befintlig boks information
        return booksRepository.save(books);
    }


    public String deleteBook(String id) {       // DELETE  Ta bort en bok
        booksRepository.deleteById(id);
        return "The book is deleted";
    }









}
