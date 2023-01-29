package com.example.demo5.Controller;


import com.example.demo5.Pojo.Merchant;
import com.example.demo5.Service.Service_Merchant;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/merchant")
public class Controller_Merchant {
    private final Service_Merchant Service_Merchant;

    @GetMapping("/get")
    public ResponseEntity getMerchant() {
        ArrayList<Merchant> Merchants = Service_Merchant.getMerchant();
        return ResponseEntity.status(200).body(Merchants);

    }

    @PostMapping("/add")
    public ResponseEntity addMerchant(@Valid @RequestBody Merchant merchant, Errors errors) {
        if ( errors.hasErrors() ) {
            String msg = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);
        }
        Service_Merchant.addMerchant(merchant);
        return ResponseEntity.status(200).body("added done!");

    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateMerchant(@Valid @PathVariable int id, Merchant merchant, Errors errors) {
        if ( errors.hasErrors() ) {
            String msg = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);

        }
        Service_Merchant.updateMerchant(id, merchant);
        return ResponseEntity.status(200).body("updated done!");
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteMerchant(@PathVariable int id){
        Service_Merchant.deleteMerchant(id);
        return ResponseEntity.status(200).body("deleted done!");
    }
}