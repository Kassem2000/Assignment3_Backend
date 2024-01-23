package com.example.Test_Uppgift.repository;

import com.example.Test_Uppgift.models.BorrowedBooks;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowedbooksRepository extends MongoRepository<BorrowedBooks, String> {

}
