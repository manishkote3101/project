package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    // This method is used to create a new user.
    @PostMapping
    void saveUser(@RequestBody Users user) {
        userService.saveUser(user);
        System.out.println("User created: " + user.getName());
    }

    // This method is used to get all users.
    @GetMapping
    Iterable<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    // This method is used to update an existing user by ID.
    @PutMapping("/{id}")
    void updateUser(@PathVariable int id, @RequestBody Users updatedUser) {
        userService.updateUser(id, updatedUser);
        System.out.println("User updated: " + updatedUser.getName());
    }

    // This method is used to delete a user by ID.
    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        System.out.println("User deleted with ID: " + id);
    }
}