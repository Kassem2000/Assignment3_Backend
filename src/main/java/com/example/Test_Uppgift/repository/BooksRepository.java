package com.example.Test_Uppgift.repository;

import com.example.Test_Uppgift.models.Books;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Books, String> {

}
