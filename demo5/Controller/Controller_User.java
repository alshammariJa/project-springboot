package com.example.demo5.Controller;


import com.example.demo5.Pojo.MerchantStock;
import com.example.demo5.Pojo.User;

import com.example.demo5.Service.Service_MerchantStock;
import com.example.demo5.Service.Service_User;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class Controller_User {
//    private Service_MerchantStock Service_MerchantStock;
    private final Service_User  Service_User;

    @GetMapping("/get")
    public ResponseEntity getUser(){
        ArrayList<User> users =Service_User.getUser();
        return ResponseEntity.status(200).body(users);

    }

    @PostMapping("/add")
    public ResponseEntity addUser(@Valid @RequestBody User user, Errors errors){
        if(errors.hasErrors()) {
            String msg=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);
        }
        Service_User.addUser(user);
        return ResponseEntity.status(200).body("added done!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateUser(@Valid @PathVariable int id , User user, Errors errors){
        if ( errors.hasErrors()){
            String msg= errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);


        }
        Service_User.updateUser(id, user);
        return ResponseEntity.status(200).body("updated done!");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable int id){
        Service_User.deleteUser(id);
        return ResponseEntity.status(200).body("deleted done !");

    }

    @PostMapping("/user/add/product")
    public  ResponseEntity userAddProduct(@Valid @RequestBody MerchantStock merchantStock ,Errors errors){
        if(errors.hasErrors()){
            String msg= errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);
        }
        Service_User.userAddProduct("1","hh","gflghh");
        return ResponseEntity.status(200).body("added done!");

    }
}
