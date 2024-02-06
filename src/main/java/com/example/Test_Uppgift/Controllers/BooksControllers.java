package com.example.Test_Uppgift.Controllers;

import com.example.Test_Uppgift.models.Books;
import com.example.Test_Uppgift.services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/books")
public class BooksControllers {

    @Autowired
    BooksServices booksServices;

    // POST
    @PostMapping()
    public Books addBook(@RequestBody Books books) {
        return booksServices.addBook(books);
    }

    // GET ALL
    @GetMapping("/all")
    public List<Books> getAllBooks() {
        return booksServices.getAllBooks();
    }

    // GET BY ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Books getBookByID(@PathVariable String id) {
        return booksServices.getBookById(id);
    }

    // PUT
    @PutMapping()
    public Books updateBook(@RequestBody Books books) {
        return booksServices.updateBook(books);
    }

    // DELETE
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable String id) {
        return booksServices.deleteBook(id);
    }
}
