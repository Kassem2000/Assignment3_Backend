package com.example.Test_Uppgift.Controllers;

import com.example.Test_Uppgift.models.BorrowedBooks;
import com.example.Test_Uppgift.services.BorrowedbooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/borrowedbooks")
public class BorrowedbooksControllers {

    @Autowired
    private BorrowedbooksServices borrowedbooksServices;

    // POST
    @PostMapping()
    public ResponseEntity<BorrowedBooks> addBorrowedBook(@RequestBody BorrowedBooks borrowedBooks) { // TESTAD
        BorrowedBooks addBook = borrowedbooksServices.addBorrowedBook(borrowedBooks);
        return new ResponseEntity<>(addBook, HttpStatus.CREATED);
    }

    // GET ALL
    @GetMapping("/all")
    public List<BorrowedBooks> getAllBorrowedBooks() {
        return borrowedbooksServices.getAllBorrowedBooks();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<BorrowedBooks> getBorrowedBookById(@PathVariable String id) {
        Optional<BorrowedBooks> borrowedBooks = borrowedbooksServices.getBorrowedBookById(id);
        return borrowedBooks.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // PUT
    @PutMapping()
    public ResponseEntity<BorrowedBooks> updateBorrowedBook(@RequestBody BorrowedBooks borrowedBooks) {
        BorrowedBooks updatedBook = borrowedbooksServices.updateBorrowedBook(borrowedBooks);
        return ResponseEntity.ok(updatedBook);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBorrowedBook(@PathVariable String id) {
        borrowedbooksServices.deleteBorrowedBook(id);
        return ResponseEntity.ok("The order is deleted");
    }

}
