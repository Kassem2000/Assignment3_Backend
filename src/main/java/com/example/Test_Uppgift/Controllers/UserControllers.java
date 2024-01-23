package com.example.Test_Uppgift.Controllers;

import com.example.Test_Uppgift.models.User;
import com.example.Test_Uppgift.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserControllers {
    @Autowired
    UserServices userServices;

    // POST
    @PostMapping()
    public User addUser(@RequestBody User user) {
        return userServices.addUser(user);
    }

    // GET ALL
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userServices.getAllUsers();
    }

    // GET BY ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserByID(@PathVariable String id) {
        return  userServices.getUserById(id);
    }

    // PUT
    @PutMapping()
    public User updateUser(@RequestBody User user) {
        return userServices.updateUser(user);
    }

    // DELETE
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id) {
        return userServices.deleteUser(id);
    }



}
