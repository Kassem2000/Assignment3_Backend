package com.example.Test_Uppgift.repository;

import com.example.Test_Uppgift.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
