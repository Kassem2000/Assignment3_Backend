package com.example.Test_Uppgift.services;

import com.example.Test_Uppgift.models.User;
import com.example.Test_Uppgift.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {        // POST Registrera ny användare
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {          // GET Hämta en lista över alla användare
        return userRepository.findAll();
    }

    public User getUserById(String id) {        // GET  Hämta en specifik användares information.
        return userRepository.findById(id).get();
    }

    public User updateUser(User user) {         // PUT Updatera en användares information
        return userRepository.save(user);   // FRÅGA HELENA OM DENNA ÄR KORREKT ELLER OM DET SKA ÄNDRAS VIA ID
    }

    public String deleteUser(String id) {       // DELETE  Ta bort en användare.
        userRepository.deleteById(id);
        return "User is deleted";
    }


}
