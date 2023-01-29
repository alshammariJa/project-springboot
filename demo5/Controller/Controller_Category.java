package com.example.demo5.Controller;

import com.example.demo5.Pojo.Category;
import com.example.demo5.Service.Service_Category;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/Category")
public class Controller_Category {

    private final Service_Category  Service_Category;
    @GetMapping("/get")
    public ResponseEntity getCategory(){
        ArrayList<Category> Categories=Service_Category.getCategory();
        return ResponseEntity.ok(Categories);
    }

    @PostMapping("/add")
    public ResponseEntity  addCategory(@Valid @RequestBody Category category, Errors errors){
        if(errors.hasErrors()){
         String msg= errors.getFieldError().getDefaultMessage();

         return ResponseEntity.status(400).body(msg);
        }
        Service_Category.addCategory(category);
        return ResponseEntity.status(200).body("added done!");

    }


    @PutMapping("/update/{id}")
    public ResponseEntity updateCategory(@Valid @PathVariable int id ,Category category, Errors errors){
        if(errors.hasErrors()){
            String msg= errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);

        }
        Service_Category.updateCategory( id, category);
        return ResponseEntity.ok(category);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteCategory( @PathVariable int id)  {
        Service_Category.deleteCategory(id);
        return ResponseEntity.status(200).body("deleted done");
    }


}
