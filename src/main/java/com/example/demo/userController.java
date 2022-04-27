package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class userController {
     @Autowired
    UserService userService;

    @GetMapping("/user")

    private List<user> getAllUser(){
        return userService.getAllUser();
    }

    @DeleteMapping("/user/{userID}")
    private void deleteUser(@PathVariable("userID") int userID)
    {
        userService.delete(userID);
    }

}