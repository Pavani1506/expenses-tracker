package com.expensetracker.expensetracker.Controller;

import com.expensetracker.expensetracker.Entity.User;
import com.expensetracker.expensetracker.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/User")
public class UserControler {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUserData")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User u1=userService.saveRecord(user);
        return new ResponseEntity<>(u1, HttpStatus.CREATED);
    }

    @GetMapping("/getUserdate/{name}")
    public ResponseEntity<User> getUser(@PathVariable String name){
        User u1=userService.getByName(name);
        return new ResponseEntity<>(u1,HttpStatus.OK);
    }

}
