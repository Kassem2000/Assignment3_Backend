package com.example.Test_Uppgift.services;

import com.example.Test_Uppgift.models.BorrowedBooks;
import com.example.Test_Uppgift.repository.BorrowedbooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowedbooksServices {
    @Autowired
    private BorrowedbooksRepository borrowedBooksRepository;

    public BorrowedBooks addBorrowedBook(BorrowedBooks borrowedBooks) {    // POST Registrera en ny utlåning
        return borrowedBooksRepository.save(borrowedBooks);
    }

    public List<BorrowedBooks> getAllBorrowedBooks() {         // GET Hämta en lista över alla utlåningar
        return borrowedBooksRepository.findAll();
    }

    public Optional<BorrowedBooks> getBorrowedBookById(String id) {  // GET Hämta en specifik utlåning
        return borrowedBooksRepository.findById(id);
    }


    public BorrowedBooks updateBorrowedBook(BorrowedBooks borrowedBooks) {  // PUT Uppdatera en utlåning
        return borrowedBooksRepository.save(borrowedBooks);
    }

    public void deleteBorrowedBook(String id) {     // DELETE  Avsluta en utlåning
        borrowedBooksRepository.deleteById(id);
    }
}
