package com.expensetracker.expensetracker.Controller;

import com.expensetracker.expensetracker.Entity.User;
import com.expensetracker.expensetracker.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @PatchMapping("/upUserPhoneNumber/{name}")
    public  ResponseEntity<User> updateUserPhoneNumber(@PathVariable String name,@RequestBody Map<String,Long> map){
        User u1=userService.updateByPhoneNumber(name,map.get("phoneNumber"));
        return new ResponseEntity<>(u1,HttpStatus.OK);
    }

    @GetMapping("/getallUserdata")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> u1=userService.getAllData();
        return new ResponseEntity<>(u1,HttpStatus.OK);
    }

    @PutMapping("/updateUserdetailsByName/{name}")
    public ResponseEntity<User> upDateUserByName(@PathVariable String name,@RequestBody User user){
        User u1=userService.updateUserDataByName(name,user);
        return new ResponseEntity<>(u1,HttpStatus.OK);
    }

}
