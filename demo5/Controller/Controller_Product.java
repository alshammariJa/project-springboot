package com.example.demo5.Controller;

import com.example.demo5.Pojo.Product;
import com.example.demo5.Service.Service_Product;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.Errors;
import java.util.ArrayList;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")

public class Controller_Product {
    private final Service_Product Service_Product;



    @GetMapping("/get")
    public ResponseEntity getProducts(){
       ArrayList<Product>  Products=Service_Product.getProducts();
      return   ResponseEntity.status(200).body(Products);
    }


    @PostMapping("/add")
   public ResponseEntity addProducts( @Valid @RequestBody Product product ,Errors errors){
        if(errors.hasErrors()) {
             String msg=errors.getFieldError().getDefaultMessage();
             return ResponseEntity.status(400).body(msg);
        }
        Service_Product.addProducts(product);
        return  ResponseEntity.status(200).body("added done!");

   }

   @PutMapping("/update/{id}")
    public ResponseEntity updateProducts(@Valid @PathVariable int id, Product product , Errors errors){
        if ( errors.hasErrors()){
            String msg= errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);


        }
        Service_Product.updateProduct(id,product);
        return ResponseEntity.status(200).body("updated done!");


    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity  deleteProducts(@PathVariable int id){

       Service_Product.deleteProduct(id);
       return ResponseEntity.status(200).body("deleted done !");
    }



}
